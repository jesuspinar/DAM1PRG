package com.programacionOO.tema07.practica21;

import com.programacionOO.libs.Util;

public class Practica21{
    // VARIABLES GLOBALES
    public static int array[] = new int[10];
    
    public static void main(String[] args) {
        int exit;
        
        do {
            System.out.println("\nMENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.-Rellenar array.");
            System.out.println("2.-Visualizar contenido del array.");
            System.out.println("3.-Visualizar contenido par.");
            System.out.println("4.-Visualizar contenido múltiplo de 3.");
            System.out.println("0.-Salir del menú.");
            exit = Util.askInteger("\nSelecciona una opción :");
            System.out.println();

            if (exit < 0 || exit > 4) {
                System.out.println("Opcion no valida\n");
            }

            switch (exit) {
                case 1: crearArray(array);break;
                case 2: visualizarArray(array);break;
                case 3: visualizarParell(array);break;
                case 4: visualitzarMultiple3(array);break;
            }

    
        } while (exit != 0);
    }
    public static void crearArray(int[] vector) {
        array = Util.randomArrayInt(vector.length, 0, 50);
    }
    public static void visualizarArray(int[] vector) {
        Util.showArray(vector);
    }
    public static void visualizarParell(int[] vector) {
        Util.showParArray(vector);
    }
    public static void visualitzarMultiple3(int[] vector){
        Util.showMultiploArray(vector, 3);
    }

}

//21. Implementa los siguientes métodos (respeta las cabeceras que se proporcionan):
//  a) public static void crearArray(int[] vector): rellena el array con números
//  aleatorios del 0 al 50.
//  b) public static void visualitzarArray(int[] vector): visualiza todo el contenido
//  del array.
//  c) public static void visualitzarParell(int[] vector): muestra la posición y el
//  contenido de los elementos que tienen valor par.
//  d) public static void visualitzarMultiple3(int[] vector): muestra la posición y el
//  contenido de los elementos que son múltiplo de 3.

//  El array (de 10 elementos) se debe declarar, crear e inicializar en el main. Además,
//  se hará un  menú parecido al siguiente, desde el cual se invocarán a los métodos creados:

//  MENÚ PRINCIPAL
//  ==============
//  1.-Rellenar array.
//  2.-Visualizar contenido del array
//  3.-Visualizar contenido par.
//  4.-Visualizar contenido múltiplo de 3
//  0.-Salir del menú.
//  Selecciona una opción: