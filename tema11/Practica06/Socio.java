package com.programacionOO.tema11.Practica06;

import com.programacionOO.libs.Util;
import java.util.GregorianCalendar;

public abstract class Socio {

    private static int cont_id = 0;

    private String nif;
    private String nombre;
    private GregorianCalendar fechaNac;
    private String poblacion;
    private int edad;

    public Socio(String nif, String nombre, GregorianCalendar fechaNac, String poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.poblacion = poblacion;
        edad = Util.calcularEdad(fechaNac);
    }
    public boolean actualizarEdad(){
        edad = Util.calcularEdad(fechaNac);
        return true;
    }
}
