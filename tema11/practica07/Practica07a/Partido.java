package com.programacionOO.tema11.practica07.Practica07a;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Clase que representa un Partido
 */
public class Partido {
    /** Para generar el id de los Partidos */
    private static int N_PARTIDOS = 0;
    private final int id;
    private final GregorianCalendar fecha;
    private final String local;
    private final String visitante;
    private final TipoPartido tipoPartido;
    private final Estadio estadio;
    private final ArrayList<Entrada> entradas;

    /**
     * Crea un partido de tipo tipoPartido entre los equipos local y visitante en la fecha indicada
     * @param fecha
     * @param local
     * @param visitante
     * @param tipoPartido
     */
    public Partido(GregorianCalendar fecha, String local, String visitante, TipoPartido tipoPartido) {
        this.id = ++N_PARTIDOS;
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.tipoPartido = tipoPartido;
        this.estadio = new Estadio();
        this.entradas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    public TipoPartido getTipoPartido() {
        return tipoPartido;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    /**
     * Vende una Entrada en la Zona, Fila y Asiento indicados
     * @param zona
     * @param fila
     * @param asiento
     * @return La Entrada vendida o null en caso que no se haya podido vender
     */
    public Entrada venderEntrada(Zona zona, Fila  fila, Asiento asiento) {
        if(!asiento.isOcupado()) {
            if (zona.getTipoZona() == TipoZona.NORMAL) {
                try {
                    EntradaNormal entradaNormal = new EntradaNormal(this, zona, fila, asiento);
                    entradas.add(entradaNormal);
                } catch (IllegalArgumentException iae) {
                    return null;
                }
            } else {
                try {
                    EntradaVIP entradaVIP = new EntradaVIP(this, zona, fila, asiento);
                    entradas.add(entradaVIP);
                } catch (IllegalArgumentException iae) {
                    return null;
                }
            }
            return entradas.get(entradas.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Vende una Entrada en la Zona con id indexZona, la Fila con id indexFila y el Asiento indexAsiento indicados
     * @param indexZona
     * @param indexFila
     * @param indexAsiento
     * @return La Entrada vendida o null en caso que no se haya podido vender
     */
    public Entrada venderEntrada(int indexZona, int indexFila, int indexAsiento) {
        Zona zona = estadio.getZonas()[indexZona];
        Fila fila = zona.getFilas()[indexFila];
        Asiento asiento = fila.getAsientos()[indexAsiento];
        if(!asiento.isOcupado()) {
            if (zona.getTipoZona() == TipoZona.NORMAL) {
                try {
                    EntradaNormal entradaNormal = new EntradaNormal(this, zona, fila, asiento);
                    entradas.add(entradaNormal);
                } catch (IllegalArgumentException iae) {
                    return null;
                }
            } else {
                try {
                    EntradaVIP entradaVIP = new EntradaVIP(this, zona, fila, asiento);
                    entradas.add(entradaVIP);
                } catch (IllegalArgumentException iae) {
                    return null;
                }
            }
            return entradas.get(entradas.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Obtiene la recaudación del Partido
     * @return Recaudación total del Partido
     */
    public double getRecaudacion() {
        double recaudacion = 0;
        for(Entrada entrada: getEntradas()) {
            recaudacion += entrada.getImporte();
        }
        return recaudacion;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Partido{" +
                "id=" + id +
                ", fecha=" + sdf.format(fecha.getTime()) +
                ", tipoPartido=" + tipoPartido +
                ", local='" + local + '\'' +
                ", visitante='" + visitante + '\'' +
                '}';
    }
}
