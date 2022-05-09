package com.programacionOO.tema07.practica22;

import com.programacionOO.libs.Util;

public class Practica22{
    public static void main(String[] args) {
        final int VALUE = 10;
        int p[] = new int[VALUE];
        int s[] = new int[VALUE];
        
        p = Util.insertArray(p.length);
        Util.showArray(p);

        s = mayorValueArray(p, VALUE);
        Util.showArray(s);
    }
    public static int[] mayorValueArray(int[] vector, int value) {
        int r[] = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > value) {
                r[i] = vector[i];
            }
            else if(vector[i] <= value){
                r[i] = -1;
            }
        }
        return r;
    }

}
// 22. Escribe un programa que permita introducir un array P de 10 elementos numéricos, visualizar su
// contenido y crear otro array S con los elementos de P que sean mayores de 10 (cuando los
// elementos sean <=10, se pondrá un -1). Visualizar después el contenido de S.