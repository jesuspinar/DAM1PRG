package com.programacionOO.tema04salida.practica05;

public class Practica05 {
    public static void main(String[] args) {
        for (int i = 1; i < 2;++i) {
           System.out.printf("\u001B[1;30m         1 \u001B[0m\n");
           System.out.printf("\u001B[1;31m        12 \u001B[0m\n");
           System.out.printf("\u001B[1;32m       123 \u001B[0m\n");
           System.out.printf("\u001B[1;33m      1234 \u001B[0m\n");
           System.out.printf("\u001B[1;34m     12345 \u001B[0m\n");
           System.out.printf("\u001B[1;35m    123456 \u001B[0m\n");
           System.out.printf("\u001B[1;36m   1234567 \u001B[0m\n");
           System.out.printf("\u001B[1;00m  12345678 \u001B[0m\n");
           System.out.printf("\u001B[1;30m 123456789 \u001B[0m\n");
        }
        //otra sol validad xd
        String s = "";
        int color = 0;
        for (int j = 1; j <= 9; j++) {
            s = s + j;
            color = j - 1;
            //incremento de color
            System.out.printf("\u001B[1;3"+color+"m%10s\u001B[0m\n",s);
        }
    }
}
