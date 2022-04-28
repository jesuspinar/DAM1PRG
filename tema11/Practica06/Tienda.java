package com.programacionOO.tema11.Practica06;

import java.util.ArrayList;

public class Tienda {
    public static final int PLAZO_DEVOLUCION = 3;

    private ArrayList<Multimedia> multimediaItems;
    private ArrayList<Socio> socios;

    //todo: El alquiler se ve rebajado 1 €
    // si la pelicula es anterior al año 2012 o
    // si el videojuego es anterior al año 2010.
    public boolean rebajarAlquiler(){
        return true;
    }
    //todo: Cuando el socio devuelve el objeto multimedia se debe comprobar que está
    // dentro del plazo de alquiler de 3 días. Por cada día que pase del mencionado
    // periodo, el socio deberá pagar un recargo de 2 €.
    public boolean comprobarPlazoDevolucion(){
        return true;
    }
    //todo : comprobar socio no recargos hantes de alquilar
    public boolean comprobarEstadoSocio(){
        return true;
    }

    //todo: metodo generar datos de prueva
}
