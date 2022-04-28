package com.programacionOO.tema11.Practica06;

import com.programacionOO.tema11.Practica06.MultimediaItems.Pelicula;
import com.programacionOO.tema11.Practica06.MultimediaItems.Videojuego;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alquiler {
    private static final int DISCOUNT_YEAR_MOVIE = 2012;
    private static final int DISCOUNT_YEAR_GAME = 2010;
    private static int cont_id = 0;

    private double precio;
    private GregorianCalendar fechaAlquiler;
    private GregorianCalendar fechaDevolucion;
    private ArrayList<Multimedia> productosAlquilados;

    public Alquiler(GregorianCalendar fechaAlquiler, GregorianCalendar fechaDevolucion, ArrayList<Multimedia> productosAlquilados) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.productosAlquilados = productosAlquilados;
        precio = 4 * contarMultimedia();
        rebajarAlquiler();
    }
    private int contarMultimedia(){
        int cont = 0;
        for (Multimedia m: productosAlquilados) {
            if (m != null) cont++;
        }
        return cont;
    }
    private void rebajarAlquiler(){
        GregorianCalendar i ;
        for (Multimedia m: productosAlquilados){
            i = m.getFecha();
            if (m instanceof Videojuego) {
                comprobarFechaJuego(i);
            }
            else if (m instanceof Pelicula) {
                comprobarFechaPeli(i);
            }
        }
    }

    private boolean comprobarFechaPeli(GregorianCalendar fechaPeli){
        int year = fechaPeli.get(Calendar.YEAR);
        if (year < DISCOUNT_YEAR_MOVIE){
            precio--;
            return true;
        }
        return false;
    }
    private boolean comprobarFechaJuego(GregorianCalendar fechaJuego){
        int year = fechaJuego.get(Calendar.YEAR);
        if (year < DISCOUNT_YEAR_GAME){
            precio--;
            return true;
        }
        return false;
    }
}
