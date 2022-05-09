package com.programacionOO.tema07.practica27;

import com.programacionOO.libs.Util;

public class Practica27{
    public static void main(String[] args) {
        final int N_P = 20, N_V = 50;
        int v[] = new int[N_V];
        int p[] = new int[N_P];
        int m[][] = new int[v.length][p.length]; 
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = v[i] * p[j];
            }
        }
    }
}
