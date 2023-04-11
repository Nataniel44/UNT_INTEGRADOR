package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// -------------------------------------PronosticoDeportivo-------------------------------------UTN-------------------------------------ArgentinaPrograma4.0-------------------------------------//
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Collection<Partido> partidos = new ArrayList<Partido>();
        Collection<Ronda> rondas = new ArrayList<Ronda>();
        CSVReader reader = new CSVReader(new FileReader(fileName));
        int i = 1;

        //Resultaodos
        for (String[] line : reader) {
            Equipo equipo1 = new Equipo(line[2]);
            Equipo equipo2 = new Equipo(line[7]);
            Partido partido = new Partido(equipo1, equipo2);
            partido.setGolesEquipo1(Integer.parseInt(line[4]));
            partido.setGolesEquipo2(Integer.parseInt(line[5]));
            partidos.add(partido);
            Ronda ronda = new Ronda(line[0], partidos.toArray(new Partido[0]));
            rondas.add(ronda);
            System.out.print("el resultado del partido " + i +" en la ronda " + ronda.getNro() +" fue: ");
            System.out.println(equipo1.getNombre() + " " + partido.getGolesEquipo1() + " - " + partido.getGolesEquipo2() + " " + equipo2.getNombre());
            i++;
        }
        System.out.println("-----------------------------------------------------------------");
        //---------------------------------------------------------------------------------------//
        //---------------------------------------------------------------------------------------//
        String pronosticosFile = args[1];
        Map<String, Persona> personas = new HashMap<>();
        // Leer el archivo de pronósticos
        CSVReader reader2 = new CSVReader(new FileReader(pronosticosFile));
        for (String[] line : reader2) {
            String personaId = line[0];
            String personaNombre = line[1];
            Equipo equipo1 = new Equipo(line[2]);
            Equipo equipo2 = new Equipo(line[6]);
            Partido partido = null;

            // Buscar el partido correspondiente a los equipos en el archivo de resultados
            for (Partido partidoCol : partidos) {
                if (partidoCol.getEquipo1().getNombre().equals(equipo1.getNombre())
                        && partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())) {
                    partido = partidoCol;
                    break;
                }
            }

            // Si no se encontró el partido correspondiente, pasar al siguiente pronóstico
            if (partido == null) {
                continue;
            }

            // Obtener o crear la persona correspondiente al pronóstico
            String personaKey = personaId + personaNombre;
            Persona persona = personas.get(personaKey);
            if (persona == null) {
                persona = new Persona(personaId, personaNombre);
                personas.put(personaKey, persona);
            }

            // Realizar el pronóstico
            Equipo equipo = null;
            ResultadoEnum resultado = null;
            if ("X".equals(line[3])) {
                System.out.println(persona.getNombre() + " aposto por: " + equipo1.getNombre());
                equipo = equipo1;
                resultado = ResultadoEnum.ganador;
            }
            if ("X".equals(line[4])) {
                System.out.println(persona.getNombre() + " aposto por un empate entre: " + equipo1.getNombre() + " y " + equipo2.getNombre());
                equipo=equipo1;
                resultado = ResultadoEnum.empate;
            }
            if ("X".equals(line[5])) {
                System.out.println(persona.getNombre() + " aposto por: " + equipo2.getNombre());
                equipo = equipo2;
                resultado = ResultadoEnum.ganador;
            }

            Pronostico pronostico = new Pronostico(partido, persona, equipo, resultado);
            persona.agregarPronostico(pronostico);
            }
            //---------------------------------------------------------------------------------------//

            // Calcular los puntajes para cada persona y mostrar los resultados
            System.out.println("-----------------------------------------------------------------");
            for (Persona persona : personas.values()) {
                int puntos = persona.getPuntaje();
                System.out.println(persona.getNombre() + " obtuvo " + puntos + " puntos.");
            System.out.println("-----------------------------------------------------------------");
        }
    }
}






