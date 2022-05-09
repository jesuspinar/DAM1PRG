package com.programacionOO.tema08.practica06;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;

import java.util.Date;
import java.util.GregorianCalendar;

public class Stock {
    private Bici[] bicis;
    private int contador;

    public Stock(int nbicis) {
        generateBike(nbicis);
    }
    private void generateBike(int nbicis){
        Faker faker = new Faker();
        bicis = new Bici[nbicis];
        GregorianCalendar calendar;
        int day = 0, month = 0, year = 0;

        //todo : variables temporales para cada elemento
        //
        for (int i = 0; i < nbicis; i++) {
            day = Util.random(1,30);
            month = Util.random(1,12);
            year = Util.random(2019,2022);
            Bici bici = new Bici(
                faker.number().numberBetween(111111,9999999),
                faker.animal().name(),
                faker.superhero().name(),
                faker.number().numberBetween(4,19),
                faker.number().numberBetween(22,29),
                faker.random().nextBoolean(),
                    new Date(year,month,day),
                faker.number().randomDouble(2,500,1320),
                faker.number().randomDigitNotZero()
            );
            bicis[i] = bici;
        }
        mostrarStock();
    }

    public int contarStock(){
        for (int i = 0; i < bicis.length; i++) {
            contador++;
        }
        return contador;
    }
    public void mostrarStock(){
        for (int i = 0; i < bicis.length; i++) {
            System.out.println(bicis[i].toString());
        }
    }

    public boolean isArrayBicisFull() {
        int ultimaPosicion = bicis.length - 1;

        if(bicis[ultimaPosicion].getReferencia() != 0){
            return true;
        }
        return false;
    }

    public void enlargeBicis(){
        double extraPosicion = bicis.length * 1.5;//puede fallar si el array es demasiado grande

        if(isArrayBicisFull() == true){
            Bici[] bicisExtra = new Bici[(int)extraPosicion];
            for (int i = 0; i < bicis.length; i++) {
                bicisExtra[i] = bicis[i];
            }
            bicis = bicisExtra; //se le pasa el puntero en memoria con las posiciones nuevas
        }
    }


    /*Si array bici[] en la utima posicion == null
     * añadir + posiciones
     */
    //todo : cambiar el nombre comprarBici
    public void setBici(Bici bici) {
        //todo : cambiar ultima posicion a global para reutirzar
        int ultimaPosicion = bicis.length - 1;

        if(isArrayBicisFull() == false){
            bicis[ultimaPosicion] = bici;
        }
        //todo :  else y automatizar la bici
    }

    //todo:  evitar que haya entrada y salida y hacer lo boolean
    public void removeBici(){
        int i = buscarBici(Util.askLong("Indica la referencia del modelo que quieres comprar :"));
        int existencia = bicis[i].getExistencias();
        if (i >= 0 && existencia > 0){
            existencia --;
            bicis[i].setExistencias(existencia);
            System.out.println("Enhorabuena tienes nueva bici");
            System.out.println(bicis[i].toString());
        }else if(i >= 0) {
            System.out.println("No hay existencias");
        }else {
            System.out.println("Algo a fallado vuelve a intentar mas tarde");
        }

    }

    public int getBicisLenght() {
        return bicis.length;
    }

    //Metodos para buscar mostrando resultados

    public int buscarBici(long ref){
        for (int i = 0; i < bicis.length; i++) {
            if (ref == bicis[i].getReferencia()){
                System.out.println(bicis[i].toString());
                return i;
            }
        }
        return -1;
    }
    //todo : devolver un array bicis con las bicis que tiene la marca ..
    public void buscarMarcaBici(String marca){
        for (int i = 0; i < bicis.length; i++) {
            if (marca.equalsIgnoreCase(bicis[i].getMarca())){
                System.out.println(bicis[i].toString());
            }
        }
    }
    public void buscarModeloBici(String modelo){
        for (int i = 0; i < bicis.length; i++) {
            if (modelo.equalsIgnoreCase(bicis[i].getModelo())){
                System.out.println(bicis[i].toString());
            }
        }
    }


}
