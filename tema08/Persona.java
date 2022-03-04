package com.programacionOO.tema08;

public class Persona {
    public static final int MAX_VIDA = 100;
    public static final int MAX_RESISTENCIA = 100;
    public static final int MAX_FUERZA = 100;
    public static final int MAX_IQ = 220;
    public static final int MAX_EDAD = 82;
    //ATRIBUTOS
    String dni;
    String nombre;
    Genero genero;
    int resistencia;
    int fuerza;
    int iQ;
    int vida;
    int edad;
    //this hace referencia a los atrubutos de arriba
    //INICIALIZAR constructor
    //un cosntructor sin datos no puede ser llamado en otra clase
    public Persona(String nombre,int resistencia, int fuerza, int iQ, int vida, int edad){
        String dni = "893283292G";
        this.nombre = "Arturo";
        this.resistencia = 50;
        this.fuerza = 100;
        this.iQ = 114;
        this.vida = 10;
        this.edad = 30;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona:" +
                "fuerza=" + fuerza +
                ", iQ=" + iQ +
                ", vida=" + vida +
                '\n';
    }

    public void regenerarVida(int vida){
        Persona.this.vida = MAX_VIDA;
    }
    public void ganarIQ(int iQ){
        Persona.this.iQ =+20;
    }


}
