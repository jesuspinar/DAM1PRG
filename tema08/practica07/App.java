package com.programacionOO.tema08.practica07;

import com.programacionOO.libs.Util;

import java.util.GregorianCalendar;

public class App {
    private CardDrum cDrum = new CardDrum(Config.NUM_CARDS,Config.INDX_CARDS);
    private Data admisions = new Data(Config.ENTRIES_TEST,cDrum);
//    private Person newAdmision = new Person();

    public App(){
        printTable();
    }

    private boolean isSipRegistered(){
        int person = Util.askInteger("Enter your SIP number:");
        boolean registered = admisions.findBySip(person);

        if (registered == true){
            return true;
        }else {
            return false;
        }
    }


    private void printTable(){
        String table = String.format("%s%30s%14s%20s%18s%8s%27s%15s%7s%12s%11s%20s%20s%20s",
                "Sip","Nombre", "Sexo","Fecha de entrada","Hora de entrada","Edad","Sintomatologia",
                "Temperatura", "Ppm","Ten.Sis","Ten.Dias","Fecha de alta",
                "Hora de alta","Motivo del alta");
        System.out.println(table);
        Person[] persons = admisions.getAdmisions();
        for (Person person: persons) {
            System.out.println(person.toString());
        }
    }

    private void printMenu(){
        System.out.println(
            "*********************\n" +
            "***** URGENCIAS *****\n" +
            "*********************\n" +
            "1. Nuevo paciente ...\n" +
            "2. Atender paciente ...\n" +
            "3. Consultas ...\n" +
            "4. Alta médica ...\n"+
            "-----------------------\n " +
            "0. Salir\n");
    }
    private void optionMenu() {
        int option = Util.askInteger("Elija una opcion");
        do {
            switch (option) {
                case 1://todo: nuevo paciente
                    break;
                case 2://todo atender paciente
                    break;
                case 3://todo: consultas..
                    break;
                case 4://todo : altamedica...
                    break;
            }
        }while (option > 4 || option <= 0);
    }

    private void newEntry(){
        Card sip;
        String name;
        Person.Sex sex;
        int age;
        GregorianCalendar adminsionDate;
        String sintoms;
        PreRev prerev;
        float temperatura;
        int ppm;
        int tensionSis;
        int tensionDi;



        //admisions.insertPerson()
    }
}
