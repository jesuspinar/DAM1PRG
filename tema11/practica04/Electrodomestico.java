package com.programacionOO.tema11.practica04;

import java.util.HashMap;

public abstract class Electrodomestico {
    //CONSTANTES LOCALES
    private static final Color COLOR_DEFECTO = Color.BLANCO;
    private static final char CONSUMO_DEFECTO = 'f';
    private static final double PRECIO_DEFECTO = 100;
    private static final float PESO_DEFECTO = 5;
    //ATRIBUTOS LOCALES
    protected double precioBase;
    private final Color color;
    private final char consumo;
    private final float peso;
    private HashMap<Character, Double> consumoPrecio;

    //CONSTRUCTORES
    public Electrodomestico() {
        inicializarConsumoPrecio();
        color = COLOR_DEFECTO;
        consumo = CONSUMO_DEFECTO;
        precioBase = PRECIO_DEFECTO;
        peso = PESO_DEFECTO;
    }

    public Electrodomestico(double precioNuevo, float pesoNuevo) {
        inicializarConsumoPrecio();
        color = COLOR_DEFECTO;
        consumo = CONSUMO_DEFECTO;
        precioBase = precioNuevo;
        peso = pesoNuevo;
    }

    public Electrodomestico(double precioBase, Color color, char consumo, float peso) {
        inicializarConsumoPrecio();
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    //METODOS
    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public float getPeso() {
        return peso;
    }

    private void inicializarConsumoPrecio() {
        consumoPrecio = new HashMap<>();
        consumoPrecio.put('a', 100.00);
        consumoPrecio.put('b', 80.00);
        consumoPrecio.put('c', 60.00);
        consumoPrecio.put('d', 50.00);
        consumoPrecio.put('e', 30.00);
        consumoPrecio.put('f', 10.00);
    }

    /**
     * Este metodo comprueba si la letra pasada por parametro esta dentro del Consumo Energetico
     *
     * @param letra
     * @return
     */
    public boolean comprobarConsumoEnergetico(char letra) {
        if (letra != 0) {
            String letraLower = String.valueOf(letra);
            letraLower = letraLower.toLowerCase();
            letra = letraLower.charAt(0);
            String letrasDisponibles = "abcdef";
            for (int i = 0; i < letrasDisponibles.length(); i++) {
                if (letrasDisponibles.charAt(i) == letra) {
                    return true;
                }
            }
        }
        letra = CONSUMO_DEFECTO;
        return false;
    }

    /**
     * Comprueva si el color existe
     *
     * @param color
     * @return
     */
    public boolean comprobarColorCorrecto(String color) {
        Color[] array = Color.values();
        for (Color n : array) {
            if (String.valueOf(n).equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Actua como setter para ajustar el precio segun peso y consumo energetico
     *
     * @return false si alguno consumo o peso no validos
     */
    public double precioFinal() {
        Double value;
        if (consumoPrecio.containsKey(consumo)) {
            value = consumoPrecio.get(consumo);
        } else return -1;

        if (peso > 0 && peso <= 19) {
            return value + 10;
        } else if (peso > 19 && peso <= 49) {
            return value + 50;

        } else if (peso > 50 && peso <= 79) {
            return value + 80;
        } else if (peso > 80) {
            return value + 100;
        }
        return -1;
    }
}























