package org.example;

import com.opencsv.CSVReader;

import java.util.Collection;

public class pro {
    public static void leerPronosticos(String pronosticos, Collection<Pronostico> pronosticosPersona, Collection<Partido> partidos) throws IOException {
    CSVReader reader = new CSVReader(new FileReader(pronosticos));
    int i = 1;
    for (String[] line : reader) {
        Equipo equipo1 = new Equipo(line[2]);
        Equipo equipo2 = new Equipo(line[7]);
        Partido partido = null;
        for (Partido p : partidos) {
            if (p.getEquipo1().getNombre().equals(equipo1.getNombre()) && p.getEquipo2().getNombre().equals(equipo2.getNombre())) {
                partido = p;
                break;
            }
        }
        if (partido != null) {
            Persona persona = new Persona(line[0], line[1]);
            Equipo seleccion = null;
            ResultadoEnum resultado = null;
            if (line[3].equals("X")) {
                seleccion = equipo1;
                resultado = ResultadoEnum.ganador;
            } else if (line[4].equals("X")) {
                seleccion = null;
                resultado = ResultadoEnum.empate;
            } else if (line[5].equals("X")) {
                seleccion = equipo2;
                resultado = ResultadoEnum.perdedor;
            }
            Pronostico pronostico = new Pronostico(partido, persona, seleccion, resultado);
            pronosticosPersona.add(pronostico);
        } else {
            System.out.println("No se encontró el partido correspondiente al pronóstico: " + line[2] + " vs " + line[7]);
        }
        i++;
    }
}

}

