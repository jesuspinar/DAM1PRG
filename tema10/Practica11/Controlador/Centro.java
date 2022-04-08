package com.programacionOO.tema10.Practica11.Controlador;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;
import com.programacionOO.tema10.Practica11.Modelo.*;
import com.programacionOO.tema10.Practica11.Configuracion.Config;
import com.programacionOO.tema10.anexoIterator.InvalidRangeException;
import com.programacionOO.tema10.anexoIterator.MyRandom;

import java.util.ArrayList;
import java.util.Locale;


public class Centro {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Profesor> profesores;
    private ArrayList<Grupo> grupos;
    private ArrayList<Aula> aulas;

    public Centro() throws InvalidRangeException {
        this(10);
    }

    public Centro(int inititalCapacity) throws InvalidRangeException {
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
//      todo : registrar nuevo alumno
        if(asignaturas.size() == 0 && grupos.size() == 0){
            System.out.println("Lo sentimos no hay asignaturas o grupos para cursar");
            return false;
        }else{
            String nombre = Util.askStringRestricted("Introduzca el nombre del alumno", Config.MIN_NAME,Config.MAX_NAME);
            System.out.println(mostrarGrupo());
            String nombreGrupo = Util.askStringRestricted("Elija el grupo ",3,15);
            Grupo grupo = null;
            /*BUSCA GRUPO*/
            for (Grupo value : grupos) {
                if (nombreGrupo.equalsIgnoreCase(value.getNombre())) {
                    grupo = value;
                } else {
                    System.out.println("Grupo no encontrado intentelo de nuevo");
                    return false;
                }
            }


            System.out.println(mostrarAsignaturas());
            int num_asignaturas = Util.askInteger2("Cuantas quieres cursar?", 2,9);
            ArrayList<Asignatura> nuevasAsignaturas = new ArrayList<>(num_asignaturas);
            /*BUSCA ASIGNATURAS*/
            do {
                String nombreAsignatura = Util.askStringRestricted("Elije una asignatura",5,20);

                for (Asignatura asignatura : asignaturas) {
                    if (nombreAsignatura.equalsIgnoreCase(asignatura.getNombre())) {
                        num_asignaturas--;
                        nuevasAsignaturas.add(asignatura);
                    }

                }
            }while (num_asignaturas != 0);

            assert grupo != null;
            Alumno alumno = new Alumno(nombre,grupo,nuevasAsignaturas);
            alumnos.add(alumno);
            return true;
        }


    }

    private Asignatura buscarAsignatura(String nombreAsignatura) {
        for (Asignatura asignatura : asignaturas) {
            if (nombreAsignatura.equalsIgnoreCase(asignatura.getNombre())) {
                return asignatura;
            }
        }
        return null; // modificar para enviar excepcion
    }

    public boolean mostrarAlumnosPorGrupo(){
        String nombreGrupo = Util.askStringRestricted("Introduce el nombre del grupo", Config.MIN_NAME, Config.MAX_NAME);
        //todo : mostrar alumnos por grupo
        return true;
    }
    /***** GENERAR DATOS DE PRUEBAS ****/
    private boolean generarDatosCentro(int init) throws InvalidRangeException {
        generarProfesores(init);
        generarAsignaturas();//se adapta al ArrayList de profesores
        generarAulas();
        generarGrupos();////se adapta al ArrayList de aulas
        generarAlumnos();
//        System.out.println(toString());
        return true;
    }
    private boolean generarProfesores(int intitalCapacity) throws InvalidRangeException {
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
    public String mostrarAsignaturas() {
        return asignaturas.toString();
    }
    public String mostrarGrupo() {
        return grupos.toString();
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

