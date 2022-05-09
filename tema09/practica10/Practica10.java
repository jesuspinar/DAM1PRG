package com.programacionOO.tema09.practica10;

import com.programacionOO.libs.Ansi;
import com.programacionOO.libs.Util;

public class Practica10 {
    /*Crear calculador (sumar , restar, multiplicar, dividir , porcentaje, raiz cuadrada)*/
    double operadorX;
    double operadorY;

    public Practica10() {
        do {
            operadorX = Util.randomDouble(1,9);
            operadorY = Util.randomDouble(1,9);
            System.out.printf("Numero X = %.2f\tNumero Y = %.2f\n" +
                "Suma = %.2f\nResta = %.2f\nMultiplicacion = %.2f\nDivision = %.2f\n" +
                "Porcentaje X = %.2f\nPorcentaje Y = %.2f\nRaiz X = %.2f\nRaiz Y = %.2f\n\n",
                operadorX,operadorY,
                Calculadora.sumar(operadorX,operadorY),
                Calculadora.restar(operadorX,operadorY),
                Calculadora.multiplicar(operadorX,operadorY),
                Calculadora.dividir(operadorX,operadorY),
                Calculadora.porcentaje(operadorX), Calculadora.porcentaje(operadorY),
                Calculadora.raiz(operadorX),Calculadora.raiz(operadorY)
            );
            Ansi.wait(8000);
        }while (true);
    }
}
