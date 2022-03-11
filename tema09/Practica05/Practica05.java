package com.programacionOO.tema09.Practica05;

public class Practica05 {
    private final int edad ;
    private final String nombre;
    private final double altura;


    public Practica05(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre +
                " edad = " + edad +
                " altura = " + altura;
    }
}
