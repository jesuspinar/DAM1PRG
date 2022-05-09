package com.programacionOO.tema10.practica11.Modelo;

import com.programacionOO.tema10.practica11.Configuracion.Config;

import java.util.ArrayList;

public class Alumno {
    private static int cont = Config.STARTER_ID_ALUMNO;
    private int id ;
    private String nombre;
    private Grupo grupo;
    private ArrayList<Asignatura> asignaturas;
    //todo crear clase matricula para tener difentes cursos

    public Alumno(String nombre, Grupo grupo, ArrayList<Asignatura> asignaturas) {
        this.id = ++cont;
        this.nombre = nombre;
        this.grupo = grupo;
        this.asignaturas = asignaturas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", nombre = " + nombre +
                ", grupo (" + grupo  +
                ", asignaturas  " + asignaturas +"\n";
    }
}
