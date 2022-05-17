package com.programacionOO.tema12.practica09;

import com.programacionOO.tema12.practica05.GestionarArchivos;

import java.io.*;

// 9. Haz un programa con dos métodos que invocaremos desde el principal:

// a) Un método (insertarAlumnos) para insertar todos los elementos de un array en un archivo.
// Será un array con el nombre de los alumnos de clase.
// Se debe insertar cada nombre una línea diferente (utilizar la clase BufferedWriter).

// b) Otro método (eliminarAlumno) que solicite al usuario el nombre del alumno
// que se quiere eliminar del archivo y lo elimine.

public class Practica09 {
    /**
     * Overrides the file content every time that runs
     * @param path
     * @param alumnos
     * @return
     */
    public static boolean insertarAlumnos(String path, String[] alumnos){
        File file = new File(path);
        if(file.isDirectory()) return false;
        try ( //auto-close after try
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            )
        {
            for (int i = 0; i < alumnos.length; i++) {
                bufferedWriter.write(alumnos[i]);
                bufferedWriter.newLine();
            }
        }
        catch (IOException ioe){
            System.err.println("Fallo en la escritura");
            return false;
        }
        return true;
    }

    public static boolean eliminarAlumno(String path,String name) {
        //read file
        File file = new File(path);
//        File copyFile = new File(path);
        try (
             FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             )
        {
            //find name position
            String ln;
            while ((ln = bufferedReader.readLine()) != null) {
                if(name.equalsIgnoreCase(ln)){
                   //copy all file except name possition
                    bufferedWriter.write("algo");
                }else {
                    bufferedWriter.write(ln);
                    bufferedWriter.newLine();
                }
            }


        }
        catch (IOException ioe){
            System.err.println("Fallo en la eliminación");
            return false;
        }

        return true;
    }
}



