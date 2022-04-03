package com.programacionOO.tema10.Practica11.Controlador;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;
import com.programacionOO.tema10.Practica11.Actores.*;
import com.programacionOO.tema10.Practica11.Configuracion.Config;
import com.programacionOO.tema10.anexoIterator.MyRandom;

import java.util.ArrayList;
import java.util.Locale;


public class Centro {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Profesor> profesores;
    private ArrayList<Grupo> grupos;
    private ArrayList<Aula> aulas;

    public Centro(){
        this(10);
    }

    public Centro(int inititalCapacity) {
        alumnos = new ArrayList<>(inititalCapacity);
        asignaturas = new ArrayList<>(inititalCapacity);
        profesores = new ArrayList<>(inititalCapacity);
        grupos = new ArrayList<>(inititalCapacity);
        aulas = new ArrayList<>(inititalCapacity);

        if (Config.DEBUG){
            generarDatosCentro(inititalCapacity);
        }
    }
    public boolean nuevoAlumno(){
        String nombre = Util.askStringRestricted("Introduzca el nombre del alumno", Config.MIN_NAME,Config.MAX_NAME);
//      todo : registrar nuevo alumno
//        alumnos.add();
        return true;
    }
    public boolean mostrarAlumnosPorGrupo(){
        String nombreGrupo = Util.askStringRestricted("Introduce el nombre del grupo", Config.MIN_NAME, Config.MAX_NAME);
        return true;
    }
    /***** GENERAR DATOS DE PRUEBAS ****/
    private boolean generarDatosCentro(int init) {
        generarProfesores(init);
        generarAsignaturas();//se adapta al ArrayList de profesores
        generarAulas();
        generarGrupos();////se adapta al ArrayList de aulas
        generarAlumnos();
//        System.out.println(toString());
        return true;
    }
    private boolean generarProfesores(int intitalCapacity) {
        Faker faker = new Faker(new Locale("ES"));
        String dni;
        String nombre;
        float sueldo;
        Profesor profesor ;
        MyRandom pull = new MyRandom(intitalCapacity,Config.MAX_DNI,Config.MIN_DNI);
        for (int i = 0; i < intitalCapacity; i++) {
            dni = pull.next() + "Z";
            nombre = faker.name().fullName();
            sueldo = Util.randomFloat(Config.MIN_SUELDO,Config.MAX_SUELDO);
            profesor = new Profesor(dni,nombre,sueldo);
            profesores.add(profesor);
        }
        return true;
    }
    private boolean generarAsignaturas() {
        Faker faker = new Faker(new Locale("ES"));
        String nombre;
        Asignatura asignatura;
        for (Profesor profesor: profesores) {
            nombre = faker.book().title();
            asignatura = new Asignatura(nombre,profesor);
            asignaturas.add(asignatura);
        }
        return true;
    }
    private boolean generarAulas() {
        float m2;
        Aula aula;
        for (int i = 0; i < Config.NUM_AULAS; i++) {
            m2 = Util.randomFloat(100,300);
            aula = new Aula(m2);
            aulas.add(aula);
        }

        return true;
    }
    private boolean generarGrupos() {
        Faker faker = new Faker(new Locale("ES"));
        String nombre;
        Grupo grupo;
        for (Aula aula: aulas) {
            nombre = faker.name().bloodGroup();
            grupo = new Grupo(nombre,aula);
            grupos.add(grupo);
        }
        return true;
    }
    private boolean generarAlumnos() {
        Faker faker = new Faker(new Locale("ES"));
        String nombre;
        Alumno alumno;

        //solo podra haber un alumno por grupo en pruebas
        for (Grupo grupo: grupos){
            nombre = faker.name().fullName();
            ArrayList<Asignatura> asigAlumno = new ArrayList<>();

            for (int i = 0; i < Config.NUM_ASIGNATURA; i++) {
                int randomIndex = Util.random(0,asignaturas.size() - 1);
                asigAlumno.add(asignaturas.get(randomIndex));
            }
            alumno = new Alumno(nombre,grupo,asigAlumno);
            alumnos.add(alumno);
        }

        return true;
    }

    public String mostrarAlumnos() {
        return alumnos.toString();
    }
    public String mostrarProfesores() {
        return profesores.toString();
    }

    @Override
    public String toString() {
        return "Centro{" +
                "\n alumnos=" + alumnos +
                ",\n asignaturas=" + asignaturas +
                ",\n profesores=" + profesores +
                ",\n grupos=" + grupos +
                ",\n aulas=" + aulas +
                '}';
    }
}

