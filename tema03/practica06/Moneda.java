package com.programacionOO.tema03.practica06;

import java.util.Scanner;
public class Moneda{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double money, cent1 = 0.01, cent2 = 0.02, cent5 = 0.05, cent10 = 0.10,
		cent20 = 0.20, cent50 = 0.50, eur1 = 1, eur2 = 2 ;
		
		System.out.println("Introduce dinero para saber el cambio en monedas");
		money = Double.parseDouble(lector.nextLine());
		lector.close();
		//Ecuaciones
		cent1 = money * 100;
		cent2 = (money * 100)/2;
		cent5 = (money * 100)/5;
		cent10 = (money * 100)/10;
		cent20 = (money * 100)/20;
		cent50 = (money * 100)/50;
		eur1 = (money * 100)/100;
		eur2 = (money * 100)/200;
		
		System.out.println("El cambio a monedas de 1 centimo es " + cent1);
		System.out.println("El cambio a monedas de 2 centimos es " + cent2);
		System.out.println("El cambio a monedas de 5 centimos es " + cent5);
		System.out.println("El cambio a monedas de 10 centimos es " + cent10);
		System.out.println("El cambio a monedas de 20 centimos es " + cent20);
		System.out.println("El cambio a monedas de 50 centimos es " + cent50);
		System.out.println("El cambio a monedas de 1 euros es " + eur1);
		System.out.println("El cambio a monedas de 2 euros es " + eur2);








	}
}
