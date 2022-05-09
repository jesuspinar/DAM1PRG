package com.programacionOO.tema02.practica05;

import java.util.Scanner;
public class Celsius{

	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double celsius, kelvin, fahrenheit;	
		System.out.println("Esto convierte de celsius a kelvin y fahrenheit!! Introduce la temperatura");
		celsius = Double.parseDouble(lector.nextLine());
		lector.close();
		//Ecuacion algoritmica
		kelvin = 273.15 + celsius;
		fahrenheit = celsius * (9/5) + 32;
				
		System.out.println("Los datos introducidos en celsius son " + celsius + " que en grados kelvin es " + kelvin + " y en fahrenheit es " + fahrenheit );


		
	}
}
