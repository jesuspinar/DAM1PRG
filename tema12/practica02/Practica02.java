package com.programacionOO.tema12.practica02;

import java.io.File;
import java.util.Objects;

public class Practica02 {
    /**
     * Crear un listado de los archivos de un directorio
     * @param path
     */
    public Practica02(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            String[] files = file.list();
            // puede fallar , frenara la ejecucion antes del llegar al null
            for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
                System.out.println(files[i]);
            }
        }
    }
}
