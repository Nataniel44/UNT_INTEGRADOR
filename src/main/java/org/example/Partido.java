package org.example;

import com.opencsv.bean.CsvBindByName;

public class Partido {
    private  Equipo equipo1;
    private int golesEquipo1;
    private int golesEquipo2;
    private Equipo equipo2;
    public void partido1(){

    }
    public Equipo getEquipo1() {
        return equipo1;
    }

    public Partido setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
        return this;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public Partido setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
        return this;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public Partido setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
        return this;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public Partido setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
        return this;
    }

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }


}
