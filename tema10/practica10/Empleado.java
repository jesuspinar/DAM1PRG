package com.programacionOO.tema10.practica10;

import com.programacionOO.tema10.practica05.Estadisticas;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Objects;

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


    public Empleado(String nif, String nombre, String apellidos, GregorianCalendar fecha, float sueldo) {
        this.id = cont++;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        fechaNac = fecha;
        this.sueldo = sueldo;
        edad = Estadisticas.calcularEdad(fechaNac);
        hijos = new ArrayList<>();
    }

    public String getNif() {
        return nif;
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

    public float getSueldo() {
        return sueldo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public boolean addHijo(String nombre, String apellido, GregorianCalendar fechaNac) {
        Hijo hijo = new Hijo(nombre, apellido, fechaNac);
        hijos.add(hijo);
        return true;
    }

    public boolean removeHijo(int idHijo) {
        hijos.remove(busquedaPosicion(idHijo));
        return true;
    }

    private int busquedaPosicion(int id) {
        for (Hijo i : hijos ) {
            if (id == i.getId()){
                return hijos.indexOf(i);
            }
        }
        return -1;
    }

    public boolean modifySueldo(float sueldo){
        this.sueldo = sueldo;
        return true;
    }

    public String mostrarHijos() {
        return "Hijos : " + hijos;
    }

    /**
     * Muestra los hijos menores de edad =)
     * @return
     */
    public boolean mostrarMenoresEdad(){
        for (Hijo hijo: hijos) {
            if (hijo.getEdad() < 18)
                System.out.println(hijo);
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//si tienen el mismo puntero a direccion de memoria
        if (o == null || this.getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return nif.equals(empleado.nif);
    }

    @Override
    public int hashCode() {///identificador unico
        return Objects.hash(nif);//utiliza como funcion hash el dni , no puntero a direccion de memoria
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                ", hijos=" + hijos ;
    }
}
