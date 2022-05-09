package com.programacionOO.tema10.practica04;

public class Practica04 {
    public Practica04(int initialSize) {

        ColaGen colaGen = new ColaGen<>(initialSize);

        System.out.println("\nADDING INTIALS");
        for (int i = 0; i < initialSize; i++) {
            colaGen.add(i);
        }
        System.out.println(colaGen);


        System.out.println("\nREMOVING INTIALS");
        for (int i = 0; i < initialSize; i++) {
            colaGen.remove();
        }
        System.out.println(colaGen);

        System.out.println("\nEXTRA INTIALS");
        for (int i = 5; i < 10; i++) {
            colaGen.add(i);
        }
        System.out.println(colaGen);

        System.out.println("\nOTHER INTIALS");
        for (int i = 11; i < 15; i++) {
            colaGen.add("Hola "+i);
        }
        System.out.println(colaGen);

        System.out.println("\nREMOVING INTIALS");
        for (int i = 0; i < initialSize; i++) {
            colaGen.remove();
        }
        System.out.println(colaGen);
    }
}
