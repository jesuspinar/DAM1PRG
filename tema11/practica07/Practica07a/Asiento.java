package com.programacionOO.tema11.practica07.Practica07a;

/**
 * Clase que representa un Asiento del Estadio
 */
public class Asiento {
    /** Atributos */
    private final int numero;
    private boolean ocupado;

    /**
     * Crea un Asiento con el número y el estado ocupado (true/false) indicados
     * @param numero
     * @param ocupado
     */
    public Asiento(int numero, boolean ocupado) {
        this.numero = numero;
        this.ocupado = ocupado;
    }

    /**
     * Crea un Asiento libre con el número indicado
     * @param numero
     */
    public Asiento(int numero) {
        this(numero, false);
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Vende el Asiento.
     * @return True si se ha podido vender, False en caso contrario
     */
    public boolean vender() {
        if(!ocupado) {
            this.ocupado = true;
            return this.ocupado;
        }
        return false;
    }

    /**
     * Devuelve el Asiento
     * @return True si se ha podido devolver, False en caso contrario
     */
    public boolean devolver() {
        if(ocupado) {
            this.ocupado = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numero=" + numero +
                ", ocupado=" + ocupado +
                '}';
    }
}
