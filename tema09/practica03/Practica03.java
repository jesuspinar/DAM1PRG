package com.programacionOO.tema09.practica03;

import com.programacionOO.libs.Util;

public class Practica03 {
    private double data[];
    private int cont;

    public Practica03(int arrayLength) {
        data = new double[arrayLength];
        cont = 0;
        askDouble();
    }

    public void askDouble() {
        String letras="";
        boolean isLetter = false;
        int exception = 0;
        int num = 0;
        int mayor = Integer.MIN_VALUE;
        do {
            num = Util.askInteger("Intruduce un decimal positivo para continuar, negativo para fin");

            isLetter = contieneLetras(num);

            if (!isLetter && data.length > cont){
                if(num > mayor) mayor = num;
                data[cont++] = num;
            }



        }while (!isLetter && data.length > cont);
        Util.showArray(data);
        System.out.println("El numero mayor es "+mayor);

        System.out.println("Excepciones tratadas = " + exception);

    }
    public static boolean contieneLetras(int num) {
        String cadena = Integer.toString(num);
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
}
