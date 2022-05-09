package com.programacionOO.tema07.testrray;


public class TestArray{
    
    /**
     * Metodo que rellena un array de 0 en las posiciones pares y ademas
     * crea un array nuevo que guarda el array 
     * @param vector
     * @return
     *
    */ 
    public static int[] rellenarCerosPares(int[] vector) {
        int[] array = new int[vector.length];
        for (int i = 0; i < vector.length; i+=2) {
            vector[i] = 0;
        }
        return array;
        
    }
    // numeros flotantes (float y doble) tienen representacion ieqo774 no es compatible
    //  exactamente con numeros enteros abria que establecer rangos de busqueda
    public static int busquedaBinaria(int[] array, int n) {
        int inicio = 0; 
        int fin = array.length - 1; 
        int centro; // = array.length / 2 division entera trunca y redondea no decimal
        
        while(inicio <= fin){
            centro = (inicio + fin) / 2;
            if(array[centro] == n){
                return centro;
            }
            else if(array[centro] > n){
                fin = centro - 1;
            }
            else{
                inicio = centro + 1;
            }
        }
        
        return -1;// devuelve posicion negativa si no encuentra n
    }
}
// Encontrar tres maneras diferentes de buscar elementeos en un array
// - Recorrer todos los elementos del array
// - Metodos de busqueda en la clase array
// - Metodos de ordenacion en la clase array 
//   y luego coger un elemento por la mitad del array
//   y preguntar si es mayor o menor
//   del elemento que buscamos (busqueda binaria)
//  mejor caso 1 , peor caso mas de 1n
// - Metodo de ordenacion  (insercion, burbuja, lineal,
//  quicksort cuando no tienes info del array, 
//  radixshort utiliza listas enlazadas perdemos cache, rapido en n pequeños ) 