package org.example;

import javax.print.DocFlavor;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            LectorCSV lector = new LectorCSV("C:\\Users\\Nata44\\Desktop\\UTN\\TPintegrador\\resultados.csv");
            // Leer la primera fila
//            Partido partido1 = lector.leerLinea();
            Equipo equipo1 = lector.leerLinea();
            System.out.println("id1: " + equipo1.getIdEquipo1() +"\t"+"Equipo1: "+ equipo1.getNombre()+"\t"+ equipo1.getDescripcion() +"\t"+ "Goles1: "+equipo1.getGolEquipo1()+"\t"+"|"+"\t"+
                    "id2: "+equipo1.getGolEquipo2() +"\t"+"gol2: "+ equipo1.getIdEquipo2() +"\t"+"equipo: "+ equipo1.getNombre1() +"\t"+ equipo1.getDescripcion2());

//            Equipo equipo3 = lector.leerLinea();
//            System.out.println("id1: " + equipo3.getIdEquipo1() +"\t"+"Equipo1: "+ equipo3.getNombre()+"\t"+ equipo3.getDescripcion() +"\t"+ "Goles1: "+equipo3.getGolEquipo1()+"\t"+"|"+"\t"+
//                    "id2: "+equipo3.getGolEquipo2() +"\t"+"gol2: "+ equipo3.getIdEquipo2() +"\t"+"equipo: "+ equipo3.getNombre1() +"\t"+ equipo3.getDescripcion2());


            Partido partido1 = new Partido();
            partido1.getEquipo1();
            partido1.getEquipo2();
            partido1.getGolesEquipo1();
            partido1.getGolesEquipo2();




            // ... y así sucesivamente para cada fila que desees leer
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}



