package com.programacionOO.tema12.practica05;

import java.io.*;
import java.text.SimpleDateFormat;


public class GestionarArchivos {
    public static final String separator = File.separator;
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
    public static String readTxt(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(new File(path));
            BufferedReader bf = new BufferedReader(fileReader)) {
                String ln;
                while ((ln = bf.readLine()) != null) {
                    sb.append(ln);
                    System.out.printf("%s", ln);
                }
        }catch (IOException ioe){
            System.err.println("Archivo no valido");
        }
        return sb.toString();

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
    //10. Haz un método llamado concat que reciba como parámetro 2 archivos
    // y cree un tercer fichero, cuyo contenido, se obtendrá uniendo la información de los 2 archivos indicados.
    // Primero irá el contenido del archivo recibido como primer parámetro y después
    // el contenido del archivo recibido como segundo parámetro.
    public static boolean concat(File file1, File file2){
        File file3 = new File(file1.getPath(),"Test.txt");
        String contentF1;
        String contentF2;
        try(
            FileWriter fileWriter = new FileWriter(file3);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
            )
            {
               contentF1 = readTxt(file1.getAbsolutePath());
               contentF2 = readTxt(file2.getAbsolutePath());

               bufferedWriter.write(contentF1);
               bufferedWriter.write(contentF2);
            }
            catch (IOException e) {
                System.out.println("");
                return false;
            }
        //todo : concatenar el nombre archivo1-archivo2 + extension
        // hacer con sb.split devuelve un array de string y luego obtener
        // la ultima poscion y concatenarla
        return true;
    }

    //11. Haz un método llamado concatLines que reciba como parámetro 2 archivos y cree
    // un tercer archivo, el contenido se obtendrá uniendo la información de los 2 archivos.
    // Cada línea del archivo creado estará formado por la unión de la misma línea de los dos archivos leídos.

    public static void concatLines(File file1, File file2){
        File file3 =new File(file1.getPath(), "concatLines.txt");
        int i = 0;
        String firstLineFile1 ;
        String firstLineFile2 = null;
        try(
            FileReader fileReader1 = new FileReader(file1);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
            FileReader fileReader2 = new FileReader(file2);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
            FileWriter fileWriter3 = new FileWriter(file3);
            BufferedWriter br = new BufferedWriter(fileWriter3);
        )
        {

            while((firstLineFile1 = bufferedReader1.readLine()) != null || (firstLineFile2 = bufferedReader2.readLine()) != null) {
                if (firstLineFile1 != null){
                    br.write(firstLineFile1);
                }
                if(firstLineFile2 != null){
                    br.write(firstLineFile2);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
