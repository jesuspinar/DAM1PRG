package com.programacionOO.tema8.Practica07;


import java.text.SimpleDateFormat;
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
        SimpleDateFormat showTime = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat showDate = new SimpleDateFormat("dd/MM/yyyy");

        return  "\n" + sip + "\t" + name  + "\t" + sex + "\t" + age + "\t" +
                showDate.format(adminsionDate.getTime()) + "\t " + sintoms + "\t" + prerev +
                showTime.format(adminsionDate.getTime());
    }

}
