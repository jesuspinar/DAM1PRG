package com.programacionOO.tema12.practica05;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Objects;

public class GestionarArchivos {
    private static StringBuilder tabConcat = new StringBuilder();
    private static boolean isDir;
    private static boolean isInside;
    /**
     * Crea un archivo con el nombre archivo
     * Nota : maneja excepcion IOException
     * @param directorio
     * @param archivo
     * @return
     */
    public static boolean crearArchivo(String directorio, String archivo) {
        File file = new File(directorio,archivo);
        try {
            if(file.createNewFile()){
                System.out.println("Creado correctamente");
                return true;
            }
        }
        catch (IOException ioe){
            System.err.println("Error creacion");
        }
        return false;

    }

    /**
     * Visualizará el contenido del directorio
     * mostrando el tipo (fichero “f” , directorio “d”),
     * el tamaño y
     * los permisos de lectura y escritura
     * @param directorio
     * @param index makes tap grow
     */
    public static void listarDirectorio(String directorio,int index){
        File file = new File(directorio);
        StringBuilder sb = new StringBuilder();
        String tabSize="";
        double  sizeMB;

        if (file.isDirectory()){

            for (File i : file.listFiles()) {

                sizeMB = i.length() / (1024*1024);

                if (i.isDirectory()) {
                    sb.append("d-");
                    isDir = true;
                }else{
                    sb.append("f-");
                }

                if(file.canRead() && file.canWrite() && file.canExecute())
                    sb.append("r-w-x");
                else if(file.canRead() && file.canWrite())
                    sb.append("r-w");
                else if (file.canRead())
                    sb.append("r");
                else if(file.canWrite())
                    sb.append("w");
                else if (file.canExecute())
                    sb.append("x");

                System.out.printf("%s %s",sb,i.getName());
                System.out.printf(" %.2f MB\n",sizeMB);
                sb.setLength(0);


                if (isDir){
                    //todo : dar indice por cada pasada
                    isInside = true;
                    listarDirectorio(i.getAbsolutePath(),index++);
                }
            }
        }

    }

    /**
     * Visualiza el nombre, la ruta absoluta, si se puede escribir,
     * si se puede leer, el tamaño, si es un directorio o si es un archivo
     * @param directorio
     * @param archivo
     */
    public static void verInfo(String directorio, String archivo){
        File file = new File(directorio);
        long fechaActual = file.lastModified();
        long sizeBytes = file.length();
        double sizeKB = file.length() / 1024;
        double  sizeMB = file.length() / (1024*1024);
        SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.printf("Path: %s\n",file.getAbsolutePath());
        if(file.isFile()){
            System.out.printf("\nName: %s\n", file.getName());
            System.out.printf("Esta oculto: %s\n", file.isHidden());
            System.out.printf("Lectura: %s\n",file.canRead());
            System.out.printf("Escritura: %s\n",file.canWrite());
            System.out.printf("Ejecutable: %s\n",file.canExecute());

            System.out.printf("Ultima modificación : %s\n",smp.format(fechaActual));

            System.out.printf("Tamaño en bytes : %d\n",sizeBytes);
            System.out.printf("Tamaño en KB : %.2f\n",sizeKB);
            System.out.printf("Tamaño en MB : %.2f\n",sizeMB);
        }

    }



}
