package com.programacionOO.tema04.practica16;

import java.util.Random;
import java.util.Scanner;

public class Practica16 {
    public static void main(String[] args) throws InterruptedException {

        final int PUNTOSMAX = 5;
        final int NUMEROMAX = 11;
        final int DADOMAX  = 6;
        final int DADOMIN  = 1;
        
        
        Scanner lector = new Scanner(System.in);
        Random numerRandom = new Random();

        String jugar = "";
        int ronda = 0;
        int numeroCPU = 0, numeroUsuario = 0 ;
        int acomuladoCPU = 0, acomuladoUsuario = 0 ;
        int puntosCPU = 0, puntosUsuario = 0 ;
        boolean salir = false, sePlanta = false;
        
        //EMPIEZA EL JUEGO
        System.out.println("*******************************************");
        System.out.println("Hola! Bienvenido al blackjack de 11 puntos ");
        System.out.println("*******************************************");
        System.out.println(" -> Cada 2 turnos se resetean los puntos del dado");
        System.out.println(" -> Ganara el primero de que consiga 5 porras");
        do {
            //ENTRADA DE DATOS 
            System.out.println("Quieres lanzar el dado? Si/No");
            jugar = lector.nextLine();

            
            //Comprueba 
            if (jugar.equalsIgnoreCase("no") || jugar.equalsIgnoreCase("n")) {
                //Cambia de turno
                sePlanta = true;
            }
            else{
                System.out.println("Elegiste lanzar dado");
            }

            //LANZA EL DADO USUARIO SI NO SE PLANTA
            if(sePlanta == false){
                acomuladoUsuario = numeroUsuario;
                numeroUsuario = numerRandom.nextInt(DADOMAX - DADOMIN + 1) + DADOMIN;
                System.out.print("Te salio el " + numeroUsuario + " + acomulado " + acomuladoUsuario + " = ");
                System.out.println(numeroUsuario += acomuladoUsuario);

                // Comprobacion puntos JUGADOR 
                if (numeroUsuario == NUMEROMAX) {
                    puntosUsuario = puntosUsuario + 2;  
                    System.out.println("Enohorabuena Ganaste la Ronda, tu PUNTUACION es de " + puntosUsuario);
                }
                else if (numeroUsuario > NUMEROMAX) {
                    System.out.println("Lo siento te pasaste y perdiste, gana la CPU");  
                    puntosCPU ++;  
                }
            }

            //LANZA EL DADO MAQUINA SIEMPRE
            if (numeroUsuario >= DADOMIN && numeroUsuario < NUMEROMAX){
                System.out.println("Continua el juego, turno de la CPU");
                System.out.println("Lanzando dados...... Listo !");
                acomuladoCPU = numeroCPU;
                numeroCPU =  numerRandom.nextInt(DADOMAX - DADOMIN + 1) + DADOMIN;
                
                System.out.print("La CPU saco " + numeroCPU + " + acomulado " + acomuladoCPU + " = ");
                System.out.println(numeroCPU = numeroCPU + acomuladoCPU);

                // Reparto puntos CPU
                if (numeroCPU == NUMEROMAX) {
                    puntosCPU += 2;  
                    System.out.println("Que suerte la CPU obtuvo una puntuacion de " + NUMEROMAX);
                } 
                else if(numeroCPU > numeroUsuario && numeroCPU < NUMEROMAX ){
                    System.out.println("La CPU gana la ronda con una puntuacion de " + numeroCPU + " frente a " + numeroUsuario);
                    puntosCPU ++;  
                }
                else {
                    System.out.println("Vaya increible es tuya la ronda con una puntuacion de " + numeroUsuario +" frente a "+ numeroCPU);
                    puntosUsuario ++;  
                }
            }

            //COMPROVACION PORRA GANADORA 
            if (puntosUsuario >= PUNTOSMAX) {
                salir = true;
                
            }
            else if(puntosCPU >= PUNTOSMAX ) {
                salir = true;
            }

            //RESUMEN DE LA PUNTUACION AQUI 
            System.out.println("----------------MARCADOR----------------");
            System.out.println("PUNTOS PORRA  Usuario: " + puntosUsuario +" -> CPU : "+ puntosCPU);
            System.out.println("PUNTOS DADOS  Usuario: " + numeroUsuario +" -> CPU : "+ numeroCPU);
            System.out.println("----------------------------------------");

            //cada 2 rondas numeroUsuario y numeroCPU a 0
            ronda++;
            if (ronda > 1 && salir == false) {
                numeroCPU = 0;
                numeroUsuario = 0;
                ronda = 0;
                sePlanta = false;
                System.out.println("************* NUEVA TANDA **************");
                System.out.println("PUNTOS DADOS  Usuario: " + numeroUsuario +" -> CPU : "+ numeroCPU);
                System.out.println("----------------------------------------");
            }

        } while (salir == false);
        System.out.println("Fin de la partida");
        lector.close();

    }
}
