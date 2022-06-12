package com.programacionOO.libs;

import java.util.IllegalFormatException;

import static com.programacionOO.libs.Util.lector;

public class Ansi {
    public enum Color {BLACK, RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE, NONE}
    public enum ColorType {FOREGROUND, BACKGROUND}

    public static final String ESC = "\u001b[";
    public static final String RESET = ESC + "0m";

    public static Color randomC() {
        int min = 0;
        int max = Color.values().length - 1;//para NO representar NONE que es el ultimo
        int alea = Util.random(min, max);
        return Color.values()[alea];//genera el numero segun la posicion del color arriba
    }
    public static void print(char c, Color fg, Color bg) {
        printTo(c, -1, -1, false, fg, bg);
    }

    public static void printTo(char c, int col, int row) {
        printTo(c, col, row, false, Color.NONE, Color.NONE);
    }

    public static void printTo(char c, int col, int row, boolean bold, Color fg, Color bg) {
        String fgColor = getColor(fg, ColorType.FOREGROUND);
        String bgColor = getColor(bg, ColorType.BACKGROUND);
        String negrita = (bold ? "1" : "0");// la interrogacion es un if bold equals true=1 else=0
        String color = "";
        //si una de las dos tienen valor imprime
        if(!fgColor.isEmpty() || !bgColor.isEmpty()) {
            color = ESC + negrita;
            color += (!fgColor.isEmpty() ? ";" + fgColor : "");
            color += (!bgColor.isEmpty() ? ";" + bgColor : "");
            color += "m";
        }
        //para el print sin posiciones
        if (row > 0 || col > 0) {
            System.out.print(ESC + row + ";" + col + "f");
        }
        System.out.print(ESC + row + ";" + col + "f");
        System.out.print(color + c);
        if(!color.isEmpty())
            System.out.print(RESET);
        System.out.flush();//aseguar el consumo de salto de linea
    }
    private static String getColorStr(boolean bold, Color fg, Color bg) {
        String fgColor = getColor(fg, ColorType.FOREGROUND);
        String bgColor = getColor(bg, ColorType.BACKGROUND);
        String negrita = (bold ? "1" : "0");
        String color = "";
        if(!fgColor.isEmpty() || !bgColor.isEmpty()) {
            color = ESC + negrita;
            color += (!fgColor.isEmpty() ? ";" + fgColor : "");
            color += (!bgColor.isEmpty() ? ";" + bgColor : "");
            color += "m";
        }
        return color;
    }

    public static String format(String s, boolean bold, Color fg, Color bg, Object...args) {
        String color = getColorStr(bold, fg, bg);
        return color + String.format(s, args) + RESET;
    }

    public static String getColor(Color c, ColorType ct) {
        String result = "";
        if(c != Color.NONE) {
            switch(ct) {
                case FOREGROUND: result = "3" + c.ordinal();break;
                case BACKGROUND: result = "4" + c.ordinal();break;
            }
        }
        return result;
    }

    public static void wait(int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ignored) {}
    }
    public static void clearScreen(){
        System.out.println("Pulsa INTRO para continuar");
        lector.nextLine();
        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();
    }
    public static void hideCursor(){
        System.out.printf(ESC + "?25l");
        System.out.flush();
    }
    public static void showCursor(){
        System.out.printf(ESC + "?25h");
        System.out.flush();
    }
    public static void printVertical(String nombre, int row , int col) {
        clearScreen();
        for (int i = 0; i < nombre.length(); i++){
            printCharAt(nombre.charAt(i), i + row, col);
        }
        System.out.println();
    }
    public static void printCharAt(char caracter,int row, int col){
        //imprime un caracter en la ROW y COLUMN parametrizada
        System.out.print(ESC + row + ";" + col + "f");
        System.out.print(caracter);
        System.out.flush();
    }


















}
