package com.programacionOO.tema11.practica07.Practica07a;

import com.programacionOO.libs.Util;
import com.programacionOO.tema08.loteria.Bombo;

import java.util.Arrays;

/**
 * Clase que representa un Estadio
 */
public class Estadio {
    /** Constantes de configuración */
    public static final int N_ZONAS = 15;
    public static final int N_ZONAS_VIP = 2;
    public static final int FILAS_POR_ZONA = 15;
    public static final int ASIENTOS_POR_FILA = 20;
    public static final int MAX_VENTA_ENTRADAS_ALEATORIAS = Estadio.N_ZONAS *
            Estadio.FILAS_POR_ZONA * Estadio.ASIENTOS_POR_FILA;
    public static final int MIN_PRECIO_NORMAL = 10;
    public static final int MAX_PRECIO_NORMAL = 40;
    public static final int MIN_PRECIO_VIP = 50;
    public static final int MAX_PRECIO_VIP = 120;
    /** Atributos */
    private final Zona[] zonas;
    private final Bombo bombo;

    /**
     * Crea un Estadio con los valores definidos por defecto
     */
    public Estadio() {
        this(N_ZONAS, N_ZONAS_VIP);
    }

    /**
     * Crea un Estado con el número de zonas totales y VIP indicadas
     * @param nZonasTotales Número de zonas totales que tiene el Estadio
     * @param nZonasVIP Número de zonas VIP que tiene el Estadio
     */
    public Estadio(int nZonasTotales, int nZonasVIP) {
        this.zonas = new Zona[nZonasTotales];
        generarZonas(nZonasVIP);
        this.bombo = new Bombo(1,MAX_VENTA_ENTRADAS_ALEATORIAS);
    }

    /**
     * Genera nZonasVip Zonas aleatorias
     * @param nZonasVip Número de Zonas VIP a a generar
     */
    public void generarZonas(int nZonasVip) {
        for(int i = 1; i <= N_ZONAS; i++) {
            if(nZonasVip > 0) {
                this.zonas[i-1] = new Zona(i, TipoZona.VIP, Util.random(MIN_PRECIO_VIP, MAX_PRECIO_VIP));
                nZonasVip--;
            } else {
                this.zonas[i-1] = new Zona(i, TipoZona.NORMAL, Util.random(MIN_PRECIO_NORMAL, MAX_PRECIO_NORMAL));
            }
        }
    }

    public Zona[] getZonas() {
        return zonas;
    }

    /**
     * Obtiene un número aleatorio del Bombo
     * @return
     */
    public int getNumeroSorteo() {
        return bombo.getBola();
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "zonas=" + Arrays.toString(zonas) +
                ", bombo=" + bombo +
                '}';
    }
}
