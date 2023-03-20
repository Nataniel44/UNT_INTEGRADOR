package org.example;

public class Equipo {
    private int id;
    private String nombre;
    private String Descripcion;
    private int goles;

    public int getId() {
        return id;
    }

    public Equipo setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getGoles() {
        return goles;
    }

    public Equipo setGoles(int goles) {
        this.goles = goles;
        return this;
    }

    public Equipo(int id, String nombre, int goles) {
        this.id = id;
        this.nombre = nombre;
        this.goles = goles;
    }
}
