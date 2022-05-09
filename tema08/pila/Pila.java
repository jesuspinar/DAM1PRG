package com.programacionOO.tema08.pila;

import java.util.Arrays;

public class Pila {
    private final int GROW_FACTOR = 2;
    private int[] datos;
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
        if(isFull()) {
            datos = resize();
        }
        datos[++tope] = element;
        return true;
    }
    private int[] resize(){
        int[] newArray = new int[datos.length * GROW_FACTOR];
        for (int i = 0; i < datos.length; i++) {
            newArray[i] = datos[i];
        }
        return newArray;
    }

    private void resize2(){
        int[] newArray = new int[datos.length * GROW_FACTOR];
        for (int i = 0; i < datos.length; i++) {
            newArray[i] = datos[i];
        }
        datos = newArray;
    }
    private int[] resize3(int[] a){
        int[] newArray = new int[a.length * GROW_FACTOR];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        return newArray;
    }

    public Integer pop() {
        if(!isEmpty()) {
            return datos[tope--];
        }
        return null;
    }
    public int size(){
        return tope+1;
    }
    public Integer top() {
        if(!isEmpty()) {
            return datos[tope];
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pila{" +
                "datos=" + Arrays.toString(datos) +
                ", tope=" + tope +
                '}';
    }
}



