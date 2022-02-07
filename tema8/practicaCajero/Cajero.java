package com.programacionOO.tema8.practicaCajero;

import com.programacionOO.tema8.practicaCajero.config.Config;

import java.util.Scanner;

public class Cajero {
    private Scanner scanner;
    private Proxy proxy;

    public Cajero(Proxy proxy) {
        int opcion;
        this.proxy = proxy;
        scanner = new Scanner(System.in);

        do {
            opcion = mostrarMenuInicial();
            switch (opcion) {
                case 1:
                    insertarTarjeta();
                    opcion = 0;
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
            }
        } while (opcion != 0);
    }

    private void insertarTarjeta() {
        int intentosRestantes = Config.NUMERO_INTENTOS_PIN;
        boolean validado = false;
        do {
            System.out.println("Número tarjeta: ");
            String numeroTarjeta = scanner.nextLine();
            System.out.println("PIN: ");
            String pin = scanner.nextLine();
            validado = proxy.validarCredenciales(numeroTarjeta, pin);
            intentosRestantes--;
            if(validado) {
                int opcion;
                opcion = mostrarMenuPrincipal();
                switch (opcion) {
                    case 1:
                        ingresar(numeroTarjeta);
                        break;
                    case 2:
                        retirar(numeroTarjeta);
                        break;
                    case 3:
                        consultarSaldo(numeroTarjeta);
                        break;
                }
            } else {
                System.out.printf("PIN incorrecto (quedan %d intentos)\n\n", intentosRestantes);
            }

        } while (intentosRestantes > 0 && !validado);
    }

    private void consultarSaldo(String numTarjeta) {
        // TODO consultarSaldo
    }

    private void retirar(String numTarjeta) {
        System.out.println("Cantidad: ");
        double cantidad = Double.parseDouble(scanner.nextLine());
        // TODO retirar
    }

    private void ingresar(String numTarjeta) {
        System.out.println("Cantidad: ");
        double cantidad = Double.parseDouble(scanner.nextLine());
        // TODO ingresar
    }



    private int mostrarMenuPrincipal() {
        int opcion;
        boolean validado = false;
        do {
            System.out.println("***********************");
            System.out.println("** CAJERO AUTOMÁTICO **");
            System.out.println("***********************");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("-------------------");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            validado = opcion >= 0 && opcion <= 3;
        } while(!validado);
        return opcion;
    }

    private int mostrarMenuInicial() {
        int opcion;
        boolean validado = false;
        do {
            System.out.println("***********************");
            System.out.println("** CAJERO AUTOMÁTICO **");
            System.out.println("***********************");
            System.out.println("1. Insertar tarjeta");
            System.out.println("-------------------");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            validado = opcion >= 0 && opcion <= 1;
        } while(!validado);
        return opcion;
    }
}
