package com.programacionOO.tema12.practica04;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Practica04 {
    /**
     * Los sectores 512 bytes
     * paginas depende del sistema operativo 4 kilobytes
     * pagefile.sis donde esta la memoria virtual en windows
     * swap donde esta la memoria virtual en en linux
     */
    public Practica04(String path) {
        File file = new File(path);
        long fechaActual = file.lastModified();
        long sizeBytes = file.length();
        double sizeKB = file.length() / 1024;
        double  sizeMB = file.length() / (1024*1024);
        SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        if(file != null && !file.isDirectory()){
            System.out.printf("\nName: %s\n", file.getName());
            System.out.printf("Path: %s\n",file.getAbsolutePath());
            System.out.printf("Esta oculto: %s\n", file.isHidden());
            System.out.printf("Lectura: %s\n",file.canRead());
            System.out.printf("Escritura: %s\n",file.canWrite());

            System.out.printf("Ultima modificación : %s\n",smp.format(fechaActual));
            file.setLastModified(new GregorianCalendar().getTimeInMillis());
            fechaActual = file.lastModified();
            System.out.printf("Nueva modificación : %s\n",smp.format(fechaActual));
            System.out.printf("Tamaño en bytes : %d\n",sizeBytes);
            System.out.printf("Tamaño en kilobytes : %.2f\n",sizeKB);
            System.out.printf("Tamaño en megabytes : %.2f\n",sizeMB);
        }
    }
}
