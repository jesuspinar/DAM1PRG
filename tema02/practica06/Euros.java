package com.programacionOO.tema02.practica06;

import java.util.Scanner;

public class Euros{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);

		double eur, usd = 0.86, libra = 1.17;
		
		System.out.println("Esto combierte de euros a libras y dolares tipo de cambio actual, introduce una cantidad en €");
		eur = Double.parseDouble(lector.nextLine());
		lector.close();
	
		usd = usd * eur;
		libra = libra * eur; 	
 
		System.out.println("El precio de los euros en dolares es " + usd + " en libras es " + libra);
	}
	

}
