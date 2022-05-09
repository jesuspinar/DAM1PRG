package com.programacionOO.tema07.practica10;

import com.programacionOO.libs.Util;

public class Practica10{
    public static void main(String[] args) {
        String frase = Util.askString("Introduce palabra para saber si es polisidroma");
        System.out.println(palisidroma(frase));
        
    }
    public static boolean palisidroma(String s){
		s = s.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
		    .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");

		String invertida = new StringBuilder(s).reverse().toString();
		return invertida.equals(s);
    }
}
// 10. Escribe un método que devuelva true si una palabra es palíndroma
// (se escribe igual de izquierdaa derecha que de derecha a izquierda) 
// y false si no lo es.