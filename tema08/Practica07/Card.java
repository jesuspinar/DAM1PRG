package com.programacionOO.tema08.Practica07;

public class Card {
    private int cardNum;

    public Card(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getCardNum() {
        return cardNum;
    }

    @Override
    public String toString() {
        return cardNum + " ";
    }
}
