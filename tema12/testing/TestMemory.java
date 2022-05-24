package com.programacionOO.tema12.testing;

public class TestMemory {
    long NANOSEC = 1000000000;

    public TestMemory() {
        long initTime = System.nanoTime();
        method1();
        long endTime = System.nanoTime();
        System.out.printf("Time method : %.2f", (endTime - initTime)/NANOSEC);
    }
    private static void method1(){

    }
}
