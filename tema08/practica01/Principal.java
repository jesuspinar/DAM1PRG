package com.programacionOO.tema08.practica01;

public class Principal {
    public static void main(String[] args) {
        Coche cDef = new Coche();
        Coche c1 = new Coche("Ferrary","2345KLI",Color.ROJO,true,Coche.Tipo.DEPORTIVO,Seguro.TODORIESGO);
        cDef.imprimirCoche();
        c1.imprimirCoche();
        //MODIFICACION
        /*c1.setColor(Color.AMARILLO);
        * //es correcto el metodo asegura el cambion
        * valida la entrada de datos
        * */
        /*c1.color = Color.AMARILLO;
        * //es incorrecto
        * */
        System.out.println(c1);//toString() lo COJE LA CLASE OBJ que esta Usando el @override de la clase Coche
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
