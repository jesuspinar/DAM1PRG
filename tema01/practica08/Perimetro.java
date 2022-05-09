package com.programacionOO.tema01.practica08;

import java.util.Scanner;

public class Perimetro{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int perimetro;
		int area;
		int altura;
		int base;
	
		System.out.println("Indica la altura del rectángulo");
		altura = lector.nextInt();
		
		System.out.println("Indica la base del rectángulo");
		base = lector.nextInt();
		lector.close();

		//Ecuacion
		perimetro = (base * 2) + (altura * 2);
		//Ecuacion 
		area = base * altura;		


		//Impresion
		System.out.println("El perimetro del rectangulo seria :" + perimetro);
		System.out.println("El area del rectangulo seria :" + area);
	}
}
