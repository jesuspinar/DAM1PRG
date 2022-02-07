package com.programacionOO.tema8.practicaCajero;

import java.util.Random;

public class Cuenta {
    private static final int MIN_NUMERO_TARJETA = 1000;
    private static final int MAX_NUMERO_TARJETA = 9999;
    private static final int MIN_CODIGO = 100;
    private static final int MAX_CODIGO = 999;

    private String numero;
    private String propietario;
    private double saldo;
    private Tarjeta tarjeta;

    public Cuenta(String numero, String propietario) {
        this.numero = numero;
        this.propietario = propietario;
        // Las siguientes asignaciones no son necesarias en Java
        saldo = 0;
        tarjeta = null;
    }

    public Tarjeta crearTarjeta() {
        if(tarjeta == null) {
            Random r = new Random();
            tarjeta = new Tarjeta(
                    String.valueOf(r.nextInt(MAX_NUMERO_TARJETA - MIN_NUMERO_TARJETA + 1) + MIN_NUMERO_TARJETA),
                    String.valueOf(r.nextInt(MAX_NUMERO_TARJETA - MIN_NUMERO_TARJETA + 1) + MIN_NUMERO_TARJETA),
                    String.valueOf(r.nextInt(MAX_CODIGO - MIN_CODIGO + 1) + MIN_CODIGO));
            return tarjeta;
        }
        return null;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", propietario='" + propietario + '\'' +
                ", saldo=" + saldo +
                ", tarjeta=" + tarjeta +
                '}';
    }


}
