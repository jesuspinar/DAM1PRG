package com.programacionOO.tema10.Practica03;

public interface IPila <T>{
    T push(T e);
    T pop();
    int size();
    T top();
    boolean isEmpty();
}
