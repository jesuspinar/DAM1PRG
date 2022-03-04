package com.programacionOO.tema08.practicaCajero;

public class Tarjeta {
    private String numero;
    private String pin;
    private String codigoSeguridad;

    public Tarjeta(String numero, String pin, String codigoSeguridad) {
        this.numero = numero;
        this.pin = pin;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getNumero() {
        return numero;
    }

    public String getPin() {
        return pin;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numero='" + numero + '\'' +
                ", pin='" + pin + '\'' +
                ", codigoSeguridad='" + codigoSeguridad + '\'' +
                '}';
    }
}
