package com.programacionOO.tema8.Practica07;

import java.util.GregorianCalendar;

public class PreRev {

    private float temperatura;
    private int ppm;
    private int tensionSis;
    private int tensionDi;
    //todo : date of atended random?
    //private GregorianCalendar dateOfAttend;

    public PreRev(float temperatura, int ppm, int tensionSis, int tensionDi) {
        this.temperatura = temperatura;
        this.ppm = ppm;
        this.tensionSis = tensionSis;
        this.tensionDi = tensionDi;
    }

    @Override
    public String toString() {
        return "\t" + temperatura + "\t" + ppm + "\t" + tensionSis + "\t" + tensionDi + "\t";
    }
}
