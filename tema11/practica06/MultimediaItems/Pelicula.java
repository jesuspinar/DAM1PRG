package com.programacionOO.tema11.practica06.MultimediaItems;

import com.programacionOO.tema11.practica06.Formato;
import com.programacionOO.tema11.practica06.Multimedia;

import java.util.GregorianCalendar;

public class Pelicula extends Multimedia {

    private int duracionMinutos;
    private String actor;
    private String actriz;


    public Pelicula(String titulo, String autor, Formato formato, GregorianCalendar fecha, int duracionMinutos, String actor, String actriz) {
        super(titulo, autor, formato, fecha);
        this.duracionMinutos = duracionMinutos;
        this.actor = actor;
        this.actriz = actriz;

    }

    @Override
    public String toString() {
        return "Pelicula{" + super.toString() +
                "duracionMinutos=" + duracionMinutos +
                ", actor principal='" + actor + '\'' +
                ", actriz principal='" + actriz + '\'' +
                '}';
    }
}
