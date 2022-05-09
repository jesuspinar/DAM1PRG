package com.programacionOO.tema08.practica06;

import com.programacionOO.libs.Util;

import java.util.Date;

public class TiendaBicis {
    private Stock tienda = new Stock(4);

    public TiendaBicis() {
        mostrarMenu();
        opcionesMenu(Util.askInteger("Elige una opcion"));
    }

    private void mostrarMenu(){
        System.out.println(
            "***************************\n" +
            "** GESTIÓN DE BICICLETAS **\n"+
            "***************************\n" +
            "1.- Añadir bicicleta ...\n" +
            "2.- Vender bicicleta ...\n" +
            "3.- Consultar bicicleta ...\n" +
            "4.- Mostrar stock \n" +
            "------------------------------------\n"+
            "0.- Salir\n");
    }
    private void opcionesMenu(int opcion){
        switch (opcion){
            case 1:
                tienda.enlargeBicis();
                tienda.setBici(entradaBici());
                break;
            case 2:
                tienda.removeBici();
                break;
            case 3:
                mostrarColsutas();
                opcionesConsutas(Util.askInteger("Elige una opcion"));
                break;
            case 4:
                tienda.mostrarStock();
                break;
        }

        if (opcion == 0){
            System.out.println("Hasta pronto!");
        }
        else if (opcion > 0 && opcion <= 4){
            mostrarMenu();
            opcionesMenu(Util.askInteger("Elige una opcion"));
        }
    }
    private void mostrarColsutas(){
        System.out.println(
            "***************************\n" +
            "** GESTIÓN DE BICICLETAS **\n"+
            "***************************\n" +
            "1.- Consultar por referencia ...\n" +
            "2.- Consultar por marca ...\n" +
            "3.- Consultar por modelo ...\n" +
            "------------------------------------\n"+
            "0.- Volver al menú principal\n");
    }
    private void opcionesConsutas(int opcion){
        switch (opcion){
            case 1:
                tienda.buscarBici(Util.askLong("Buscar por referencia:"));
                break;
            case 2:
                tienda.buscarModeloBici(Util.askString("Buscar por marca"));
                break;
            case 3:
                tienda.buscarModeloBici(Util.askString("Buscar por modelo"));
                break;
        }
        if (opcion > 0 && opcion <= 3){
            mostrarMenu();
            opcionesMenu(Util.askInteger("Elige una opcion"));
        }
    }

    private Bici entradaBici(){

        int day = Util.random(1,30);
        int month = Util.random(1,12);
        int year = Util.random(2019,2022);

        Bici b1 = new Bici(
            Util.askLong("Inserta un numero de referencia:"),
            Util.askString("Inserta la marca:"),
            Util.askString("Inserta el modelo:"),
            Util.askFloat("Inserta el peso"),
            Util.askFloat("Diametro de la rueda"),
            true,
            new Date(year,month,day),
            Util.askDouble("Inserta el precio:"),
            Util.askInteger("Inserta el numero de existencias:")
        );

        return  b1;
    }




}
