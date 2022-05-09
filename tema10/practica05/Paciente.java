package com.programacionOO.tema10.practica05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Paciente {
    private static int cont = 0;
    private int id;
    private char sexo;
    private float peso;
    private float altura;
    private String nombre;
    private GregorianCalendar fechaNac;
    private int edad;

    public Paciente(String nombre,GregorianCalendar fecha, char sexo, float peso,float altura) {
        this.id = ++cont;
        this.nombre = nombre;
        fechaNac = fecha;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        edad = Estadisticas.calcularEdad(fechaNac);
    }

    public int getId() {
        return id;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return  "id = " + id +
                ", sexo = " + sexo +
                ", peso = " + peso +
                ", altura = " + altura +
                ", fechaNac = " + String.format("%10s", sdf.format(fechaNac.getTime())) +
                ", nombre = '" + nombre + '\'' +
                ", edad = " + edad +
                "\n";
    }
}
