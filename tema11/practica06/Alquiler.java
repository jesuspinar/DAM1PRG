package com.programacionOO.tema11.practica06;

import com.programacionOO.tema11.practica06.MultimediaItems.Pelicula;
import com.programacionOO.tema11.practica06.MultimediaItems.Videojuego;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Alquiler {
    private static final int DISCOUNT_YEAR_MOVIE = 2012;
    private static final int DISCOUNT_YEAR_GAME = 2010;
    private static final long DAY = 86400000;//1dia en milis
    private static final long MAX_DAYS = DAY*3;//3dias
    private static int cont_id = 0;

    private int id;
    private double precio;
    private GregorianCalendar fechaAlquiler;
    private ArrayList<Multimedia> productosAlquilados;

    public Alquiler(Socio socio,GregorianCalendar fechaAlquiler, ArrayList<Multimedia> productosAlquilados)
            throws RecargosPendientesException {
        if (tieneRecargo(socio)){throw new RecargosPendientesException("Socio con recargos, no es posible alquilar");}
        else {
            id = ++cont_id;
            this.fechaAlquiler = fechaAlquiler;
            this.productosAlquilados = productosAlquilados;
            precio = 4 * contarMultimedia();
            rebajarAlquiler();
        }
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * Comprueba los dias que pasaron en funcion al retraso
     * @return
     */
    public int comprobarRetrasoPlazo(){
        long diferecia = Calendar.getInstance().getTimeInMillis() - fechaAlquiler.getTimeInMillis();
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

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "\nAlquiler{" +
                "id=" + id +
                ", precio=" + precio +
                ", fechaAlquiler=" + sdf.format(fechaAlquiler.getTime()) +
                ", \n\tproductosAlquilados=" + productosAlquilados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alquiler alquiler = (Alquiler) o;
        return id == alquiler.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
