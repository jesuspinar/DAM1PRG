package com.programacionOO.tema08.practica04;

public class Punto {
        private double x;
        private double y;

        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double calcularDistancia(Punto punto){
            return Math.sqrt((Math.pow((punto.getX() - x),2) + Math.pow((punto.getY() - y),2)));
        }

        public String visualizarPunto() {
            return "Punto{" + "x=" + x + ", y=" + y + '}';
        }

}
