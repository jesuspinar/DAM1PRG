package com.programacionOO.tema10.practica11.Modelo;

import com.programacionOO.tema10.practica11.Configuracion.Config;

public class Aula {
    private static int cont = Config.STARTER_ID_AULA;
    private int numAula;
    private float m2;

    public Aula(float m2) {
        this.m2 = m2;
        numAula = ++cont;
    }

    public int getNumAula() {
        return numAula;
    }

    public float getM2() {
        return m2;
    }

    @Override
    public String toString() {
        return  "numAula = " + numAula +
                " m2 = " + m2;
    }
}
