package com.programacionOO.libs;

import java.util.Scanner;

public class PintarVertical {
    final static String ESC = "\u001b[";
    public static void main(String[] args) {
        final int ROW = 2;
        final int COLUMN = 40;
        Scanner lector = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("Dime tu nomnbre");
        nombre = lector.nextLine();
        lector.close();
        
        Util.printVertical(nombre, ROW, COLUMN);
    }
}
