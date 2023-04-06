package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

// -------------------------------------PronosticoDeportivo-------------------------------------UTN-------------------------------------ArgentinaPrograma4.0-------------------------------------//
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Collection<Partido> partidos = new ArrayList<Partido>();
        Collection<Ronda> rondas = new ArrayList<Ronda>();
        HashMap<String, Persona> personas = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader(fileName));
        int i = 1;

        //Resultaodos
        for (String[] line : reader) {
            System.out.print("el resultado del partido " + i + " fue: ");
            Equipo equipo1 = new Equipo(line[2]);
            Equipo equipo2 = new Equipo(line[7]);
            Partido partido = new Partido(equipo1, equipo2);
            partido.setGolesEquipo1(Integer.parseInt(line[4]));
            partido.setGolesEquipo2(Integer.parseInt(line[5]));
            partidos.add(partido);
            System.out.println(equipo1.getNombre() + " " + partido.getGolesEquipo1() + " " + partido.getGolesEquipo2() + " " + equipo2.getNombre());
            i++;
            Ronda ronda = new Ronda(line[0], partidos.toArray(new Partido[0]));
            rondas.add(ronda);
        }
        System.out.println("-----------------------------------------------------------------");
        //---------------------------------------------------------------------------------------//
        String pronosticos = args[1];
        int puntos = 0; // total puntos pesona
        CSVReader reader1 = new CSVReader(new FileReader(pronosticos));
        int i1 = 1;
        for (String[] line2 : reader1) {
            i1++;

            Equipo equipo1 = new Equipo(line2[2]);
            Equipo equipo2 = new Equipo(line2[6]);
            Partido partido = new Partido(equipo1, equipo2);
            Persona persona = new Persona(line2[0], line2[1]);
            String clave = persona.getId() + persona.getNombre();

            if (!personas.containsKey(clave)) {
                personas.put(clave, persona);
                System.out.println(persona.getNombre());

                for (Partido partidoCol : partidos) {
                    if (partidoCol.getEquipo1().getNombre(
                    ).equals(equipo1.getNombre())
                            && partidoCol.getEquipo2().getNombre(
                    ).equals(equipo2.getNombre())) {
                        partido = partidoCol;
                    }
                }
                Equipo equipo = null;
                ResultadoEnum resultados = null;
                if ("X".equals(line2[3])) {
                    System.out.println("usted aposto por: " + equipo1.getNombre());
                    equipo = equipo1;
                    resultados = ResultadoEnum.ganador;
                }
                if ("X".equals(line2[4])) {
                    System.out.println("usted aposto por un empate entre: " + equipo1.getNombre() + " y " + equipo2.getNombre());
                    equipo = equipo1;
                    resultados = ResultadoEnum.empate;
                }
                if ("X".equals(line2[5])) {
                    System.out.println("usted aposto por: " + equipo2.getNombre());
                    equipo = equipo1;
                    resultados = ResultadoEnum.perdedor;
                }

                Pronostico pronostico = new Pronostico(partido, equipo, resultados);
                puntos += pronostico.puntos();
            }
            //---------------------------------------------------------------------------------------//
            System.out.println("-----------------------------------------------------------------");
            System.out.print("los puntos obtenido son: " + puntos);
            System.out.println(" ");
        }
    }
}





