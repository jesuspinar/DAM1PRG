package com.programacionOO.tema11.Practica07.Ejercicio07a;

import java.util.Calendar;

/**
 * Clase que representa una Entrada y sirve base para representar el resto de Entradas
 */
public abstract class Entrada {
    /** Para generar el id autonumérico */
    private static int N_ENTRADAS = 0;
    /** Atributos */
    protected final int id;
    protected final Partido partido;
    protected final Zona zona;
    protected final Fila fila;
    protected final Asiento asiento;
    protected final double importe;

    /**
     * Crea una entrada para el Partido, Zona, Fila y Asiento indicados.
     * @param partido
     * @param zona
     * @param fila
     * @param asiento
     * @throws IllegalArgumentException En caso de que el asiento esté ocupado
     */
    public Entrada(Partido partido, Zona zona, Fila fila, Asiento asiento) throws IllegalArgumentException {
        this.id = ++N_ENTRADAS;
        this.partido = partido;
        this.zona = zona;
        this.fila = fila;
        this.asiento = asiento;
        if(!this.asiento.vender()) {
            throw new IllegalArgumentException("El asiento " + asiento.toString() + " ya está vendido");
        }
        this.importe = calcularImporte(partido, zona);
    }

    /**
     * Calcula el importe de una Entrada dependiendo del Partido, el TipoPartido y la Zona
     * @param partido Partido correspondiente a la Entrada
     * @param zona Zona donde se encuentra el Asiento de la Entrada
     * @return Importe de la entrada
     */
    private double calcularImporte(Partido partido, Zona zona) {
        double factorCorreccion = 1;
        switch (partido.getTipoPartido()) {
            case BAJA_AFLUENCIA:
                factorCorreccion = 0.75;
                break;
            case MEDIA_AFLUENCIA:
                factorCorreccion = 1;
                break;
            case ALTA_AFLUENCIA:
                factorCorreccion = 1.3;
                break;
        }
        return zona.getPrecioBase() * factorCorreccion;
    }

    public int getId() {
        return id;
    }

    public Partido getPartido() {
        return partido;
    }

    public Zona getZona() {
        return zona;
    }

    public Fila getFila() {
        return fila;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public double getImporte() {
        return importe;
    }

    /**
     * Devuelve una entrada
     * Solo se pueden devolver entradas de partidos pendientes de jugar
     * @return True si se ha podido devolver, False en caso contrario
     */
    public boolean devolver() {
        if(partido.getFecha().compareTo(Calendar.getInstance()) > 0) {
            return getAsiento().devolver();
        }
        //No se pueden devolver entradas de partidos ya jugados
        return false;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", partido=" + partido.getLocal() + " VS " + partido.getVisitante() +
                ", zona=" + zona.getId() +
                ", fila=" + fila.getNumero() +
                ", asiento=" + asiento.getNumero() +
                ", precio=" + zona.getPrecioBase() +
                '}';
    }
}
