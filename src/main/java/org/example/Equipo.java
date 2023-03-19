package org.example;

public class Equipo {
    private String nombre;
    private String idEquipo1;
    private String descripcion;
    private String golEquipo1;

    public String getNombre() {
        return nombre;
    }

    public Equipo setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getIdEquipo1() {
        return idEquipo1;
    }

    public Equipo setIdEquipo1(String idEquipo1) {
        this.idEquipo1 = idEquipo1;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Equipo setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public String getGolEquipo1() {
        return golEquipo1;
    }

    public Equipo setGolEquipo1(String golEquipo1) {
        this.golEquipo1 = golEquipo1;
        return this;
    }

    public Equipo(String nombre, String idEquipo1, String descripcion, String golEquipo1) {
        this.nombre = nombre;
        this.idEquipo1 = idEquipo1;
        this.descripcion = descripcion;
        this.golEquipo1 = golEquipo1;
    }
}
