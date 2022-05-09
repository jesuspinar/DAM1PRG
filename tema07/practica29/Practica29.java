package com.programacionOO.tema07.practica29;

import com.programacionOO.libs.Util;

public class Practica29 {
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;
    public static final int NUM_ROW = 20;
    public static final int NUM_COL = 3;
    
    public static void main(String[] args) {
        
        double notaMax[] =  new double[NUM_ROW];
        double alumnosNotas[][] = new double[NUM_ROW][NUM_COL];

        //RELLENA NOTAS ALUMNOS
        alumnosNotas = fillRandomDoubleMatrix(alumnosNotas);
        //MUESTRA NOTAS
        printMatrix(alumnosNotas);
        calcMaxim(alumnosNotas);
    
    }
    //todo : devolver void ya que se copia el valor
    public static double[][] fillRandomDoubleMatrix(double m[][]) {
        double mark = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                mark = Util.randomDouble(MIN_MARK, MAX_MARK);
                m[i][j] = mark;
            }
        }
        return m;
    }
    /** 
    * metodo para mostrar la matrix con formato tabla
    */
    public static void printMatrix(double matrix[][]) {
        int cont = 1;
        double media = 0, result = 0;
        System.out.printf("\t\tMOD 1\tMOD 2\tMOD 3\tMEDIA\n\n");
        for(int i = 0; i < matrix.length; i++) {
            System.out.printf("ALUMNO %d  \t",cont++);
            for(int j = 0; j < matrix[i].length; j++) {
                media += matrix[i][j];
                System.out.printf("%.2f\t",matrix[i][j]);
            }
            result = media / NUM_COL;
            media = 0;
            System.out.printf("%.2f\n",result);
        }
    }
    public static void calcMaxim(double matrix[][]) {
        double maxNota = MIN_MARK;
        System.out.printf("\nNOTA MÁXIMA");
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > maxNota) {
                    maxNota = matrix[j][i];
                }
            }
            System.out.printf("\t%.2f",maxNota);
        }
        System.out.println("");
    }

}
