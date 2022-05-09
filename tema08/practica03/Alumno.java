package com.programacionOO.tema08.practica03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Alumno {

    private final long nia;
    private final String nombre;
    private final String apellidos;
    private final GregorianCalendar fechaNacimiento;
    private final String grupo;
    private final long telefono;

    //contructor por defecto
    public Alumno(long nia, String nombre, String apellidos, GregorianCalendar fechaNacimiento, String grupo, long telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;

    }



    public long getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGrupo() {
        return grupo;
    }

    public long getTelefono() {
        return telefono;
    }

    public int getEdad(){
        int anyoNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaNacimiento.get(Calendar.MONTH) + 1;
        int diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        GregorianCalendar fecha = new GregorianCalendar();
        int anyoActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH) + 1;
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);

        int edad = anyoActual - anyoNacimiento;
        if (mesActual < mesNacimiento){
            edad--;

        } else if(mesActual == mesNacimiento){
            if (diaActual < diaNacimiento){
                edad--;
            }
        }
        return edad;
    }
    public int getEdad2(){
        LocalDate fechaActual= LocalDate.now();
        int anyoNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaNacimiento.get(Calendar.YEAR) + 1;
        int diaNacimiento = fechaNacimiento.get(Calendar.YEAR);
        LocalDate fechaNacimiento = LocalDate.of(diaNacimiento,mesNacimiento, anyoNacimiento);
        Period periodo = Period.between(fechaActual, fechaNacimiento);
        return periodo.getYears();

    }

}
