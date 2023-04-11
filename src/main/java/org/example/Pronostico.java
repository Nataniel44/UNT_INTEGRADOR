package org.example;

public class Pronostico {
    private Partido partido;
    private Persona persona;
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico(Partido partido, Persona persona, Equipo equipo, ResultadoEnum resultado) {
        super();
        this.partido = partido;
        this.persona = persona;
        this.equipo = equipo;
        this.resultado = resultado;
    }
    public int getPuntos() {
        int puntos = 0;

        if (this.partido == null) {
            throw new IllegalStateException("El partido no está inicializado");
        }
        ResultadoEnum resultadoReal = this.partido.resultado(this.equipo);
        return (this.resultado == resultadoReal) ? 1 : 0;
    }
}

