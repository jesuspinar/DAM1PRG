package com.programacionOO.tema03.practica07;

import java.util.Scanner;
public class Golf{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int edad;
		double cuotaBase = 500;
		double cuotaMayor65 = 0.5, 
		       cuotaMenor18siSocio = 0.65,
		       cuotaMenor18noSocio = 0.75;
		
		
		//*******RECOGIDAD DATOS******//
		System.out.println("Bienvenido al club la sella");
		System.out.println("Dime tu edad");
		edad = Integer.parseInt(lector.nextLine());
		
		//*******ECUACION******//
		if (edad < 19){
			//COMPROCION PADRES SOCIOS - GUARDANDO 1 CARACTER RESPUESTA//
			System.out.println("Tus padres son socios s/n");
			char socio = lector.nextLine().toCharArray()[0];
			lector.close();
			
			if (socio == 's' || socio == 'S'){
			cuotaBase = cuotaBase * cuotaMenor18siSocio;
			System.out.println("Tu cuota base seria " + cuotaBase + "€");
			}
			else{
				cuotaBase = cuotaBase * cuotaMenor18noSocio;
				System.out.println("Tu cuota base seria " + cuotaBase + "€");
			}
		}
		else if (edad > 64){
			cuotaBase = cuotaBase * cuotaMayor65;
			System.out.println("Tu cuota base seria " + cuotaBase + "€");
		}
		else{
			System.out.println("Tu cuota base seria " + cuotaBase + "€");
		}
		


	}
}
