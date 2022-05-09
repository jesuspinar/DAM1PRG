package com.programacionOO.tema10.map;

import java.util.HashMap;

public class EjemploMap {
    public EjemploMap() {
        //el poner hash map en vez de map hace que el uso sea mas limitado
        HashMap<String,String> diccionario = new HashMap<>();
        diccionario.put("hola", "Un tipo de saludo");// elemento (1) clave (2) valor
    }
}         
