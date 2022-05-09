package com.programacionOO.tema10.practica06;

import com.programacionOO.libs.Util;

public class Practica06 {
    private Traducir data ;

    public Practica06() {
        data = new Traducir();
        int opcion = -1;
        do{
            opcion = imprimirMenuFijo();
            switch (opcion){
                case 1: introducirPareja();break;
                case 2: traducirPalabra();break;
            }
        }while(opcion > 0 && opcion <= 2);
        System.out.println("Hasta pronto!");

    }

    private int imprimirMenuFijo(){
        int opcion = 0;
        System.out.println("MENU PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Introducir parejas de palabras");
        System.out.println("2. Traducir palabras");
        System.out.println("0. Salir ");
        return opcion = Util.askInteger("Eleje una opcion");
    }
    private void introducirPareja(){
        String key = "";
        String value = "";
        int numPareja = Util.askInteger("Cuantas parejas quieres intruducir?");
        for (int i = 0; i < numPareja; i++) {
            key = Util.askString("Introduce la palabra en ingles:");
            value = Util.askString("Introduce la palabra en valenciano:");
            data.introducir(key,value);
        }
    }
    private void traducirPalabra(){
        String key = "";
        key = Util.askString("Introduce la palabra en ingles:");
        System.out.println("Traducion :"+data.traducir(key));
    }
}
