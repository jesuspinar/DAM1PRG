package com.programacionOO.tema11.practica06;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;
import com.programacionOO.tema11.practica06.MultimediaItems.Pelicula;
import com.programacionOO.tema11.practica06.MultimediaItems.Videojuego;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;

public class Tienda {


    private ArrayList<Multimedia> multimediaItems;
    private ArrayList<Socio> socios;
    private HashMap<Alquiler,Socio> movimientos;

    public Tienda(int init) throws RecargosPendientesException {
        multimediaItems = new ArrayList<>(init);
        socios = new ArrayList<>(init);
        movimientos = new HashMap<Alquiler,Socio>(init);
        generarDatos(init);
        System.out.println(toString());
    }
    //todo: altas
    public boolean altaPelicula(String titulo,String autor,Formato formato,GregorianCalendar fechaPubli,
                                int duracionMinutos,String actor,String actriz){
        Pelicula p1 = new Pelicula(titulo,autor,formato,fechaPubli,duracionMinutos,actor,actriz);
        multimediaItems.add(p1);
        return true;
    }
    public boolean altaVideojuego(String titulo,String autor,Formato formato,GregorianCalendar fechaPubli,
                                  ArrayList<String> plataformas){
        Videojuego v1 = new Videojuego(titulo,autor,formato,fechaPubli,plataformas);
        multimediaItems.add(v1);
        return true;
    }
    public boolean altaSocio(String nif,String nombre,GregorianCalendar fechaNac,String poblacion){
        Socio s1 = new Socio(nif,nombre,fechaNac,poblacion);
        socios.add(s1);
        return true;
    }
    //todo : alquilar multimedia
    public boolean realizarAlquiler(ArrayList<Multimedia> items, Socio socio) throws RecargosPendientesException {
        Alquiler alquilerNuevo = new Alquiler(socio,new GregorianCalendar(),items);
        socio.agregarAlquiler(alquilerNuevo.getPrecio());
        return true;
    }

    //todo : devolver alquiler
    public boolean devolverAlquiler(Alquiler alquiler, double dinero){
        int retraso = alquiler.comprobarRetrasoPlazo();
        double precioAlquiler = alquiler.getPrecio();

        if (retraso > 0){

        }

        if ( precioAlquiler > dinero) return false; //cantidad incorrecta de dinero
        else if (retraso != 0 && dinero >= precioAlquiler){
        }
        return true;
    }

    //todo: listados

    /**
     * Generates a random data for testing
     * #ONLY FOR DEVELOPMENT
     */
    private void generarDatos(int init) throws RecargosPendientesException {
        Faker faker = new Faker(new Locale("es"));
        int cantPelis = init % 2;
        int cantJuegos = init - cantPelis;
        /*---- multimedia ----*/
        String titulo;
        String autor;
        Formato formato;
        GregorianCalendar fechaPubli;
        /*---- peli ----*/
        int duracionMinutos;
        String actor;
        String actriz;
        /*---- juego ----*/
        ArrayList<String> plataformas;
        /*---- socio ----*/
        String nif;
        String nombre;
        GregorianCalendar fechaNac;
        String poblacion;
        /*---- alquiler ----*/
        GregorianCalendar fechaAlquiler;
        ArrayList<Multimedia> productosAlquilados;
        /*---- alquiler ----*/
        Alquiler alquiler1;

        /*---- pelis ----*/
        for (int i = 0; i < cantPelis; i++) {
            titulo = faker.beer().name();
            autor = faker.name().firstName();
            formato = Formato.BLURAY;
            fechaPubli = Util.generarMayorEdad(1990);
            duracionMinutos = Util.random(70,150);
            actor = faker.funnyName().name();
            actriz = faker.funnyName().name();
            Pelicula p1 = new Pelicula(titulo,autor,formato,fechaPubli,duracionMinutos,actor,actriz);
            multimediaItems.add(p1);
        }
        /*---- videojuegos ----*/
        plataformas = new ArrayList<>();
        plataformas.add("PC");
        plataformas.add("PS5");
        plataformas.add("Android");
        plataformas.add("iOS");
        for (int i = 0; i < cantJuegos; i++) {
            titulo = faker.beer().name();
            autor = faker.name().firstName();
            formato = Formato.CD;
            fechaPubli = Util.generarMayorEdad(1990);
            Videojuego v1 = new Videojuego(titulo,autor,formato,fechaPubli,plataformas);
            multimediaItems.add(v1);
        }
        /*---- socios ----*/
        for (int i = 0; i < init; i++) {
            nif = Util.randomDNI();
            nombre = faker.name().firstName();
            fechaNac = Util.generarMayorEdad(2000);
            poblacion = faker.address().city();
            Socio s1 = new Socio(nif,nombre,fechaNac,poblacion);
            socios.add(s1);
        }

        /*---- Alquileres + Movimientos ----*/
        for (int i = 0; i < cantPelis; i++) {
            fechaAlquiler = Util.generarFecha(2021);
            productosAlquilados = new ArrayList<>();
            productosAlquilados.add(multimediaItems.get(Util.random(0,multimediaItems.size()-1)));
            productosAlquilados.add(multimediaItems.get(Util.random(0,multimediaItems.size()-1)));
            Socio rs = socios.get(Util.random(0,socios.size()-1));
            alquiler1 = new Alquiler(rs, fechaAlquiler,productosAlquilados);
            movimientos.put(alquiler1,rs);
        }
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "multimediaItems=" + multimediaItems +
                "\nsocios=" + socios +
                "\nmovimientos=" + movimientos +
                '}';
    }
}












