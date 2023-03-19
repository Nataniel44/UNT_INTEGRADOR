package org.example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            LectorCSV lector = new LectorCSV("C:\\Users\\Nata44\\Desktop\\UTN\\TPintegrador\\resultados.csv");
            // Leer la primera fila
            Equipo equipo = lector.leerLinea();






//            System.out.println(equipo.);
//            System.out.println(equipo.getId());
//            // Leer la segunda fila
//            Equipo fila2 = lector.leerLinea();
//            System.out.println("Dato1 de la fila 2: " + fila2.getIdEquipo1());
//            System.out.println("Dato2 de la fila 2: " + fila2.getNombre());
//            System.out.println("Dato3 de la fila 2: " + fila2.getGolEquipo1());

            // ... y así sucesivamente para cada fila que desees leer
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}



