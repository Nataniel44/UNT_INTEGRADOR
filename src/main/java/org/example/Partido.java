package org.example;

import com.opencsv.bean.CsvBindByName;

public class Partido {
    @CsvBindByName
    private  Equipo equipo1;
    @CsvBindByName
    private int golesEquipo1;
    @CsvBindByName
    private int golesEquipo2;
    @CsvBindByName
    private Equipo equipo2;
    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }


}
