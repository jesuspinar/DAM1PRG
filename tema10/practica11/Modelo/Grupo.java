package com.programacionOO.tema10.practica11.Modelo;

import com.programacionOO.tema10.practica11.Configuracion.Config;

public class Grupo {
    private static int cont = Config.STARTER_ID_GRUPO;
    private int id ;
    private String nombre;
    private Aula aula;

    public Grupo(String nombre,Aula aula) {
        id = ++cont;
        this.nombre = nombre;
        this.aula = aula;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Aula getAula() {
        return aula;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", nombre = " + nombre +
                ", " + aula + "\n" ;
    }
}
