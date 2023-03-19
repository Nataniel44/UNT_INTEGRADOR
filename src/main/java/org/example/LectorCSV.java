package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorCSV {
    private File archivo;
    private Scanner scanner;
    private int lineaActual;

    public LectorCSV(String rutaArchivo) throws FileNotFoundException {
        archivo = new File(rutaArchivo);
        scanner = new Scanner(archivo);
        lineaActual = 0;
        if (scanner.hasNextLine()) {
            scanner.nextLine(); // Descartar la primera línea (encabezados)
            lineaActual++;
        }
    }

    public Equipo leerLinea() {
        Equipo equipo = null;
        if (scanner.hasNextLine()) {
            String[] datos = scanner.nextLine().split(";");
            equipo = new Equipo();
            equipo.setIdEquipo1(datos[0]);
            equipo.setNombre(datos[1]);
            equipo.setDescripcion(datos[2]);
            equipo.setGolEquipo1(datos[3]);
            // ... y así sucesivamente para cada columna que desees guardar
            lineaActual++;
        }
        return equipo;
    }

    public int getLineaActual() {
        return lineaActual;
    }
}
