package com.programacionOO.tema11.practica05.Materiales;

public abstract class Material {
    private final int RESISTENCIA_DEFAULT = 10;
//    private final Stack CAPACIDAD_MAX = Stack.FULL;

//    private Stack capacidad;

    private int resistencia;
    private String nombre;
    private int cantidad;

    public Material(String nombre){
//        capacidad = ;
        resistencia = RESISTENCIA_DEFAULT;
        cantidad = 0;
        this.nombre = nombre;
    }

    public Material(int resistencia, String nombre) {
//        capacidad = CAPACIDAD_MAX;
        this.resistencia = resistencia;
        this.nombre = nombre;
    }

    /**
     * Actua como setter modificando la cantidad
     * @param cantidad
     * @return
     */
    public boolean modificarCantidad(int cantidad) {
        if (cantidad > 64 || cantidad < 1){
            return false;
        }
        this.cantidad = cantidad;
        return true;
    }

    public int getResistencia() {
        return resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "\nnombre = " + nombre +
                ", resistencia = " + resistencia +
                ", cantidad (" + cantidad + ')';
    }
}
