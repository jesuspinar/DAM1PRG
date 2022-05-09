package com.programacionOO.tema08.practica07;

public class PreRev {

    private float temperatura;
    private int ppm;
    private int tensionSis;
    private int tensionDi;
    //todo : date of atended random?
    //private GregorianCalendar dateOfAttend;
    //todo : extra data
    //Motivo alta

    public PreRev(float temperatura, int ppm, int tensionSis, int tensionDi) {
        this.temperatura = temperatura;
        this.ppm = ppm;
        this.tensionSis = tensionSis;
        this.tensionDi = tensionDi;
    }

    @Override
    public String toString() {
        String result = String.format("%12.2f%10d%10d%11d",temperatura, ppm,tensionSis,tensionDi);
        return result;
    }
}
