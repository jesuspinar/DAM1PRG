package com.programacionOO.tema02.practica03;

import java.util.Scanner;
public class Segundos{

	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int segundos, minutos, horas , dias;	
		System.out.println("Esto combierte a horas, minutos, segundos!! Introduce segundos");
		segundos = lector.nextInt();
		lector.close();
		//Ecuacion algoritmica
		minutos = segundos / 60;
		segundos = segundos % 60;
		horas = minutos / 60 ;
		minutos = minutos % 60;
		dias = horas / 24;
		horas = horas % 24; 		
			
		System.out.println("El desglose es " + "días "+dias + " horas "+horas + " minutos "+minutos + " segundos "+segundos );


		
	}
}
