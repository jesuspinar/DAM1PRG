package com.programacionOO.tema12.practica01;

import java.io.File;

public class Practica01 {

    public Practica01(String path) {
        File file = new File(path);
        System.out.printf("Existe : %s", file.exists());
        System.out.printf("\nEs un directorio : %s", file.isDirectory());
    }



}
