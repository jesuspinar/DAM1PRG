package com.programacionOO.tema08.practica07;


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
    public Person(Card sip, String name, Sex sex, int age,String sintoms, PreRev prerev) {
        this.sip = sip;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sintoms = sintoms;
        this.prerev = prerev;
    }

    public Card getSip() {return sip;}

    public GregorianCalendar getAdminsionDate() {
        return adminsionDate;
    }

    public String toString2() {
        SimpleDateFormat showTime = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat showDate = new SimpleDateFormat("dd/MM/yyyy");

        return  sip + "\t" + name  + "\t" + sex + "\t" + showDate.format(adminsionDate.getTime()) + "\t" +
                 showTime.format(adminsionDate.getTime())+ "\t" + age + "\t " + sintoms + "\t" + prerev;
    }
    @Override
    public String toString(){
        SimpleDateFormat showTime = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat showDate = new SimpleDateFormat("dd/MM/yyyy");

        String result;

        result =  String.format("%s%30s%12s%16s%20s%9d%28s%s",sip,name,sex,showTime.format(adminsionDate.getTime()),
                showDate.format(adminsionDate.getTime()),age,sintoms,prerev);

        return result;
    }



}
