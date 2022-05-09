package com.programacionOO.tema11.practica07.Practica07a;

import java.util.Arrays;

/**
 * Clase que representa una Fila de una Zona
 */
public class Fila {
    /** Atributos */
    private final int numero;
    private final Asiento[] asientos;

    /**
     * Crea un Fila con el número indicado.
     * Inicializa todos los Asientos de la Fila
     * @param numero Número de la Fila
     */
    public Fila(int numero) {
        this.numero = numero;
        this.asientos = new Asiento[Estadio.ASIENTOS_POR_FILA];
        for(int i = 1; i <= Estadio.ASIENTOS_POR_FILA; i++) {
            this.asientos[i - 1] = new Asiento(i);
        }
    }

    public int getNumero() {
        return numero;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Fila{" +
                "numero=" + numero +
                ", asientos=" + Arrays.toString(asientos) +
                '}';
    }

    /**
     * Genera un String que representa el estado (en color) de los Asientos de la Zona indicada
     * @param zona Zona a mostrar
     * @return String con el estado de los Asientos
     */
    public String toColorString(Zona zona) {
        StringBuilder builder = new StringBuilder();
        int zeroPadding = String.valueOf(zona.getFilas().length).length();
        int offset = Zona.TITULO_FILA.length() + zeroPadding;

        for(Fila fila: zona.getFilas()) {
            builder.append(Zona.TITULO_FILA).append(String.format("%0" + zeroPadding + "d", fila.getNumero()));
            for(Asiento asiento: fila.getAsientos()) {
                builder.append(String.format("%"+Zona.ANCHO_COLUMNA+"s",asiento.isOcupado() ? 'S': 'F'));
            }
        }
        return builder.toString();
    }
}
