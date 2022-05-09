package com.programacionOO.tema11.practica05;

import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.libs.Util;
import com.programacionOO.tema11.practica05.Herramientas.Espada;
import com.programacionOO.tema11.practica05.Herramientas.Pico;
import com.programacionOO.tema11.practica05.Materiales.Madera;
import com.programacionOO.tema11.practica05.Materiales.Piedra;

import java.util.Arrays;

public class Practica05 {
    // CONTANTES CON LOS TIPOS DE PIEDRA Y MADERA
    private final String[] piedras = {"Piedra Caliza","Piedra Volvanica","Piedra Arena","Piedra Azul","Piedra Verde","Piedra Negra","Piedra Morada"};
    private final String[] maderas = {"Madera Rallada","Madera Lisa","Madera Boreal","Madera Gris","Madera Marron","Madera X","Madera Espiritual"};

    private Object[] dock;
    public Practica05(int init) {
        if (init > 8){
            System.err.println("Value must be < 8");
            System.exit(0);
        }
        dock = new Object[init];
        generarObjetosPrueva(init);
        System.out.println("| antorchas(43) | espada | cubo | piedra(63) | pico | diamante(3) | semillas(1) |");
        System.out.println("|_|_|_|_|_|_|_|");

        /* MOSTRAR MENUS */
        int opcion = 0;
        do {
            //OPCIONES DEL MENU
            String[] opcionesMain = {"Añadir objeto", "Eliminar del inventario", "Mostrar inventario"};
            opcion = MenuBuilder.printMenu(opcionesMain,"Menu principal");
            switch (opcion){
                case 1: agregarCantidad();break;
                case 2: eliminarCantidad();break;
                case 3: mostrarObjetos();break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");

    }
    //todo : este metodo depliega una lista de los objetos disponibles
    private void mostrarObjetos(){
        System.out.println(Arrays.toString(dock));
    }
    //todo : eliminar cantidades de la pila
    private void eliminarCantidad(){}
    //todo : agregar cantidades de la pila
    private void agregarCantidad(){}

    //todo : eliminar Objeto de la pila
    private void eliminarObjeto(){}
    //todo : agregar Objeto de la pila
    private void agregarObjeto(){}

    private void generarObjetosPrueva(int init){
        Piedra p1;
        Madera m1;
        Espada espada;
        Pico pico;

        for (int i = 0; i < init; i++) {
            p1 = new Piedra(i + 10, piedras[i]);
            m1 = new Madera(i + 5, maderas[i]);
            espada = new Espada(m1, Util.random(1,5));
            pico = new Pico(p1);
            dock[i] = pico;
        }

    }
    //todo : como diferenciar que clase es una espada y cual un pico cuando se muestran
    // instanceOf;

}














