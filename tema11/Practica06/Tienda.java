package com.programacionOO.tema11.Practica06;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;
import com.programacionOO.tema11.Practica06.MultimediaItems.Pelicula;
import com.programacionOO.tema11.Practica06.MultimediaItems.Videojuego;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;

public class Tienda {


    private ArrayList<Multimedia> multimediaItems;
    private ArrayList<Socio> socios;
    private HashMap<Socio,Alquiler> movimientos;

    public Tienda(int init) {
        multimediaItems = new ArrayList<>(init);
        socios = new ArrayList<>(init);
        movimientos = new HashMap<>(init);
        generarDatos(init);
    }
    //todo: altas
    //todo: listados

    //todo: metodo generar datos de prueba
    private void generarDatos(int init){
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
        int edad;
        /*---- alquiler ----*/
        GregorianCalendar fechaAlquiler;
        GregorianCalendar fechaDevolucion;
        ArrayList<Multimedia> productosAlquilados;

        /*---- pelis ----*/
        for (int i = 0; i < cantPelis; i++) {
            titulo = faker.beer().name();
            autor = faker.name().firstName();
            formato = Formato.BLURAY;
            fechaPubli = Util.generarFechas(1990);
            duracionMinutos = Util.random(70,150);
            actor = faker.funnyName().name();
            actriz = faker.funnyName().name();
            Pelicula p1 = new Pelicula(titulo,autor,formato,fechaPubli,duracionMinutos,actor,actriz);
            multimediaItems.add(p1);
        }
        /*---- videojuegos ----*/
        for (int i = 0; i < cantJuegos; i++) {
            titulo = faker.beer().name();
            autor = faker.name().firstName();
            formato = Formato.CD;
            fechaPubli = Util.generarFechas(1990);
            plataformas = new ArrayList<>();
            plataformas.add("PC");
            plataformas.add("PS5");
            plataformas.add("Android");
            plataformas.add("iOS");
            Videojuego v1 = new Videojuego(titulo,autor,formato,fechaPubli,plataformas);
            multimediaItems.add(v1);
        }
        /*---- socios ----*/
        for (int i = 0; i < init; i++) {
            nif = Util.randomDNI();
            nombre = faker.name().firstName();
            fechaNac = Util.generarFechas(2000);
            poblacion = faker.address().city();
            edad = Util.calcularEdad(fechaNac);
        }

    }
}












