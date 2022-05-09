package com.programacionOO.tema01.practica11;

import java.util.Scanner;
public class Consumo{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double primerTanke, segundoTanke, tercerTanke;
		double kmInicio, kmFin, kmTotal, resulTanke, resulMedio;
		//Entrada		
		System.out.println("Vamos a calcular el consumo medio de tu auto en los tres ultimos viajes !!");
		System.out.println("Introduce el total del primer repostaje en € aqui");
		primerTanke = Double.parseDouble(lector.nextLine());

		System.out.println("Introduce el total de km de tu auto aqui");
		kmInicio = Double.parseDouble(lector.nextLine());
		
		System.out.println("Introduce el total del segundo repostaje aqui");
		segundoTanke = Double.parseDouble(lector.nextLine());
		
		System.out.println("Introduce el total del tercer repostaje aqui");
		tercerTanke = Double.parseDouble(lector.nextLine());

		System.out.println("Introduce el total de km de tu auto aqui");
		kmFin = Double.parseDouble(lector.nextLine());
		lector.close();
		
		//Ecuacion 
		kmTotal = kmInicio - kmFin;
		resulTanke = primerTanke + segundoTanke + tercerTanke;
		resulMedio = resulTanke * 100 / kmTotal; 
		
		System.out.println("El consumo medio de tu auto es " + resulMedio);
	}

}
