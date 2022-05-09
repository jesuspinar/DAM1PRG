package com.programacionOO.tema06.practica03;
public class Practica03 {
    public static void main(String[] args) {
        int a = 3, b = 35;
        
        // System.out.println(); 
        mayorQue(a,b);

    }
    public static int mayorQue(int a, int b){
        if (a > b) {
        System.out.println("El primero es mayor " +a);
            return a;
        }
        else{
            System.out.println("El segundo es mayor " +b);
            return b;
        }
    }
}
