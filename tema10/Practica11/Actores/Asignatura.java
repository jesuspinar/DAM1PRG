package com.programacionOO.tema10.Practica11.Actores;

import com.programacionOO.tema10.Practica11.Configuracion.Config;

public class Asignatura {
    private static int cont = Config.STARTER_ID_ASIGNATURA;
    private int id ;
    private String nombre;
    private Profesor profesor;

    public Asignatura(String nombre,Profesor profesor) {
        this.nombre = nombre;
        id = ++cont;
        this.profesor = profesor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", nombre = " + nombre +
                ", profesores " + profesor + "\n";
    }
}
