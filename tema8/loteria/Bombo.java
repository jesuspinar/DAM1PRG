package com.programacionOO.tema8.loteria;

import com.programacionOO.libs.Util;

public class Bombo {
    private static int contadorDescarte = 0;

    private int[] descartes;
    private int[] numeros;

    public Bombo(int n) {
        rellenarBombo(n);
        numeroPremiado();
    }

    private void rellenarBombo(int n){
        descartes = new int[n];
        for (int i = 0; i < n; i++) {
            this.numeros[i] = i;
        }
    }

    private int numeroPremiado(){
        int premio = Util.random(0,numeros.length-1);

        for (int i = 0; i < descartes.length; i++) {
            if (premio == descartes[i]){
                return -1;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (premio == numeros[i]) {
                descartes[contadorDescarte] = premio;
                contadorDescarte++;
                return premio;
            }
        }
        return 0;
    }


}
