package com.programacionOO.tema11.practica06;

import com.programacionOO.libs.Util;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Socio {

    private static int cont_id = 0;

    private final int id;
    private final String nif;
    private final String nombre;
    private final GregorianCalendar fechaNac;
    private final String poblacion;
    private int edad;

    private Recargo recargo; /**/

    public Socio(String nif, String nombre, GregorianCalendar fechaNac, String poblacion) {
        this.id = ++cont_id;
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.poblacion = poblacion;
        edad = Util.calcularEdad(fechaNac);
        // todo: recargo = 0;
    }
    public boolean actualizarEdad(){
        edad = Util.calcularEdad(fechaNac);
        return true;
    }

    /**
     * Acts like a bridge btw Recargo and Alquiler
     * @return
     */
    public double getRecargo() {
        return recargo.getRecargo();
    }
    public boolean agregarAlquiler(double precio){
        recargo.agregarAlquiler(precio);
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "\nSocio{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNac=" + sdf.format(fechaNac.getTime()) +
                ", poblacion='" + poblacion + '\'' +
                ", edad=" + edad +
                ", recargo=" + recargo +
                '}';
    }
}
