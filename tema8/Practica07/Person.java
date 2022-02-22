package com.programacionOO.tema8.Practica07;


import java.util.GregorianCalendar;

public class Person {
    public enum Sex{
        MAN,WOMAN,OTHER
    }
    private Card sip;
    private String name;
    private Sex sex;
    private int age;
    private GregorianCalendar adminsionDate;
    private String sintoms;
    private PreRev prerev;

    public Person(Card sip, String name, Sex sex, int age, GregorianCalendar adminsionDate, String sintoms, PreRev prerev) {
        this.sip = sip;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.adminsionDate = adminsionDate;
        this.sintoms = sintoms;
        this.prerev = prerev;
    }

    public Card getSip() {
        return sip;
    }

    @Override
    public String toString() {
        return  "\n" + sip + "\t" + name  + "\t" + sex + "\t" + age + "\t" +
                adminsionDate + "\t " + sintoms + "\t" + prerev ;
    }

}
