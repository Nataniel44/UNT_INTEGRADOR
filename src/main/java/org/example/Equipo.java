package org.example;

import com.opencsv.bean.CsvBindByPosition;

public class Equipo {
    private String nombre;
    private String Descripcion;

    public String getNombre() {
        return nombre;
    }

    public Equipo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;

    }
}

