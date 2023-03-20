package org.example;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Ronda {
    private String nro;
    private Partido[] partidos;

    public Ronda(String nro, Partido[] partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }

    public String getNro() {
        return nro;
    }
    public Ronda setNro(String nro) {
        this.nro = nro;
        return this;
    }
    public Partido[] getPartidos() {
        return partidos;
    }
    public Ronda setPartidos(Partido[] partidos) throws FileNotFoundException {
        this.partidos = partidos;
        return this;
    }
public int puntos(){

       return puntos();
}
}
