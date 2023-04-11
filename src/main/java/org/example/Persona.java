package org.example;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String id;
    private String nombre;
    private List<Pronostico> pronosticos;

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.pronosticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPronostico(Pronostico pronostico) {
        pronosticos.add(pronostico);
    }

    public int getPuntaje() {
        int puntos = 0;
        for (Pronostico pronostico : pronosticos) {
            puntos += pronostico.getPuntos();
        }
        return puntos;
    }
}
