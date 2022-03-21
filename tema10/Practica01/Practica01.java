package com.programacionOO.tema10.Practica01;

import java.util.ArrayList;

public class Practica01<T> {
    ArrayList<Integer> list;
    /**
     * This method ordenates on a list ordered by even - odd
     * @param numbers
     * @return
     */
    public ArrayList<T> evenOddList(int[] numbers) {
//        ArrayList<Integer> list = new ArrayList<>(numbers.length);
        list = new ArrayList<>();//
        int index ;
        //Even
        for (index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) list.add(numbers[index]);
        }
        //Odd
        for (index = 0; index < numbers.length; index++) {
            if (!(numbers[index] % 2 == 0)) list.add(numbers[index]);
        }
        return (ArrayList<T>) list;
    }

    @Override
    public String toString() {
        return "" + list;

    }
}
