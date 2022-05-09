package com.programacionOO.tema03.practicaExtra;

public class Desplazamiento {
	public static void main(String[] args) {
		
		//Variables
		final double  ACELERACION_X = 0.001;
		final double  ACELERACION_Y = 0.0017;
		final int  ALTO = 1000;
		final int  ANCHO = 1000;
		double x = 0, y = 0;
		
		while(x < ANCHO || y < ALTO) {
			if (x < ANCHO){
			x += ACELERACION_X;
			}
			if(y < ALTO){
			y += ACELERACION_Y;
			System.out.println("(" + x + ") , (" + y + ")");
			}
		}
			// System.out.println("(" + x + ") , (" + y + ")");
			// while(y < 1000) {
			// 	y += ACELERACION;
			// 	System.out.println("(" + x + ") , (" + y + ")");
			// }
		}
		
			
	
	}

