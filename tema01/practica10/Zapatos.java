package com.programacionOO.tema01.practica10;

public class Zapatos{

	public static void main(String[] args){
		double precioZapatos = 85, descuento = 15, conDescuento, resultado;
		
		//Ecuacion para %
		conDescuento = precioZapatos * descuento / 100;
		resultado = precioZapatos - descuento;
		
		System.out.println("El descuento de los zapatos es " + conDescuento);
		System.out.println("El precio con descuento es " + resultado);
	}
}
