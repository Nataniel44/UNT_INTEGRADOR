package org.example;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public Pronostico setPartido(Partido partido) {
        this.partido = partido;
        return this;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Pronostico setEquipo(Equipo equipo) {
        this.equipo = equipo;
        return this;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public Pronostico setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
        return this;
    }
    public int puntos(){
        
        return puntos();
    }
}
