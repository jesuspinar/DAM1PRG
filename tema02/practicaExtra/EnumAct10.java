package com.programacionOO.tema02.practicaExtra;

public class EnumAct10{
	public enum MesAño{
	ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOMBIEMBRE,DICIEMBRE
	}
	public enum NotaMusical{
	DO1, RE1, MI, FA, SOL, LA, SI, RE, DO
	}		
	public enum NotaAlumno{
	INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE
	}
	

	public static void main(String[] args){
		MesAño mes = MesAño.MARZO;
		NotaMusical musicales = NotaMusical.DO;
		NotaAlumno alumno = NotaAlumno.NOTABLE;

		System.out.println("El mes de tu cumple "+ mes.toString());
		System.out.println("Tu canción fav suena más en "+ musicales.toString());
		//Se interpreta auto el tipo de dato no hace falta llamar a toString
		System.out.println("La nota del alumno es "+ alumno);
		
		
	}	
}
