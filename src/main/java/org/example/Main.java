package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
// -------------------------------------PronosticoDeportivo-------------------------------------UTN-------------------------------------ArgentinaPrograma4.0-------------------------------------//
    public class Main {
        public static void main(String[] args) throws IOException, CsvValidationException {
            String fileName = "C:\\Users\\Nata44\\Desktop\\UTN\\TPintegrador\\123.csv";
            CSVReader reader = new CSVReader(new FileReader(fileName));
            String[] line;
            if ((line = reader.readNext()) != null) {
                // Crear objeto Equipo a partir de la línea leída
                Equipo equipo1 = new Equipo(Integer.parseInt(line[0]), // id
                        line[1], // nombreEquipo
                        Integer.parseInt(line[3])); // golesEquipo1
                Equipo equipo2 = new Equipo(
                        Integer.parseInt(line[5]),
                        line[5].toString(),
                        Integer.parseInt(line[4]));
                if ((line = reader.readNext()) != null) {
                    // Crear objeto Equipo a partir de la línea leída
                    Equipo equipo3 = new Equipo(
                            Integer.parseInt(line[0]), // id
                            line[1], // equipoLocal
                            Integer.parseInt(line[3])); // tipoEquipoLocal
                    Equipo equipo4 = new Equipo(
                            Integer.parseInt(line[5]),
                            line[6],
                            Integer.parseInt(line[4]));

                    //crea la el objeto partido1 que es Polonia - Mexico
                    Partido partido2 = new Partido(equipo3, equipo4, equipo3.getGoles(), equipo4.getGoles());
                    System.out.println(partido2.resultado());
                    }
                //---------------------------------------------------------------------------------------//
                //crea la el objeto partido1 que es Argentina - Arabia Saudita
                Partido partido1 = new Partido(equipo1, equipo2, equipo1.getGoles(), equipo2.getGoles());

                }
                reader.close();

            }
        }


