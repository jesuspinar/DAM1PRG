package com.programacionOO.tema11.practica04;

public class Lavadora extends Electrodomestico{
    //CONSTANTES
    private static final float CAPACIDAD_DEFECTO = 5;
    //ATRIBUTOS
    private float carga;
    //CONSTRUCTORES
    //INVOCA AL CONSTRUCTOR PADRE INTERNAMENTE POR HERENCIA POR DEFECTO
    public Lavadora() {
        super();
        this.carga = CAPACIDAD_DEFECTO;
    }
    public Lavadora(double precioNuevo, float pesoNuevo) {
        super(precioNuevo, pesoNuevo);
        this.carga = CAPACIDAD_DEFECTO;
    }
    public Lavadora(float carga,double precioBase, Color color, char consumo, float peso) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }
    @Override
    public double precioFinal() {
        if (carga >= 30 ){
            return super.precioFinal() + 50;
        }
        return super.precioFinal();
    }

}
