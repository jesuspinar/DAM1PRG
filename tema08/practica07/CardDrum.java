package com.programacionOO.tema08.practica07;

import java.util.Random;

public class CardDrum {

    private int[] array;
    private int validated;
    private Random random;

    public CardDrum(int quantity, int startingValue) {
        random = new Random();
        array = new int[quantity];
        for(int i = 0; i < array.length; i++) {
            array[i] = startingValue;
            startingValue++;
        }
        validated = quantity - 1;
    }

    public int extractNum() {
        if(validated >= 0) {
            int index = random.nextInt(validated + 1);
            int num = array[index];
            array[index] = array[validated];
            array[validated] = num;
            validated--;
            return num;
        }
        return Integer.MIN_VALUE;
    }

    public void reset() {
            validated = array.length - 1;
        }

}
