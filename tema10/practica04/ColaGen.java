package com.programacionOO.tema10.practica04;

import java.util.Arrays;

public class ColaGen<T>{
    private final int GROW_FACTOR = 2;
    private final int REORDER_FACTOR = 20;
    private int first;
    private T[] data;
    private int last;

    public ColaGen(int initialSize) {
        this.data = (T[]) new Object[initialSize];
        this.last = this.first = -1;
    }
    //  añade un elemento al final de la cola.
    public boolean add(T element){
        if(data.length == REORDER_FACTOR){
            reorder();
        }
        if (isEmty()){
            ++first;
        }
        else if(isFull()){
            data = resize();
        }
        data[++last] = element;
        return true;
    }
    // retira el elemento frontal de la cola, es decir, el primer elemento que entró.
    public T remove(){
        if (last < first) {
            System.out.println("\n***** FINISHED ******");
            return null;
        }
        return data[first++];
    }
    // devuelve el número de elementos que hay a la cola.
    public int size(){
        return data.length-1;
    }

    //  lee el elemento frontal de la cola, es decir, el primer elemento que entró.
    public T peek(){
        if (!isEmty())
            return data[first];
        else
            return null;
    }
    private boolean isFull(){
        return (last + 1) == size();
    }
    // devuelve verdadero si la cola está vacía o falso en caso de que contenga algún elemento.
    public boolean isEmty(){
        return this.last == -1 && this.first == -1;
    }

    //  cojer un array alargarlo y pasar el puntero
    private T[] resize(){
        T[] newArray = (T[])new Object[data.length * GROW_FACTOR];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        return newArray;
    }

    private void reorder(){
        int index = 0;
        for (int f = first; f <= last; f++) {
            data[index++] = data[f];
        }
        first = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + "\nSize : " + data.length
                + "\nFirst Position : "+ first
                + " = " + peek()
                + "\nLast Position : " + last
                + " = " + data[last];
    }
}