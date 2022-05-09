package com.programacionOO.tema10.practica02;

import com.programacionOO.libs.Util;

public class Practica02 {
    public Practica02() {
        ArrayListEstadistica estadistica = new ArrayListEstadistica();

        for (int i = 0; i < 10; i++) {
            estadistica.add((double)Util.random(1,10));
        }
        System.out.println(estadistica.toString());
    }
}
