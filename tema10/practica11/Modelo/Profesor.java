package com.programacionOO.tema10.practica11.Modelo;

public class Profesor {
    private String dni;
    private String nombre;
    private float sueldo;

    public Profesor(String dni, String nombre, float sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return  "dni = " + dni +
                ", nombre = " + nombre +
                ", sueldo = " + sueldo + "\n";
    }
}
