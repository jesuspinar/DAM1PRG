package com.programacionOO.tema8.PracticaCajero;

import com.programacionOO.libs.Util;

public class Cajero {
    //CONSTRUCTOR DE PRUEBA
    public static Tarjeta clientePrueba = new Tarjeta("Pepe", 120,5543,1111);

    public static void main(String[] args) {
       pedirTarjeta();
       menu();
    }

    public static void pedirTarjeta(){
        long tarjetaCajero;
        int pinTarjeta;
        int intentos = 3;

        System.out.println("Hola bienvenido al cajero BBVA ");

        do{
            tarjetaCajero = Util.askLong("Inserte su numero de tarjeta");
            /*intentos = (intentos == 0) ? System.break: null;
            intentos = (tarjetaCajero != clientePrueba.numTarjeta) ? --intentos:null;*/
        }
        while(tarjetaCajero != clientePrueba.numTarjeta);

        do{
            pinTarjeta = Util.askInteger("Inserte su numero pin");
        }
        while(pinTarjeta == clientePrueba.pin);

        if(tarjetaCajero == clientePrueba.numTarjeta && pinTarjeta == clientePrueba.pin){
           System.out.println("Bienvenido cliente");
        }
        else{
            System.out.println("Lo sentimos intentelo de nuevo");
        }
    }
    public static void mostraMenu(){
        System.out.println("------ BBVA -----");
        System.out.println("-----------------");
        System.out.println("1.Ver saldo");
        System.out.println("2.Ingresar saldo");
        System.out.println("3.Retirar saldo");
        System.out.println("-----------------");
    }
    public static void menu(){
        final int MAX_MENU = 3;
        final int MIN_MENU = 0;
        int exit = 0;
        double dinero = 0;

        mostraMenu();
        do {
            System.out.println("");
            exit = Util.askInteger("Elije una opcion");
            switch (exit){
                case 1:
                    System.out.println("Su saldo es :"+
                    clientePrueba.getSaldo());
                    break;
                case 2:
                    dinero = Util.askDouble("Indique la cantidad a ingresar");
                    clientePrueba.ingresarSaldo(dinero);
                    break;
                case MAX_MENU:
                    dinero = Util.askDouble("Indique la cantidad a retirar");
                    clientePrueba.retirarSaldo(dinero);
                    break;
            }
        }
        while (exit <= MIN_MENU || exit > MAX_MENU);
    }
}
