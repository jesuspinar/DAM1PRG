package com.programacionOO.tema10.practica08;

import java.util.HashMap;

public class Diccionario {//Modelo
    private HashMap<String,String> palabras;

    public Diccionario() {this(10);
    }

    public Diccionario(int initialCapacity) {
        palabras = new HashMap<>(initialCapacity);
    }
    public boolean addWord(String word,String description) {
        if (!findWord(word)){
            palabras.put(word,description);
            return true;
        }
        return false;
    }
    public boolean modifyWord(String word,String description) {
        if(findWord(word)) {
            palabras.replace(word,description);
            return true;
        }
        return false;
    }
    public boolean deleteWord(String word) {
        if(findWord(word)) {
            palabras.remove(word);
            return true;
        }
        return false;
    }

    /**
     * Returns the key
     * @param word
     * @return
     */
    public String getWord(String word) {
        if(findWord(word)) {
            return palabras.get(word);
        }
        return null;
    }
    /**
     * Returns the entry OR NULL if not exits
     * @param i
     * @return
     */
    public String getWord(int i) {
        return (String) palabras.keySet().toArray()[i];
    }
    public boolean findWord(String word){
        if(word != null && palabras.get(word) != null) {
            return true;
        }
        return false;
    }
    public int getSize(){
        return palabras.size();
    }

    @Override
    public String toString() {
        return "Diccionario" + palabras + "\n";
    }
}
