package com.programacionOO.tema10.practica03;

import java.util.ArrayList;

public class PilaGen<T> implements IPila<T>{
    private ArrayList<T> lista;

    public PilaGen(int initialSize) {
        lista = new ArrayList<>();
    }

    /**
     *
     * @param e its what ever
     * @return
     */
    @Override
    public T push(T e) {
        if (lista.add(e)){
            return e;
        }
        return null;
    }

    /**
     * Pop takes the last pushed item and removes it
     * @return
     */
    @Override
    public T pop() {
        if (!isEmpty()){
            return lista.remove(lista.size()-1);
        }
        return null;
    }
    @Override
    public int size() {
        if(lista.size()>0){
            return lista.size();
        }
        return 0;
    }
    @Override
    public T top() {
        return lista.get(lista.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }
    @Override
    public String toString() {
        return lista.toString() + "\nSize: " +size()+ "\nLast item : " + top();
    }
}
