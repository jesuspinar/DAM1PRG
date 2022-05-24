package com.programacionOO.tema12.tresenralla.model;

public class Player {
    private static int contID = 0;
    private int id;
    private final String name;
    private boolean piece;

    public Player(String name, boolean ox) {
        this.name = name;
        piece = ox; // true = o
        id = contID++;
    }

    public boolean getPiece() {
        return piece;
    }
}
