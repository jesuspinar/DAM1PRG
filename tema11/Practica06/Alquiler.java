package com.programacionOO.tema11.Practica06;

import com.programacionOO.tema11.Practica06.MultimediaItems.Pelicula;
import com.programacionOO.tema11.Practica06.MultimediaItems.Videojuego;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alquiler {
    private static final int DISCOUNT_YEAR_MOVIE = 2012;
    private static final int DISCOUNT_YEAR_GAME = 2010;
    private static final long DAY = 86400000;//1dia en milis
    private static final long MAX_DAYS = DAY*3;//3dias
    private static int cont_id = 0;

    private int id;
    private double precio;
    private GregorianCalendar fechaAlquiler;
    private GregorianCalendar fechaDevolucion;//metodo para calcular la fecha limite y no una variable
    private ArrayList<Multimedia> productosAlquilados;

    public Alquiler(Socio socio,GregorianCalendar fechaAlquiler, GregorianCalendar fechaDevolucion,
                    ArrayList<Multimedia> productosAlquilados) throws RecargosPendientesException {
        if (tieneRecargo(socio)){throw new RecargosPendientesException("Socio con recargos, no es posible alquilar");}
        else {
            id = ++cont_id;
            this.fechaAlquiler = fechaAlquiler;
            this.fechaDevolucion = fechaDevolucion;
            this.productosAlquilados = productosAlquilados;
            precio = 4 * contarMultimedia();
            rebajarAlquiler();
        }
    }

    /**
     * Comprueba los dias que pasaron en funcion al retraso
     * @return
     */
    public int comprobarRetrasoPlazo(){
        long diferecia = fechaDevolucion.getTimeInMillis() - fechaAlquiler.getTimeInMillis();
        int numDias = 0;
        if (diferecia > MAX_DAYS){
            long resto = diferecia - MAX_DAYS;
            do{
                resto -= DAY;
                numDias++;
            }
            while(resto > DAY);
            return numDias;
        }
        return 0;
    }

    public boolean tieneRecargo(Socio socio){
        if (socio.getRecargo() != 0){
            return true;
        }
        return false;
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
