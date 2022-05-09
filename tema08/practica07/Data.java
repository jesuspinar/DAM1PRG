package com.programacionOO.tema08.practica07;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Data {
    private Person[] admisions;
    private int countAdmisions;
    //private AmisionEntry[] newAdmision
    //todo guardar las consultas en otro
    //todo usar countAdmision para agilizar la busqueda del array

    public Data(int entries,CardDrum drum) {
        admisions = new Person[entries];
        if (Config.DEBUG){
            generateData(drum);
        }
    }

    private void generateData(CardDrum drum){
        Faker faker = new Faker(Locale.ITALY);
        Card sip ;
        String name;
        Person.Sex sex = null;
        int age;
        GregorianCalendar admisionDate;
        String sintoms;
        PreRev prerev;

        int year, month, dayOfMonth, hourOfDay,  minute,  second;
        float temperat ;
        int ppm,tensionSis,tensionDi;

        for (int i = 0; i < admisions.length; i++) {
            sip = new Card(drum.extractNum());
            name = faker.name().name();
            switch (Util.random(1,3)){
                case 1: sex = Person.Sex.MAN;break;
                case 2: sex = Person.Sex.WOMAN;break;
                case 3: sex = Person.Sex.OTHER;break;
            }
            age = Util.random(Config.MIN_AGE, Config.MAX_AGE);

            year = Util.random(Config.MIN_YEAR, Config.MAX_YEAR);
            month = Util.random(Config.MIN_MONTH, Config.MAX_MONTH);
            dayOfMonth = Util.random(Config.MIN_DAY, Config.MAX_DAY);
            hourOfDay = Util.random(Config.MIN_HOUR, Config.MAX_HOUR);
            minute = Util.random(Config.MIN_MINUT, Config.MAX_MINUT);
            second = Util.random(Config.MIN_SECON, Config.MAX_SECON);
            admisionDate = new GregorianCalendar(
                    year,month,dayOfMonth,hourOfDay,minute,second);
            sintoms = faker.beer().style();

            temperat = Util.randomFloat(Config.MIN_TEMP, Config.MAX_TEMP);
            ppm  = Util.random(Config.MIN_PPM,Config.MAX_PPM);
            tensionSis = Util.random(Config.MIN_TENS,Config.MAX_TENS);
            tensionDi = Util.random(Config.MIN_TENS,Config.MAX_TENS);
            prerev = new PreRev(temperat,ppm,tensionSis,tensionDi);

            Person nP = new Person(sip,name,sex,age, admisionDate,sintoms,prerev);
            admisions[i] = nP;
            countAdmisions++;
            //System.out.println(nP.toString());
        }
    }

    public boolean findBySip(int cardNum){
        for (int i = 0; i < admisions.length; i++) {
            if (admisions[i].getSip().getCardNum() == cardNum){
                return true;
            }
        }
        return false;
    }
    public boolean findByAdminsionDate(GregorianCalendar date){
        for (int i = 0; i < admisions.length; i++) {
            if (admisions[i].getAdminsionDate() == date){
                return true;
            }
        }
        return false;
    }
    
    public boolean insertPerson(Person nP){
        if (findBySip(nP.getSip().getCardNum()) == false &&
            findByAdminsionDate(nP.getAdminsionDate()) == false &&
            countAdmisions < admisions.length){
            admisions[++countAdmisions] = nP;
            return true;
        }else if(findBySip(nP.getSip().getCardNum()) == true ||
                countAdmisions > admisions.length){
            return false;
        }
        return false;
    }

    public Person[] getAdmisions() {
        return admisions;
    }

    @Override
    public String toString() {
        return Arrays.toString(admisions);
    }
}




















