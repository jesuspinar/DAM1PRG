package com.programacionOO.tema08.pila;

public class ColaGen<T>{
    private final int GROW_FACTOR = 2;
    private int first;
    private T[] data;
    private int last;

    public ColaGen(int initialSize) {
        this.data = (T[]) new Object[initialSize];
        this.last = this.first = -1;
    }

//    todo : Encolar (add): añade un elemento al final de la cola.
    public boolean add(T element){
        data[++last] = element;
        return true;
    }
//    todo : Desencolar (remove): lee y retira el elemento frontal de la cola, es decir, el primer elemento que entró.
    public T remove(){
        return data[first--];
    }
//    todo : Tamaño (size): devuelve el número de elementos que hay a la cola.
    public int size(){
        return data.length-1;
    }

//    todo : Frente (peek): lee el elemento frontal de la cola, es decir, el primer elemento que entró.
    public T peek(){
        if (!isEmty())
            return data[first];
        else
            return null;
    }
//    todo : Vacía (empty): devuelve verdadero si la cola está vacía o falso en caso de que contenga algún elemento.
    public boolean isEmty(){
        return this.last == -1 && this.first == -1;
    }

//    todo : Resize() : cojer un array alargarlo y pasar el puntero
    public T[] resize(){
        T[] newArray = (T[])new Object[data.length * GROW_FACTOR];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        return newArray;
    }


}
