package com.programacionOO.tema10.practica07;

import java.util.*;

public class Modelo {
    //almacenar los datos fiat
    private Map<String, Float> fiat ;

    public Modelo() {this(10);}

    public Modelo(int intialCapacity) {
        fiat = new HashMap<>(intialCapacity);
    }
    public boolean addCurrency(String name, float type){
        fiat.put(name,type);
        return true;
    }
    public ArrayList<String> getMonedas(String name){
        return new ArrayList<>(fiat.keySet());
    }
//    public Set<Map.Entry<String, Float>> getEntrySet(){
//        return fiat.entrySet();
//    }
    // aqui se hacen las cambios de moneda
    public Double convert(String current, String convert, double quantity){
        float currentValue = (float) fiat.get(current);
        float convertValue = (float) fiat.get(convert);
        if (quantity <= 0){
            return null;
        }
        return quantity = (quantity * convertValue) / currentValue;
    }

    public Map<String, Float> getFiat() {
        return fiat;
    }

    @Override
    public String toString() {
        return "Coins:" + fiat + "\n";
    }
}
