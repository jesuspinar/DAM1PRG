package com.programacionOO.tema03.practica05;

import java.util.Scanner;

public class Notas{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int nota;
		
		System.out.println("Introduce tu nota en número y recibe la calificación en letra");
		nota = Integer.parseInt(lector.nextLine());
		lector.close();
		
		switch (nota){

		case 0 : case 1 : case 2 : case 3 : case 4 : 
			System.out.println("INSUFICIENTE");
		break;
		
		case 5 :
			System.out.println("SUFICIENTE");
		break;
		
		case 6 : 
			System.out.println("BIEN");
		break;
		
		case 7 : case 8 :
			System.out.println("NOTABLE");
		break;
		
		case 9 : case 10 :
			System.out.println("SOBRESALIENTE");
		break;
		}

		if(nota > 10 ){
			System.out.println("ERROR");
		}
		else{
			System.out.println("Terminando...");
		}


	}
}
