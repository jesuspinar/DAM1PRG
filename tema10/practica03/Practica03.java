package com.programacionOO.tema10.practica03;

public class Practica03 {

    public Practica03(int initialSize) {
        PilaGen pilaG = new PilaGen<>(initialSize);

//        for (int i = 0; i <= pilaSize; i++) {
//            pilaG.push(Util.random(1,10));
//        }
        for (int i = 0; i < initialSize; i++) {
            pilaG.push(i);
        }
        pilaG.pop();
        System.out.println(pilaG.toString());
    }
}
