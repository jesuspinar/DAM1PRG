package com.programacionOO.tema8.practica1;

public class Principal {
    public static void main(String[] args) {
        Coche cDef = new Coche();
        Coche c1 = new Coche("Ferrary","2345KLI",Color.ROJO,true,Tipo.DEPORTIVO,Seguro.TODORIESGO);
        System.out.println(cDef.imprimirCoche());
        System.out.println(c1.imprimirCoche());
        //MODIFICADO EJERCICIO
        /*c1.setColor(Color.AMARILLO);*/
        System.out.println(c1.imprimirCoche());
    }
}
/*
1. Crea un programa para poder representar información sobre coches.
    Para desarrollar el ejercicio:
        a) Crea una clase llamada Principal que es la que contendrá el método main().
        b) Crea una clase llamada Coche que represente la siguiente información:
        • el modelo
        • el color
        • si la pintura es metalizada o no
        • la matrícula
        • el tipo de coche, que puede ser MINI, UTILITARIO, FAMILIAR o DEPORTIVO • el año de fabricación
        • la modalidad del seguro, que puede ser a terceros o a todo riesgo

        c) Crea un constructor con valores iniciales (los que tú quieras),
         otro constructor con parámetros,
         los getters,
         los setters
         un método llamado imprimirCotxe() que muestre el modelo y el color del coche.

         -Crea varios coches utilizando los diferentes constructores y muestra sus características por
         pantalla.
         -Cambia algunos de los atributos de los coches y vuelve a mostrar sus características.*/
