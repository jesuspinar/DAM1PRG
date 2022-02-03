package com.programacionOO.tema8.PracticaCajero;

public class Tarjeta extends Cuenta{
    public long numTarjeta;
    public int pin;

    public Tarjeta(String propietario, float saldo, long numTarjeta, int pin) {
        super(propietario, saldo);
        this.numTarjeta = numTarjeta;
        this.pin = pin;
    }
}
