package com.programacionOO.tema04salida.practica09;
import java.util.Scanner;
public class Practica09 {
    public static void main(String[] args) throws InterruptedException {
        Scanner lector = new Scanner(System.in);

        //COLORES
        String scape = "\u001B[";
        String scapefinal = "\u001B[0m";
        String verde = "32";
        String azul = "36";
        String amarillo = "33";
        String rojo = "31";
        String magenta = "35";

        //COLORES
        String colorViento = "";
        String colorTemper = "";
        String colorLluvia = "";
        String colorUvi = "";
        String espaciado = "";

        // String ciudad = "";
        // int dia, mes, año; //dd:mm:yyyy
        // int hora, minutos, segundos;//hh:mm:ss
        // int viento; //Km/h
        // double temperatura; //en celsius
        // double atmosfera;//presion atmosferica hPa
        // int lluvia; //provabilidad lluvia 0-100%
        // int uvi; //radiacion ultravioleta

        String ciudad = "Denia";
        int dia=2, mes=12, año=2001; //dd:mm:yyyy
        int hora=2, minutos=30, segundos=12;//hh:mm:ss
        int viento=33; //Km/h
        double temperatura=12; //en celsius
        double atmosfera=1200.23;//presion atmosferica hPa
        int lluvia=50; //provabilidad lluvia 0-100%
        int uvi=12; //radiacion ultravioleta

        /*** RECOGIDA DATOS ***/
        // System.out.println("Resumen del clima en tu zona");
        // System.out.println("Introduce tu ciudad");
        // ciudad = lector.nextLine();

        // //DIA, MES, AÑO
        // do {
        //     System.out.println("Introduce el dia");
        //     dia = Integer.parseInt(lector.nextLine());
        // } while (dia < 1 || dia > 31);
        // do {
        //     System.out.println("Introduce el mes");
        //     mes = Integer.parseInt(lector.nextLine());
        // } while (mes < 1 || mes > 12);
        // do {
        //     System.out.println("Introduce el año 2000-2022");
        //     año = Integer.parseInt(lector.nextLine());
        // } while (año < 2000 || año > 2022);

        // //HORA ,MINUTOS Y SEGUNDOS
        // do {
        //     System.out.println("Introduce el hora");
        //     hora = Integer.parseInt(lector.nextLine());
        // } while (hora < 0 || hora > 23);
        // do {
        //     System.out.println("Introduce el minutos");
        //     minutos = Integer.parseInt(lector.nextLine());
        // } while (minutos < 0 || minutos > 59);
        // do {
        //     System.out.println("Introduce el segundos");
        //     segundos = Integer.parseInt(lector.nextLine());
        // } while (segundos < 0 || segundos > 59);

        // //VIENTO
        // do {
        //     System.out.println("Introduce la velocidad del viento aproximada Km/h");
        //     viento = Integer.parseInt(lector.nextLine());
        // } while (viento < 0 || viento > 130);

        // //TEMPERATURA (decimal)
        // do {
        //     System.out.println("Introduce la temperatura aproximada Cº");
        //     temperatura = Double.parseDouble(lector.nextLine());
        // } while (temperatura < -30 || temperatura > 60);
        
        // //ATMOSFERA (decimal)
        // do {
        //     System.out.println("Introduce la presion Atmosferica hPa ");
        //     atmosfera = Double.parseDouble(lector.nextLine());
        // } while (atmosfera < 0 || atmosfera > 2000);

        // //LLUVIA
        // do {
        //     System.out.println("Introduce la provabilidad de lluvia 0-100%");
        //     lluvia = Integer.parseInt(lector.nextLine());
        // } while (lluvia < 0 || lluvia > 100);

        // //RADIACION UVI
        // do {
        //     System.out.println("Introduce la radiacion ultravioleta 0-12");
        //     uvi = Integer.parseInt(lector.nextLine());
        // } while (uvi < 0 || uvi > 12);
        // /*** FIN RECOGIDA DATOS ***/
        // lector.close();

        //MANIPULACION DE DATOS ....
        //
        //VIENTO 
        if (viento < 30)
            colorViento = verde;
        else if(viento >= 30 && viento <=60)
            colorViento = amarillo;
        else
            colorViento = rojo;
        //
        //TEMPERATURA
        if (temperatura < 22)
            colorTemper = azul;
        else if(temperatura >= 22 && temperatura <=27)
            colorTemper = verde;
        else if(temperatura >= 28 && temperatura <=35)
            colorTemper = amarillo;
        else
            colorTemper = rojo;
        //
        //LLUVIA 
        if (lluvia < 35)
            colorLluvia = verde;
        else if(lluvia >= 35 && lluvia <70)
            colorLluvia = amarillo;
        else
            colorLluvia = rojo;
        //
        //RADIACION UVI
        if (uvi < 2)
            colorUvi = verde;
        else if(uvi >= 3 && uvi <=5)
            colorUvi = azul;
        else if(uvi >= 6 && uvi <=7)
            colorUvi = amarillo;
        else if(uvi >= 8 && uvi <=10)
            colorUvi = rojo;
        else
            colorUvi = magenta;
        //
        

        //SALIDA DE DATOS ....
        System.out.printf(scape + "1;37;44m"+ "*** DATOS ESTACIÓN METEREOLÓGICA ***" + scapefinal + "\n");
        System.out.printf("Ciudad :%17s %s\n",espaciado,ciudad);
        System.out.printf("Fecha :%18s %02d/%02d/%04d\n",espaciado,dia,mes,año);
        System.out.printf("Hora actual : %11s %02d:%02d:%02d\n",espaciado,hora,minutos,segundos);
        System.out.printf("Velocidad viento :" + scape + colorViento +"m%7s %s\n" + scapefinal, espaciado, viento + "km/h");
        System.out.printf("Temperatura :" + scape + colorTemper +"m%12s %s\n" + scapefinal, espaciado, temperatura + "Cº");//falta decimal
        System.out.printf("Presión atmosférica :%4s %s\n", espaciado, atmosfera + "hPa");
        System.out.printf("Probabilidad lluvia :" + scape + colorLluvia +"m%4s %s\n" + scapefinal, espaciado, lluvia + " %");
        System.out.printf("Radiacion Ultravioleta :" + scape + colorUvi +"m%1s %s\n" + scapefinal, espaciado, uvi);
        lector.close();
    }
}
