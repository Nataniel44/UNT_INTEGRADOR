package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

// -------------------------------------PronosticoDeportivo-------------------------------------UTN-------------------------------------ArgentinaPrograma4.0-------------------------------------//
public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Collection<Partido> partidos = new ArrayList<Partido>();
        CSVReader reader = new CSVReader(new FileReader(fileName));
        int i = 1;
        for (String[] line : reader) {
            System.out.print("el resultado del partido " + i + " fue: ");
            Equipo equipo1 = new Equipo(line[1]);
            Equipo equipo2 = new Equipo(line[6]);
            Partido partido = new Partido(equipo1, equipo2);
            partido.setGolesEquipo1(Integer.parseInt(line[3]));
            partido.setGolesEquipo2(Integer.parseInt(line[4]));
            partidos.add(partido);
            System.out.println(equipo1.getNombre() + " " + partido.getGolesEquipo1() + " " + partido.getGolesEquipo2() + " " + equipo2.getNombre());
            i++;
        }
        System.out.println("-----------------------------------------------------------------");
        //---------------------------------------------------------------------------------------//
        String pronosticos = args[1];
        int puntos = 0; // total puntos pesona
        CSVReader reader1 = new CSVReader(new FileReader(pronosticos));
        int i1 = 1;
        for (String[] line2 : reader1) {
            i1++;
            Equipo equipo1 = new Equipo(line2[0]);
            Equipo equipo2 = new Equipo(line2[4]);
            Partido partido = new Partido(equipo1, equipo2);
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
            if ("X".equals(line2[1])) {
                System.out.println("usted aposto por: " + equipo1.getNombre());
                equipo = equipo1;
                resultados = ResultadoEnum.ganador;
            }
            if ("X".equals(line2[2])) {
                System.out.println("usted aposto por un empate entre: " + equipo1.getNombre() + " y " + equipo2.getNombre());
                equipo = equipo1;
                resultados = ResultadoEnum.empate;
            }
            if ("X".equals(line2[3])) {
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





