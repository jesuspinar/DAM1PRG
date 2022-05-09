package com.programacionOO.tema02.practica01;

import java.util.Scanner;
public class Resta{

	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int minuendo, sustraendo, resultado;

		System.out.println("Vamos a restar!! Introduce un número");
		minuendo = lector.nextInt();
		System.out.println("Introduce otro número ");
		sustraendo = lector.nextInt();
		lector.close();
		//Ecuacion
		resultado = minuendo - sustraendo;

		System.out.println("El resultado es : " + resultado);


		
	}
}
