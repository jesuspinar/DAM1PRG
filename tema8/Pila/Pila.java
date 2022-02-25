package com.programacionOO.tema8.Pila;

public class Pila {
    private final int[] datos;//private para que nadie de fuera me cambie los datos de la pila
    private int tope;

    public Pila(int initialSize) {
        this.datos = new int[initialSize];
        this.tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1;//tope > 0 igual a medio lleno
    }
    public boolean isFull() {
        return tope == datos.length - 1;//lleno
    }
    public boolean push(int element) {
        if(!isFull()) {
            datos[tope + 1] = element;
            return true;
        }
        return false;
    }
    public boolean pop() {
        if(!isEmpty()) {
            tope--;
            return true;
        }
        return false;
    }
    public int size(){
        return tope;
    }
    public int top() {
        if(!isEmpty()) {
            return datos[tope];
        }
        return -1;
    }
}



