package com.programacionOO.tema11.practica04;

import java.util.ArrayList;

public class Practica04 {
    private ArrayList<Electrodomestico> electrodomesticos;
    public Practica04() {
        electrodomesticos = new ArrayList<>();
        init();
        for (Electrodomestico elect: electrodomesticos) {
            double precio = elect.precioFinal();
            if (elect instanceof Lavadora  ){
                System.out.printf("Lavadora -> Precio Base = %.2f -> Precio Final = %.2f\n",
                        elect.precioBase,precio);
            }else if(elect instanceof Television){
                System.out.printf("Television -> Precio Base = %.2f -> Precio Final = %.2f\n"
                        ,elect.precioBase,precio);
            }
        }
    }
    private boolean init(){
        // in order to make electrodomestico an object make it non Abstract
        // electrodomesticos.add(new Electrodomestico(35,Color.AZUL,'a',32));
        electrodomesticos.add(new Lavadora());
        electrodomesticos.add(new Television(2,true));
        electrodomesticos.add(new Lavadora(43,32,Color.AZUL,'a', 23));
        electrodomesticos.add(new Television(4,true));
        electrodomesticos.add(new Lavadora(23,32,Color.AZUL,'d', 31));
        return true;
    }
}
