package org.example;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
        super();
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public int puntos() {
        if (this.partido == null) {
            throw new IllegalStateException("El partido no está inicializado");
        }
        ResultadoEnum resultadoReal = this.partido.resultado(this.equipo);
        return (this.resultado == resultadoReal) ? 1 : 0;
    }
}
