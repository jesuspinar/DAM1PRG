package com.programacionOO.tema10.practica01;

import java.util.ArrayList;

public class Practica01 {
    /**
     * This method ordinates Integer array on a list ordered by even - odd
     * @param numbers
     * @return
     */
    public static ArrayList<Integer> evenOddList(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();//Change initial capaciti makes unrezized list, default 10
        int index ;
        //Even
        for (index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) list.add(numbers[index]);
        }
        //Odd
        for (index = 0; index < numbers.length; index++) {
            if (!(numbers[index] % 2 == 0)) list.add(numbers[index]);
        }
        return list;
    }



}
