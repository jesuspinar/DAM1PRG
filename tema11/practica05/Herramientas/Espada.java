package com.programacionOO.tema11.practica05.Herramientas;

import com.programacionOO.libs.Util;
import com.programacionOO.tema11.practica05.Materiales.Material;

public class Espada extends Herramienta {
    private int critico;
    public Espada(Material tipo,int critico) {
        super(tipo,Util.random(1,5));
        this.critico = critico;
    }

    public int getCritico() {
        return critico;
    }
}
