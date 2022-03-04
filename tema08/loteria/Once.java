package com.programacionOO.tema08.loteria;

import java.util.Random;

public class Once {

    private int[] num;
    private int remaining;
    private Random random;
    /*
    * max number of elements
    * min value start index
    * */
    public Once(int elements, int minValue) {
        num = new int[elements];
        for (int i = 0; i < num.length; i++) {
            num[i] = minValue;
            minValue++;
        }
        remaining = elements - 1;
    }
    public int randomBombo(){
        if (remaining >= 0) {
            int index = random.nextInt(remaining - 0 + 1);
            int nume = num[index];
            index = num[remaining];
            num[remaining] = nume;
            remaining--;
            return nume;
        }
        return Integer.MAX_VALUE;
    }
    public void reset(){
        remaining = num.length-1;
    }
}
