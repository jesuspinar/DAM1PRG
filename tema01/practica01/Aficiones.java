package com.programacionOO.tema01.practica01;

import java.util.Scanner;
public class Aficiones {

	public static void main(String[] args){
		String nombre = "", aficion = "";
		Scanner lector = new Scanner(System.in);
	
		System.out.println("Introduce tu nombre");
		nombre = lector.nextLine();
		
		System.out.println("Introduce tu aficion favorita");
		aficion = lector.nextLine();
		lector.close();
		
		System.out.println("Procesando...");
		System.out.println("Tu nombre es " + nombre + " y te dedicas a " + aficion);
		System.out.println("Un saludo");
		
	}

}
