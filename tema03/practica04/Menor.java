package com.programacionOO.tema03.practica04;

import java.util.Scanner;
public class Menor {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double primerNumero, segundoNumero;
		
		System.out.println("Orden de números de menor a mayor");
		System.out.println("Introduce un número");
		primerNumero = Double.parseDouble(lector.nextLine());

		System.out.println("Introduce otro número");
		segundoNumero = Double.parseDouble(lector.nextLine());
		lector.close();
		//Ecuacion
		if(primerNumero > segundoNumero){
			System.out.println("El orden de menor a mayor es "+ segundoNumero + " - " + primerNumero );
		}
		else if (segundoNumero > primerNumero) {
			System.out.println("El orden de menor a mayor es " + primerNumero + " - " + segundoNumero);
		}
		else{
			System.out.println("Son identicos no hay orden precedente");
		}
	
	}

}
