package com.programacionOO.tema02.practica02;

import java.util.Scanner;
public class Division{

	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double resultado, dividendo, divisor;

		System.out.println("Vamos a dividir!! Introduce un número");
		dividendo = Double.parseDouble(lector.nextLine());
		System.out.println("Introduce otro número ");
		divisor = Double.parseDouble(lector.nextLine());
		lector.close();

		//Ecuacion
		resultado = dividendo / divisor;

		System.out.println("El resultado es : " + resultado);


		
	}
}
