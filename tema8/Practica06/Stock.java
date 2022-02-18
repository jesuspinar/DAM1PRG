package com.programacionOO.tema8.Practica06;

import com.github.javafaker.Faker;

public class Stock {
    private Bici[] bicis;
    private int almacen;

    public Stock(int almacen) {
        generateBike(almacen);
    }

    private void generateBike(int nbicis){
        Faker faker = new Faker();
        bicis = new Bici[nbicis];
        for (int i = 0; i < nbicis; i++) {
            Bici bici1 = new Bici(faker.number().randomNumber(),
                    faker.business().toString(),
                    faker.beer().name(),
                    faker.number().numberBetween(4,19),
                    faker.number().numberBetween(22,29),
                    faker.random().nextBoolean(),
                    faker.date(),
                    faker.number().randomDouble(2,500,1320),
                    faker.number().randomDigitNotZero()
            );
            bicis[i] = bici1;
            bicis[i].toString();
        }


    }
}
