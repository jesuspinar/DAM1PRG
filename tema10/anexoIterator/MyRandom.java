package com.programacionOO.tema10.anexoIterator;

import java.util.Iterator;
import java.util.Random;

public class MyRandom implements Iterable<Integer>,Iterator<Integer>{
    private Random random;
    private int count;
    private int MAX_VALUE;
    private int MIN_VALUE;

    public MyRandom(int count, int max, int min) throws InvalidRangeException {
        random = new Random();
        this.count = count;
        if (min < 0 || max < 0 || max < min) {
            throw new InvalidRangeException("Max > Min and Min > 0 and Max > 0");
        }
        MAX_VALUE = max;
        MIN_VALUE = min;
    }
    public MyRandom(int count,long seed) {
        random = new Random(seed);
        this.count = count;

    }
//    private void init(int count, int max, int min){
//        this.count = count;
//        if (min < 0 || max < 0 || max < min) {
//            throw new InvalidRangeException("Max > Min and Min > 0 and Max > 0");
//        }
//    }

    @Override
    public Iterator<Integer> iterator() {
        return this;//llama a my random que es el Iterable, quien tiene el Iterator
                    //que es por tanto lo qu tiene que recorrer Iterator
    }

    @Override  //para indicar al compilador de que en tiempo de compilacion estoy sobres escribiendo el metodo correcto
    public boolean hasNext() {
        return count > 0; // bucle controlado al numero elementos
        //return true;//bucle ∞
    }

    @Override
    public Integer next() {
        count--;
        return random.nextInt( MAX_VALUE - MIN_VALUE + 1)+MIN_VALUE;
    }
    //hashNext(), next()

//    public int compareTo(Object o){
//        if (this.getEdad() > o.getEdad()) {return 1;}
//        else if (this.getEdad() < o.getEdad()) {return -1;}
//        else if (this.getEdad() == o.getEdad()) {return 0;}
//    }
}
