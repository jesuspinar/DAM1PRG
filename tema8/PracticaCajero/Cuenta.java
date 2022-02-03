package com.programacionOO.tema8.PracticaCajero;

public abstract class Cuenta {
    private String propietario;
    private double saldo;
    private Tarjeta tarjeta;

    public Cuenta(String propietario, float saldo) {
        this.propietario = propietario;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarSaldo(double saldo) {
        this.saldo += saldo;
        System.out.println("Saldo ingresado correctamente");
        System.out.println(this.saldo);
    }

    public void retirarSaldo(double saldo){
        this.saldo -= saldo;
        System.out.println("Saldo retirado correctamente");
        System.out.println(this.saldo);
    }

}