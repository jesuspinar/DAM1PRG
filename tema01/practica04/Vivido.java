package com.programacionOO.tema01.practica04;

import java.util.Scanner;
public class Vivido{
	public static void main(String[] args){
	Scanner lector = new Scanner(System.in);
	int edad, dias = 365;
	
	System.out.println("Cuantos años tienes?");
	edad = lector.nextInt();
	lector.close();
	//Ecuacion
	dias = edad * dias;

	System.out.println("Enhorabuena!! Has vivido ya un total de : " + dias + " dias");

	
	}
}
