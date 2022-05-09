package com.programacionOO.tema11.practica06.MultimediaItems;

import com.programacionOO.tema11.practica06.Formato;
import com.programacionOO.tema11.practica06.Multimedia;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Videojuego extends Multimedia {

    private ArrayList<String> plataformas;

    public Videojuego(String titulo, String autor, Formato formato, GregorianCalendar fecha, ArrayList<String> plataformas) {
        super(titulo, autor, formato, fecha);
        this.plataformas = plataformas;
    }

    @Override
    public String toString() {
        return "Videojuego{" + super.toString() +
                "plataformas soportadas=" + plataformas +
                '}';
    }

}
