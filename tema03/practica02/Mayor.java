package com.programacionOO.tema03.practica02;

import java.util.Scanner;

public class Mayor{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		int numero, numero2;
		
		System.out.println("Este programa dice si es igual mayor o menor ");
		System.out.println("Introduce un número");
		numero = Integer.parseInt(lector.nextLine());

		System.out.println("Introduce otro número");
		numero2 = Integer.parseInt(lector.nextLine());
		lector.close();
		if(numero < numero2){
		System.out.println("El numero " + numero + " es menor que " + numero2);
		}
		else if(numero > numero2){
		System.out.println("El numero " + numero2 + " es mayor que " + numero);
		}
		else{
		System.out.println("Los números son iguales");}	
	}

}

