package com.programacionOO.tema07.practica24;

import com.programacionOO.libs.Util;

public class Practica24{
    public static void main(String[] args) {
        int v[] = {0,1,2,3,4,5};
        int p[] = {0,1,2,3,4,5};
        int resutl[] = new int[v.length];
        resutl = arrayFactorial(v, p);
        Util.showArray(resutl);
    }
    public static int[] arrayFactorial(int[] a,int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                a[i] += b[j];
            } 
        }
        return a;
    }
}
// 24. Escribe un programa que permita, a partir de un array V de 50 
// elementos, generar un array P de 50 elementos de forma que:
// P(0) = V(0)
// P(1) = V(0) + V(1)
// P(2) = V(0) + V(1) + V(2)
// ....
// P(49) = V(0) + V(1) + V(2) + ... + V(49)