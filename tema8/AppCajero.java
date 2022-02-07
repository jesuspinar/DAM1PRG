package com.programacionOO.tema8;

import com.programacionOO.tema8.practicaCajero.Banco;
import com.programacionOO.tema8.practicaCajero.Cajero;
import com.programacionOO.tema8.practicaCajero.Empresa;
import com.programacionOO.tema8.practicaCajero.Proxy;
import com.programacionOO.tema8.practicaCajero.config.Config;

public class AppCajero {
    private Banco[] bancos;
    private Proxy proxy;
    private Empresa[] empresas;
    private Cajero cajero;

    public AppCajero() {
        bancos = new Banco[Config.CANTIDAD_BANCOS];
        for(int i = 1; i <= bancos.length; i++) {
            bancos[i-1] = new Banco(String.format("%06d", i),
                    "Banco " + i);
        }
        empresas = new Empresa[Config.CANTIDAD_EMPRESAS];
        for(int i = 1; i <= empresas.length; i++) {
            empresas[i - 1] = new Empresa(String.format("%c", i).charAt(0),
                    "Empresa " + i, bancos);
        }
        proxy = new Proxy(empresas);
        cajero = new Cajero(proxy);
    }
}
