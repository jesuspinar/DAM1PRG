package com.programacionOO.tema01.practica09;

import java.util.Scanner;

public class EnumColors{
	enum Color {
		DEFAULT,RED, GREEN, BLUE;
	}
	public static void main(String[] args){
	Scanner lector = new Scanner(System.in);
	Color c = Color.DEFAULT;
		
	//Comprobaciones
	String red = "rojo", green = "verde", blue = "azul";
	String resultado = "";
	
	//Entrada
	System.out.println("Escribe un color rojo, verde o azul. ");
	resultado = lector.nextLine();
	lector.close();
	
	//Filtro
		if(resultado.equals(red)){
		  c = Color.RED;
		}
		else if(resultado.equals(green)){
		  c = Color.GREEN;
		}
		else if(resultado.equals(blue)){
		  c = Color.BLUE;
		}
		else{System.out.println("Color erroneo... intentalo otravez ");
		}
	//Salida
	System.out.println("Color seleccionado " + c);
	
	}
}
