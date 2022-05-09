package com.programacionOO.tema09.practica08;

import java.util.ArrayList;

public class Practica08 {
    public String personName;

    public Practica08() {
        a();
        b();
        c();
    }
    private void a(){
        try {
            int i = 3;
            i = i / 0;
        }catch (ArithmeticException ae){
            System.err.println("ArithmeticException caught!");
            ae.printStackTrace();
        }


    }
    private void b(){
        Practica08 personObj = null;
        try {
            String name = personObj.personName; // Accessing the field of a null object
            personObj.personName = "Antoni Banderas"; // Modifying the field of a null object
        } catch (NullPointerException npe) {
            System.err.println("NullPointerException caught!");
            npe.printStackTrace();
        }
    }
    private void c(){
        try {
            ArrayList<String> lis = new ArrayList<>();
            lis.add("My");
            lis.add("Name");
            System.out.println(lis.get(2));
        }catch (IndexOutOfBoundsException ibe){
            System.err.println("IndexOutOfBoundsException caught!");
            ibe.printStackTrace();
        }

    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }

}

// 8. Crea un programa que provoque las siguientes excepciones,
// las trate y muestre un mensaje indicando que la excepción ha sido tratada:
//
// a) ArithmeticException
// b) NullPointerException
// c) IndexOutOfBoundsException
