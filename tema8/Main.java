package com.programacionOO.tema8;

import com.programacionOO.tema8.Pila.Pila;
import com.programacionOO.tema8.Practica06.TiendaBicis;
import com.programacionOO.tema8.Practica07.App;

public class Main {
    public static void main(String[] args){
        //App app = new App();
//        Practica2 practica2 = new Practica2();
        System.out.println("helloworld");
//        Practica3 practica3 = new Practica3();
//        TiendaBicis tienda = new TiendaBicis();
        //App q = new App();
        Pila p = new Pila(10);
        for (int i = 0; i < 5; i++) {
            p.push(i);
            System.out.println(p);
        }
        for (int i = 0; i < 5; i++) {
            p.pop();
            System.out.println(p);
        }
    }
}

