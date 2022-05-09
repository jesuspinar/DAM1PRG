package com.programacionOO.tema11.practica04;

public class Television extends Electrodomestico{
    //CONSTANTES
    private static final int PULGADAS_DEFECTO = 5;
    private static final boolean SMART_DEFECTO = false;
    //ATRIBUTOS
    private int resolucion;
    private boolean smartTV;

    public Television() {
        super();
        resolucion = PULGADAS_DEFECTO;
        smartTV = SMART_DEFECTO;
    }

    public Television(double precioNuevo, float pesoNuevo) {
        super(precioNuevo, pesoNuevo);
        resolucion = PULGADAS_DEFECTO;
        smartTV = SMART_DEFECTO;
    }

    public Television(int resolucion, boolean smartTV) {
        super();
        this.resolucion = resolucion;
        this.smartTV = smartTV;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    // TODO:  hacer precio base private e implementar metodo

    @Override
    public double precioFinal() {
        if (resolucion > 40) return (super.precioFinal() + (this.precioBase * 1.3));
        if (smartTV) return (super.precioFinal() + this.precioBase + 50);
        return -1;
    }
}
