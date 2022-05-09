package com.programacionOO.tema09.practica02;

import com.programacionOO.libs.Util;

public class Practica02 {
    private double data[];
    private int cont;

    public Practica02(int arrayLength) {
        data = new double[arrayLength];
        cont = 0;
        askDouble();
    }

    public void askDouble() {
        boolean isNegative = false;
        int exception = 0;
        double num = 0;
        double mayor = 0;
        do {
            try {
                num = Util.askDouble("Intruduce un decimal positivo para continuar, negativo para fin");
            }catch (NumberFormatException nfe){
                System.out.println("Error solo se admiten numeros");
                exception++;
            }

            isNegative = (num < 0);
            if(num > mayor) mayor = num;
            if (!isNegative && data.length > cont)//si es letra inicializa a 0 por defecto
                data[cont++] = num;
        }while (!isNegative && data.length > cont);
        Util.showArray(data);
        System.out.println("El numero mayor es "+mayor);
        System.out.println("Excepciones tratadas = " + exception);

    }

}
