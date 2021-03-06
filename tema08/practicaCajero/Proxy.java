package com.programacionOO.tema08.practicaCajero;

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

    public Empresa getEmpresa(String numTarjeta) {
        char codigo = numTarjeta.charAt(0);
        for(Empresa empresa: empresas) {
            if (codigo == empresa.getCodigo())
                return empresa;
        }
        return null;
    }

    public boolean validarCredenciales(String numTarjeta, String pin) {
        Empresa empresa = getEmpresa(numTarjeta);
        if(empresa != null)
            return empresa.validarCredenciales(numTarjeta, pin);
        return false;
    }

    public boolean ingresar(String numTarjeta, double cantidad) {
        Empresa empresa = getEmpresa(numTarjeta);
        if(empresa != null)
            return empresa.ingresar(numTarjeta, cantidad);
        return false;
    }

    public double retirar(String numTarjeta, double cantidad) {
        Empresa empresa = getEmpresa(numTarjeta);
        if(empresa != null)
            return empresa.retirar(numTarjeta, cantidad);
        return -1;
    }

    public double consultarSaldo(String numTarjeta) {
        Empresa empresa = getEmpresa(numTarjeta);
        if(empresa != null)
            return empresa.consultarSaldo(numTarjeta);
        return Long.MIN_VALUE;
    }
}
