package org.example;

public class Persona {
    private String id;
    private String nombre;

    public String getId() {
        return id;
    }

    public Persona setId(String id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
