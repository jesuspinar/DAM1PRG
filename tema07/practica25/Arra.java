package com.programacionOO.tema07.practica25;

import java.util.Arrays;

public class Arra {
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3};
        System.out.println(a);
        int[] b = a; 
        System.out.println(b);
        a[0] *= 10; 
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
