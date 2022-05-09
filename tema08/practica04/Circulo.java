package com.programacionOO.tema08.practica04;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = new Punto(centro.getX(), centro.getY());
        this.radio = radio;
    }

    public Circulo(double puntoX, double puntoY,double radio) {
        this.centro = new Punto(puntoX,puntoY);
        this.radio = radio;
    }

    public double calcularDistancia(Punto centro){
        //x = 3 , y = 4 //centro
        //radio = 2.3
        double c1x = centro.getX();
//        double c1y = centro.getY();
        double c2x = this.centro.getX();
//        double c2y = this.centro.getY();

        return c1x - c2x;
    }

    public double calcularArea(){
        return Math.PI * (this.radio * 2);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }

    public String visualizarCirculo() {
        return "Circulo de radio " + this.radio +
                " cm esta situado en el punto ("+ this.centro.getX() +
                "," + this.centro.getY() + ")";
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
