package com.programacionOO.tema04salida.practicaExtra;

public class Contador {
    public static void main(String[] args) throws InterruptedException {
        int h=0, m=0,s=0;
        while (h<24) {
            s++;
            if (s>59) {
                m++;
                s=0;
            }
            if (m > 59){
                h++;
                m=0;
            }
            System.out.printf("\u001b[H\u001b[2J%02d:%02d:%02d\n",h,m,s);
            // System.out.flush(); //omitir si esta \n
            Thread.sleep(1000);
        }
        System.out.println("A transcurrido un dia");
        
    }
}
