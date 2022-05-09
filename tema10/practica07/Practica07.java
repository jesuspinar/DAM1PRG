package com.programacionOO.tema10.practica07;

import com.programacionOO.libs.Util;

public class Practica07 {
//esta es la vista donde concta con el usuario
    private Modelo modelo;

    public Practica07() {
        modelo = new Modelo();
        defaultValues();
        int opcion ;
        do {
            opcion = mainMenu();
            switch (opcion) {
                case 1:
                    System.out.printf("%.2f\n",fiatConvert());
                    break;
                case 2:
                    addFiat();
                    break;
                case 3:
                    printFiat();
                    break;

            }
        }while (opcion >= 1 && opcion <= 3 );
    }
    public void printFiat(){
        System.out.println(modelo);
    }

    public Double fiatConvert(){
        String current = Util.askString("Whats your coin?").toUpperCase();
        String convert = Util.askString("Whats conversion coin?").toUpperCase();
        double quantity = Util.askDouble("Enter quantity:");
        return modelo.convert(current,convert,quantity);
    }
    public boolean addFiat(){
        //todo implement ValidateFiat on external class
        String newFiat = Util.askString("Please enter your coin").toUpperCase();
        float value = Util.askFloat("Please enter a value");
        modelo.addCurrency(newFiat,value);
        System.out.println("Coin updated !");
        return true;
    }

    public int mainMenu(){
        int opcion = -1;
        System.out.println("1.-Fiat convert");
        System.out.println("2.-Add fiat");
        System.out.println("3.-Show fiat");
        System.out.println("0.-Exit");
        return Util.askInteger("Choose");
    }

    private void defaultValues(){

        modelo.addCurrency("USD",1.10f);
        modelo.addCurrency("EUR",1.04f);
        modelo.addCurrency("GBP",0.84f);
        modelo.addCurrency("INR",83.47f);
        modelo.addCurrency("AUD",1.47f);
        modelo.addCurrency("CAD",1.38f);
        modelo.addCurrency("ARS",121.44f);

    }

}
