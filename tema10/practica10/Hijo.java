package com.programacionOO.tema10.practica10;

import com.programacionOO.tema10.practica05.Estadisticas;
import com.programacionOO.tema10.practica10.Config.Config;

import java.util.GregorianCalendar;

public class Hijo {
    private static int cont = Config.STARTER_ID;
    private int id ;
    private String nombre;
    private String apellidos;
    private GregorianCalendar fechaNac;
    private int edad;


    public Hijo(String nombre, String apellidos,GregorianCalendar fechaNac) {
        this.id = cont++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        edad = Estadisticas.calcularEdad(fechaNac);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "\nid =" + id +
                ", nombre = " + nombre +
                ", apellidos = " + apellidos +
                ", edad = " + edad;
    }
}

