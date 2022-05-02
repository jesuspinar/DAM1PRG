package com.programacionOO.tema11.Practica06;

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

    private double recargo; /**/

    public Socio(String nif, String nombre, GregorianCalendar fechaNac, String poblacion) {
        this.id = ++cont_id;
        this.nif = nif;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.poblacion = poblacion;
        edad = Util.calcularEdad(fechaNac);
        recargo = 0;
    }
    public boolean actualizarEdad(){
        edad = Util.calcularEdad(fechaNac);
        return true;
    }
    public boolean agregarRecargo(int numDias){
        for (int i = 0; i < numDias; i++) {
            recargo += 2;
        }
        return true;
    }
    public boolean restarRecargo(double cant){
        if (cant <= recargo){
            recargo -= cant;
            return true;
        }
        return false;
    }

    public double getRecargo() {
        return recargo;
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
