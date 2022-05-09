package com.programacionOO.tema01.practica03;

import java.util.Scanner;
public class Fecha {

	public static void main(String[] args){
		String nombre = "", fecha = "";
		Scanner lector = new Scanner(System.in);
	
		System.out.println("Introduce tu nombre");
		nombre = lector.nextLine();
		
		System.out.println("Introduce tu aficion fecha de nacimiento en el formato dd/mm/yyyy");
		fecha = lector.nextLine();
		lector.close();
		
		System.out.println("Procesando...");
		System.out.println("Tu nombre es " + nombre + " y te fecha de cumpleaños " + fecha);
		System.out.println("Un saludo");
		
	}

}
