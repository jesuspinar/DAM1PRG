package com.programacionOO.tema12.practica03;

import java.io.File;

public class Practica03 {
    /**
     * propiedades archivo : nombre, ruta absoluta , permisos(leer, escribir)
     */
    public Practica03(String path) {
        File file = new File(path);
        System.out.printf("Name: %s",file.getName());
        System.out.printf("Absolute: %s",file.getAbsolutePath());
        System.out.printf("Lectura: %s",file.canRead());
        System.out.printf("Escritura: %s",file.canWrite());
    }
}
