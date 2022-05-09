package com.programacionOO.tema08.pila;

public class Cola {
    private final int GROW_FACTOR = 2;
    private int first;
    private int[] datos;
    private int last;

    public Cola(int initialSize) {
        this.datos = new int[initialSize];
        this.last = this.first = -1;
    }

//    todo : Encolar (add): añade un elemento al final de la cola.
    public boolean add(int element){
        datos[++last] = element;
        return true;
    }
//    todo : Desencolar (remove): lee y retira el elemento frontal de la cola, es decir, el primer elemento que entró.
    public Integer remove(){
        return datos[first--];
    }
//    todo : Tamaño (size): devuelve el número de elementos que hay a la cola.
    public int size(){
        return datos.length-1;
    }

//    todo : Frente (peek): lee el elemento frontal de la cola, es decir, el primer elemento que entró.
    public Integer peek(){
        if (!isEmty())
            return datos[first];
        else
            return null;
    }
//    todo : Vacía (empty): devuelve verdadero si la cola está vacía o falso en caso de que contenga algún elemento.
    public boolean isEmty(){
        return this.last == -1 && this.first == -1;
    }

//    todo : Resize() : cojer un array alargarlo y pasar el puntero
    public int[] resize(){
        int[] newArray = new int[datos.length * GROW_FACTOR];
        for (int i = 0; i < datos.length; i++) {
            newArray[i] = datos[i];
        }
        return newArray;
    }

}
