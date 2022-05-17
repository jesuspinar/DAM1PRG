package com.programacionOO.tema12.practica05;

import java.io.*;
import java.text.SimpleDateFormat;


public class GestionarArchivos {
    private static StringBuilder tabConcat = new StringBuilder();
    private static boolean isDir;
    private static boolean isInside;
    /**
     * Creates a file inside the folder
     * Nota : maneja excepcion IOException
     * @param path
     * @param file_name
     * @return
     */
    public static boolean crearArchivo(String path, String file_name) {
        File file = new File(path,file_name);
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
     * It will display the contents of the directory
     * displaying the type (file "f", directory "d"),
     * the size, and
     * the read and write permissions
     * @param path
     * @param index makes tap grow
     */
    public static void listarDirectorio(String path,int index){
        File file = new File(path);
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
     * Displays the name, the absolute path, if it is writable, if it is readable,
     * the size, if it is a directory or a file, if it can be read, the size,
     * if it is a directory or if it is a file
     * @param path
     */
    public static void verInfo(String path){
        File file = new File(path);
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

    /**
     * Returns the content of a txt
     * @param path needs absolute path of the file
     */
    public static void leerTxt(String path) {
        try (FileReader fileReader = new FileReader(new File(path));
            BufferedReader bf = new BufferedReader(fileReader)) {
                String ln;
                while ((ln = bf.readLine()) != null) {
                    System.out.printf("%s", ln);
                }
        }catch (IOException ioe){
            System.err.println("Archivo no valido");
        }
    }

    /**
     * Print the value of a binari file
     * @param path
     */
    public static void printHex(String path){
        try (FileInputStream fr = new FileInputStream(new File(path))){
            byte[] b;
            b = fr.readAllBytes();
            for (int i = 0; i < b.length; i++) {
                System.out.printf("%x ",b[i]);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
