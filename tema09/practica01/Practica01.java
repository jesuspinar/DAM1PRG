package com.programacionOO.tema09.practica01;

import com.programacionOO.libs.Util;

public class Practica01 {
    private int data[];
    private int cont;

    public Practica01(int arrayLength) {
        data = new int[arrayLength];
        cont = 0;
        askInt();
    }

    public void askInt() {
        boolean isNegative = false;
        int num = 0;
        do {
            num = Util.askInteger("Intruduce un numero positivo para continuar, negativo para fin");
            isNegative = (num < 0);
            if (!isNegative && cont < data.length)
                data[cont++] = num;
        }while (!isNegative);
        throw new NumberFormatException("Se intrujo un numero negativo, Adios!");
    }
}
//Escribe un método que se encargue de solicitar números al usuario hasta que
// se indique un número negativo. Se tiene que validar que el usuario no inserte letras.
