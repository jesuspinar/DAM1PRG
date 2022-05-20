package com.programacionOO.tema12.practica13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Practica13 {
    private ArrayList<Integer> data;
    //calcula numero primo y añadelo a un archivo

    public Practica13(String path) {
        data = new ArrayList<>();
        calcularPrimos(0);
        escribirPrimos(path);
    }


    public  boolean escribirPrimos(String file){
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))
            )
        {
            for (int numb : data) {
                bw.write(String.valueOf(numb));
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ocurrio un error de escritura");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public int calcularPrimos(int index){
        for (int i = index; i < 100; i++) {
            if (esPrimo(i)){
                data.add(i);
            }
        }
        return -1;
    }
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
