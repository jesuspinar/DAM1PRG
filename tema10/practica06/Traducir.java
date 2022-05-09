package com.programacionOO.tema10.practica06;

import java.util.HashMap;

public class Traducir {
    private HashMap<String,String> dicionario;

    public Traducir() {
        dicionario = new HashMap<>();
    }

    public String traducir(String key){
        if (key != null){
            return dicionario.get(key);
        }
        return null;
    }
    public boolean introducir(String key, String value){
        if(key != null && value != null){
            dicionario.put(key, value);
            return true;
        }
        return false;
        //throw new exception , add thows declaration in method declaration
    }
}
