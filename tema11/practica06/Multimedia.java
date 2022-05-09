package com.programacionOO.tema11.practica06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private GregorianCalendar fecha;

    //todo : crear constructor de copia
    public Multimedia(String titulo, String autor, Formato formato, GregorianCalendar fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "Mutlimedia{" +
                "titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", formato = " + formato +
                ", fecha = " + sdf.format(fecha.getTime()) +
                '}';
    }
    //COMPARA SI DOS OBJETOS SON IGUALES
    @Override
    public boolean equals(Object multimedia) {
        if (this == multimedia) return true;
        if (multimedia == null || this.getClass() != multimedia.getClass()) return false;
        Multimedia multimedia1 =(Multimedia) multimedia;
        return this.titulo.equalsIgnoreCase(multimedia1.titulo);
    }

}
