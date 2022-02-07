package com.programacionOO.tema8.practicaCajero;

public class Empresa {
    private char codigo;
    private String nombre;
    private final Banco[] bancos;

    public Empresa(char codigo, String nombre, Banco[] bancos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.bancos = bancos;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean validarCredenciales(String numTarjeta, String pin) {
        String codigoBanco = numTarjeta.substring(1, 7);
        for(Banco banco: bancos) {
            if(banco.getCodigo().equals(codigoBanco)) {
                return banco.validarCredenciales(numTarjeta, pin);
            }
        }
        return false;
    }
}
