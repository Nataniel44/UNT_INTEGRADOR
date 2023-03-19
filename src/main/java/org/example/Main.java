package org.example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            LectorCSV lector = new LectorCSV("C:\\Users\\Nata44\\Desktop\\UTN\\TPintegrador\\resultados.csv");
            // Leer la primera fila
            Equipo equipo1 = lector.leerLinea();
            System.out.println(equipo1.getIdEquipo1());
            // ... y así sucesivamente para cada fila que desees leer
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}



