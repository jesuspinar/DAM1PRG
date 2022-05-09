package com.programacionOO.tema07.practica26;

import com.programacionOO.libs.Util;

public class MatrizBi {
    public static final int N_COL = 8;
    public static final int N_ROW = 4;//matrix.length

    public static int n_row = 0, n_col = 0;
    public static void main(String[] args) {
        int matrix[][] = new int[N_ROW][N_COL];
        int matrixB[][] = new int[N_ROW][N_COL];
        
        
        matrix = fillRandomMatrix(matrix);
        printMatrix(matrix);
        // matrixB = fillTrMatrix(matrix);
        // printMatrix(matrixB);
        // printSumatoriRowMatrix(matrix);
        // printMinMaxValueMatrix(matrix);
        // printMediaValueMatrix(matrix);
        // printNumMatrix(matrix);
        printRow(matrix);
        printCol(matrix);
        
    }
    public static void printMatrix(int matrix[][]){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void printSumatoriRowMatrix(int matrix[][]) {
        int sumatori = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sumatori += matrix[i][j];
            }
            System.out.println(sumatori);
            sumatori = 0;
        }
    } 
    public static void printMinMaxValueMatrix(int matrix[][]) {
        int min = 0,max = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
                else if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.printf("Max Value : %d",max);
        System.out.printf("Min Value : %d",min);
    }
    public static void printMediaValueMatrix(int matrix[][]) {
        double media = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                media += matrix[i][j];
            }
        }
        media = media / (N_COL + N_ROW);
        System.out.println("Media Value : " + media);
    }
    public static void printNumMatrix(int matrix[][]) {
        n_row = Util.askInteger("Introduce el Nº fila de la matriz?");
        n_col = Util.askInteger("Introduce el Nº columna de la matriz?");
        System.out.println("El numero correspondiente es :" + matrix[n_row][n_col]);
    }
    public static void printRow(int matrix[][]){
        n_row = Util.askInteger("Introduce el Nº fila de la matriz?");
        if (n_row < N_ROW) {
            for(int i = n_row; i <= n_row; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                }
            System.out.println("");
            }
        }
        else{
            System.out.println("Fila fuera de rango ");
        }
        
    }
    public static void printCol(int matrix[][]){
        n_col = Util.askInteger("Introduce el Nº columna de la matriz?");
        if (n_col < N_COL) {
            System.out.println("");
            for(int i = 0; i < N_ROW; i++) {
                System.out.print(matrix[i][n_col]);
                System.out.println("");
            }
        }
        else{
            System.out.println("Columna fuera de rango ");
        }
        
    }

    public static int[][] fillRandomMatrix(int matrix[][]) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Util.random(0,9);
            }
        }   
        return matrix;     
    }
    /**
     * Makes trasposed x, y to y, x
     * @param matrix
     * @return
     */
    public static int[][] fillTrMatrix(int matrix[][]){
        int matrixTr[][] = new int[N_COL][N_ROW];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrixTr[j][i] = matrix[i][j];
            }
        }
        return matrixTr;
    }

    
}
// 26. Crea una matrixA de 4 filas y 8 columnas de enteros (aleatorios) y a continuación visualiza: 
// a) Toda la matrixA (por filas)
// b) La matrixB traspuesta (por columnas)
// c) La matrixA por filas con la suma total de cada fila
// d) Los valores máximo y mínimo de la matrix
// e) La media de toda la matrix
// f) El elemento que nos indique el usuario (Dime la fila? Dime la columna? )
// g) La fila que nos indique el usuario
// h) La columna que nos indique el usuario

// i) Guarda en la columna 8 el total de todas las anteriores.