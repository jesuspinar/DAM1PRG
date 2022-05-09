package com.programacionOO.tema04salida.practica04;

public class Practica04 {
    public static void main(String[] args) {
        String s = "";
        for (int i = 1; i < 2;++i) {
           System.out.println("1");
           System.out.println("12");
           System.out.println("123");
           System.out.println("1234");
           System.out.println("12345");
           System.out.println("123456");
           System.out.println("1234567");
           System.out.println("12345678");
           System.out.println("123456789");
        }
        //otra sol valida xd
        for (int j = 1; j <= 9; j++) {
            s = s + j;
            System.out.printf("%-10s\n",s);
        }
    }
}
