package com.programacionOO.tema10.practica11.Modelo;

import com.programacionOO.tema10.practica11.Configuracion.Config;

public class Asignatura {
    private static int cont = Config.STARTER_ID_ASIGNATURA;
    private int id ;
    private String nombre;
    private Profesor profesor;
    // todo : una asignaturas deberia poder ser impartida por mas de un profe

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
                ", profesores " + profesor;
    }
}
