package com.programacionOO.tema08.pila;

import java.util.ArrayList;

public class PilaGen<T> {
    private ArrayList<T> lista;
    public PilaGen() {
        lista = new ArrayList<>(); }
    public T push(T e) { lista.add(e);
        return e; }
    public T pop() { T e = top();
        lista.remove(lista.size()-1);
        return e; }
    public int size() { return lista.size();
    }
    public T top() {
        return lista.get(lista.size()-1); }
    public boolean isEmpty() { return lista.isEmpty();
    }
    public String toString() {
        return lista.toString(); }
}
