package com.programacionOO.tema02.practica07;

import java.util.Scanner;
public class Consumo{
	public static void main(String[] args){
		//Variables
		Scanner lector = new Scanner(System.in);
		double primerTanke, segundoTanke;
		double primerPrecio, segundoPrecio;
		double kmInicio, kmFin, kmTotal;
		double resultadoLitroEur,resultadoFinalKm;

		//Entrada		
		System.out.println("Vamos a calcular el consumo medio de tu auto!!");
		System.out.println("Introduce el precio €/litro de combustible del primer repostaje");
		primerPrecio = Double.parseDouble(lector.nextLine());		
		
		System.out.println("Introduce el total en € del primer repostaje");
		primerTanke = Double.parseDouble(lector.nextLine());

		System.out.println("Introduce el total km de tu auto");
		kmInicio = Double.parseDouble(lector.nextLine());

		System.out.println("Introduce el precio del combustible €/litro del segundo repostaje");
        segundoPrecio = Double.parseDouble(lector.nextLine());

		System.out.println("Introduce el total en € del segundo repostaje aqui");
		segundoTanke = Double.parseDouble(lector.nextLine());
		
		System.out.println("Introduce el total de km de tu auto aqui");
		kmFin = Double.parseDouble(lector.nextLine());
		lector.close();//cierra la recogida de datoss
		
		//Ecuacion 
		kmTotal = kmFin - kmInicio;//devuelve km diferencia
		resultadoLitroEur = ((primerTanke/primerPrecio) + (segundoTanke/segundoPrecio)) ;///2devuelve cantidad de litros 
		resultadoFinalKm = (resultadoLitroEur * 100) / kmTotal;

		//Salida		
		System.out.println("El consumo de litros medio de tu auto es " + resultadoFinalKm);
		System.out.println("El consumo de litros por km es tu auto es " + resultadoFinalKm/100 );
	}

}
