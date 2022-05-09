package com.programacionOO.tema04.practica17;

// import java.text.DecimalFormat;

public class Practica17 {//SALIDAS Y FORMATO
    public static void main(String[] args) {
        //Hola mundo con ansy colores  8 bits
        System.out.println("\u001B[1;37;44m Hola mundo \u001B[0m");
        //secuencia de scape para sacar x  (4) decimales 
        System.out.printf("PI = %.4f\n", Math.PI);
        //secuencia de scape para varios numeros  
        System.out.printf("A = %.4f B = %.2f C = %.2f \n", Math.E,11.2223, 891.234);
        //secuencia $ (2) cambia el orden de los numeros  
        System.out.printf("A = %2$.4f B = %.2f C = %.2f \n", Math.E,11.2223, 891.234);
        //CLASE DECIMAL FORMAT
        // DecimalFormat formaterador = new DecimalFormat("#.##");
        // float n = 233.3234f;
        // System.out.println(formaterador());

        //Hola mundo en mayus
        System.out.printf("%S\n","Hola mundo");

        //IMPREME COLUMANAS
        System.out.printf("%-30s%s\n","columna1","columna 2");
        System.out.printf("%-30s%s\n","fila1","fila2");

    }
}
