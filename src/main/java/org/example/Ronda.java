package org.example;

public class Ronda {
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

    public Ronda setPartidos(Partido[] partidos) {
        this.partidos = partidos;
        return this;
    }

    String nro;

    public Ronda(String nro, Partido[] partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }

    Partido partidos[];
    public int puntos(){
        return 2;
    }
}
