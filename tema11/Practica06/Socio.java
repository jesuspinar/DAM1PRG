package com.programacionOO.tema11.Practica06;

import com.programacionOO.libs.Util;
import java.util.GregorianCalendar;

public abstract class Socio {

    private static int cont_id = 0;

    private final int id;
    private final String nif;
    private final String nombre;
    private final GregorianCalendar fechaNac;
    private final String poblacion;
    private int edad;

    public Socio(String nif, String nombre, GregorianCalendar fechaNac, String poblacion) {
        this.id = ++cont_id;
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
