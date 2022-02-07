package com.programacionOO.tema8.practicaCajero;

import com.programacionOO.tema8.practicaCajero.config.Config;


import java.util.Random;

public class Banco {
    private String codigo;
    private String nombre;
    private Cuenta[] cuentas;

    public Banco(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        if (Config.DEBUG) {
            crearDatosPrueba();
        }
    }
    //TODO : crear cuentas y tarjetas que no se repitan
    private void crearDatosPrueba() {
        cuentas = new Cuenta[Config.CANTIDAD_CUENTAS];
        Random r = new Random();
        for(int i = 0; i < cuentas.length; i++) {
            cuentas[i] = new Cuenta(
                    String.valueOf(r.nextInt(Config.CUENTA_MAX_NUMERO - Config.CUENTA_MIN_NUMERO + 1) + Config.CUENTA_MIN_NUMERO),
                    "Propietario " + (i+1));
            cuentas[i].crearTarjeta();
        }
        //TODO TESTING
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i]);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean validarCredenciales(String numTarjeta, String pin) {
        for(Cuenta cuenta: cuentas) {
            Tarjeta tarjeta = cuenta.getTarjeta();
            return tarjeta.getNumero().equals(numTarjeta) &&
                    tarjeta.getPin().equals(pin);
        }
        return false;
    }

}
