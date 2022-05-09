package com.programacionOO.tema08.practica02;

public class Asignatura {
    private String nombre;
    private int codigo;
    private String curso;

    public Asignatura(String nombre, int codigo, String curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", curso='" + curso + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }
}
