package com.programacionOO.tema8.practicaCajero;

public class Proxy {
    private final Empresa[] empresas;

    public Proxy(Empresa[] empresas) {
        this.empresas = empresas;
    }

    public Empresa obtenerEmpresa(char codigoEmpresa) {
        for(Empresa empresa: empresas) {
            if(empresa.getCodigo() == codigoEmpresa)
                return empresa;
        }
        return null;
    }

    public boolean validarCredenciales(String numTarjeta, String pin) {
        char codigo = numTarjeta.charAt(0);
        for(Empresa empresa: empresas) {
            if(codigo == empresa.getCodigo()) {
                return empresa.validarCredenciales(numTarjeta, pin);
            }
        }
        return false;
    }
}
