package com.programacionOO.tema10.Practica10;

import com.programacionOO.tema10.Practica05.Estadisticas;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Empleado {
    private static int cont = 0;
    private int id;
    private String nif;
    private String nombre;
    private String apellidos;
    private float sueldo;
    private GregorianCalendar fechaNac;
    private int edad;
    private ArrayList<Hijo> hijos;


    public Empleado(String nif,String nombre,String apellidos,GregorianCalendar fecha, float sueldo) {
        this.id = ++cont;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        fechaNac = fecha;
        this.sueldo = sueldo;
        edad = Estadisticas.calcularEdad(fechaNac);
        hijos = new ArrayList<>();
    }


    public String getApellidos() {
        return apellidos;
    }

    public boolean addHijo(String nombre,String apellido,GregorianCalendar fechaNac){
        Hijo hijo  = new Hijo(nombre,apellido,fechaNac);
        hijos.add(hijo);
        return true;
    }
    public boolean removeHijo(int idHijo){
        hijos.remove(hijos.get(idHijo));
        return true;
    }

    public boolean containHijo(int idHijo) {
        if (hijos.get(idHijo) != null)return true;
        return false;
    }

    public boolean modifySueldo(float sueldo){
        this.sueldo = sueldo;
        return true;
    }

    public String mostrarHijos() {
        return "Hijos : " + hijos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                ", hijos=" + hijos +
                '}';
    }
}
