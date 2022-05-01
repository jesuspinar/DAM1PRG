package com.programacionOO.libs;
import java.io.IOException;
import java.util.*;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class Util{
    final static String ESC = "\u001b[";
    final static String ESCFINAL = "\u001B[0m";
    public static final Scanner lector = new Scanner(System.in);


    /****** CON return ******/
    public static int random(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min+1)+min;
    }
    public static double randomDouble(int min, int max){
        Random r = new Random();
        return r.nextDouble()*(max-min)+min;
    }
    public static float randomFloat(int min, int max){
        Random r = new Random();
        return r.nextFloat()*(max-min)+min;
    }
    public static float randomFloat(float min, float max){
        Random r = new Random();
        return r.nextFloat()*(max-min)+min;
    }
    public static int factorial(int n) {
        int result = 1;
        if(n >= 0){
            for(int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }
        else//devolcer excepcion
            return result = -1;
    }
    public static int noNegativos(int num1) {
        //"assert" palabra reservada de java para validar tipo dato
        //si saliese negativo no salta a no ser que en la compilacion
        //lo indiques con javac -ea
        assert num1 >= 0;
        return num1;
    }
    public static String askString(String s) {
        System.out.println(s);
        return lector.nextLine();
    }

    public static String askStringRestricted(String s, int minLength,int maxLength) {
        boolean isValid = false;
        String data;
        do {
            System.out.println(s);
            data = lector.nextLine();
            isValid = (data.length() >= minLength && data.length() <= maxLength);
            if (!isValid) {
                System.out.printf("Min string length = %s \nMax length = %s ",minLength, maxLength);
            }

        }while (!isValid);
        return data;
    }
    public static int askInteger(String s){
        boolean isValid = false;
        int data = 0;
        do {
            try {
                System.out.println(s);
                data = Integer.parseInt(lector.nextLine());
                isValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Enter numbers only");
            }
        }while (!isValid);
        return data;
    }
    public static int askInteger2(String s,int min, int max) {
        boolean isValid = false;
        int data;
        do {
            data = askInteger(s);
            isValid = data >= min && data <= max;
            if (!isValid)
                System.out.printf("el numero tiene que estar entre %d , %d\n", min,max);
        }while (!isValid);
        return data;
    }

    public static double askDouble(String s) {
        boolean isValid = false;
        double data = 0;
        do {
            try {
                System.out.println(s);
                data = Double.parseDouble(lector.nextLine());
                isValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Enter numbers only");
            } //todo : enviar excepcion al metodo superior
        }while (!isValid);
        return data;
    }
    public static long askLong(String s) {
        System.out.println(s);
        return Long.parseLong(lector.nextLine());
    }
    public static float askFloat(String s) {
        System.out.println(s);
        return Float.parseFloat(lector.nextLine());
    }
    public static int calcularEdad(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
        // Aún no es el mes de su cumpleaños o
        // es el mes pero no ha llegado el día.
        if(months < 0 || (months==0 && days < 0)) {
            years--;
        }
        return years;
    }

    public static int contarVocal(String s) {
        int contadorVocal = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                case 'á': case 'é': case 'í': case 'ó': case 'ú':
                case 'à': case 'è': case 'ì': case 'ò': case 'ù':
                    contadorVocal++;
                break;
            }   
        }
        return contadorVocal;
    }
    public static int contarConsonante(String s) {
        int contadorConsonante = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'b': case 'c': case 'd': case 'f': case 'g':
                case 'h': case 'j': case 'k': case 'l': case 'm':
                case 'n': case 'ñ': case 'p': case 'q': case 'r':
                case 's': case 't': case 'v': case 'w': case 'x':
                case 'y': case 'z': 
                    contadorConsonante++;
                break;
            }
        }
        return contadorConsonante;
    }
    public static int contarPalabra(String s) {
        int contadorPalabra = 1;
        String space = s.replaceAll("\\s+", " ");//replaza dobles spacios
        s = space.trim();//quita spacios finales
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ' ':
                    contadorPalabra++;
                break;
            }   
        }
        return contadorPalabra;
    }
    public static int[] insertArray(int arrayLength){
        int a[] = new int[arrayLength];
        for (int i = 0; i < a.length; i++) {
            a[i] = Util.askInteger("Insert value for position " + i);
        }
        return a;
    }
    /**
    * @return random int array
    */
    public static int[] randomArrayInt(int size, int min, int max) {
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Util.random(min, max);
        }
        return a;
    }

    /**
    * @return random double array
    */
    public static double[] randomArrayDouble(int size, int min, int max) {
        double a[] = new double[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = Util.randomDouble(min, max);
        }
        return a;
    }
    /**
     * Possible filter value by integer
     * @param rate set 0 to default
     * @param a array 
    * @return media of double array
    */
    public static double mediaArray(double[] a, int rate) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= rate) {
                result = a[i] + result;
            }
        }
        return result / a.length;
    }
    public static double[] reverseArray(double[] a) {
        double[] newArray = new double[a.length];
        int cont = 0;
        for (int i = a.length; i >= 0; i--) {
            newArray[cont++] = a[i];
            // cont++;
        }
        return newArray;
    }

    /**
     * Random dni generator, does not ensure unique results
     * @return String
     */
    public static String randomDNI(){
        String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";
        int num = (int)Math.floor((Util.randomFloat(0.1f,0.9f) * 99999999) + 1);
        int pos = num % 23;
        return  num + "" + dniChars.charAt(pos);
    }

    public static boolean validarDNI(String input) {
        String dniChars = "TRWAGMYFPDXBNJZSQVHLCKE";
        //removing spaces
        String num = input.trim().replaceAll(" ", "").substring(0, 7);
        if (input.charAt(8) < 10) {
            return false;
        }
        //getting letter
        char letter = input.charAt(8);
        //getting num on letter position
        int valid = Integer.parseInt(num) % 23;
        if (input.length() != 9 && !isNumeric(num) && dniChars.charAt(valid) != letter) {
            return false;
        } else {
            return true;
        }
    }
    public static int fact(int n){
        if(n == 0 )return 1;
        else return n * fact(n-1);
    }

    /**
     * Generartes a random date min 18
     * @return
     */
    public static GregorianCalendar generarFechas(int minYear){
        int currentYear = new GregorianCalendar().get(Calendar.YEAR);
        currentYear-=18;
        return new GregorianCalendar(Util.random(minYear, currentYear),
                Util.random(Calendar.JANUARY, Calendar.DECEMBER), Util.random(1,28));
    }
    //todo crear nif randoms reales(duplicados o no)


    /****** SIN return ******/

    public static void analizarString(String s) {
        s = s.replaceAll("\\s+", " ");//elimina spacios de +
        s = s.trim();//asegura eliminar spacios
        s = s + " ";//forzar mostrar ultima palabra
        String receptor = "";
        int lenghtString = s.length();
        for (int i = 0; i < lenghtString; i++) {
            if(s.charAt(i) != ' ') {
                receptor = receptor + s.charAt(i);
            }else if(s.charAt(i) == ' '){
                System.out.printf("La palabra %s tiene %d vocales y %d consonantes \n",
                receptor,contarVocal(receptor),contarConsonante(receptor));
                receptor = "";//se borra al imprimir
            }
        }
    }

    public static void showArray(int a[]){
        System.out.printf("[");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d",a[i]);
        }
        System.out.printf(" ]\n");
    }
    public static void showArray(double a[]){
        System.out.printf("[");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %.2f",a[i]);
        }
        System.out.printf(" ]\n");
    }
    public static void showArray(char a[]){
        System.out.printf("[");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %c",a[i]);
        }
        System.out.printf(" ]\n");
    }

    public static void showParArray(int a[]) {
        for (int i = 0; i < a.length; i+=2) {
            if (a[i] % 2 == 0) {
                System.out.printf("Position array[%d] = %d \n",
                i , a[i]);
            }
        }
    }

    public static void printContador(int num, char c){
        String numStr = String.valueOf(num);
        String charStr = String.valueOf(c);
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9 ; j++) {
                for (int k = 0; k <= 9 ; k++) {
                    for (int l = 0; l < 9; l++) {
                        String s = i + "-" + j + "-" + k + "-" + l;
                        if( i == num || j == num || k == num || l == num ){
                            s = s.replace(numStr, String.valueOf(charStr));
                        }
                        System.out.println(s);
                    }
                }
            }
        }
    }

    /**
     * Search in the array to multiplo and print them
     * @param a
     * @param multi
     *
     **/
    public static void showMultiploArray(int a[], int multi) {
        for (int i = 1; i < a.length; i++) {
            if (multi != 0 && a[i] % multi == 0 ) {
                System.out.printf("Position array[%d] = %d , multiplo %d \n",
                i , a[i], multi);
            }
            if (multi == 0) {
                System.out.printf("Position array[%d] = %d , multiplo %d \n",
                i, 0, 0);
            }
        }
    }
}
