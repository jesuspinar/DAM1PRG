package com.programacionOO.tema02.practica04;

import java.util.Scanner;
public class Radio{

	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double longitud, area, radio;	
		System.out.println("Esto calcula el area y la longitud!! Introduce el radio");
		radio = Double.parseDouble(lector.nextLine());
		lector.close();
		
		//Ecuacion algoritmica
		area = Math.PI * (radio * 2); 
		longitud = Math.PI * (radio * radio);
		
		
		//radio = longitud /(2 * radio);
		System.out.println("El area es " + area + " y la longitud es " + longitud );


		
	}
}
