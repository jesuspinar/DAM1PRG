package com.programacionOO.tema8.Practica07;

import com.programacionOO.libs.Util;

public class App {
    private CardDrum cDrum = new CardDrum(Config.NUM_CARDS,Config.INDX_CARDS);
    private Data admisions = new Data(Config.ENTRIES_TEST,cDrum);
//    private Person newAdmision = new Person();

    public App(){
        printUsersData();
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

    //todo : print history table
    //todo : print user

    private void printUsersData(){

        System.out.printf("Sip\t" + "Nombre\t" + "Sexo\t" + "Fecha de entrada\t" +
                "Hora de entrada\t" + "Edad\t" + "Sintomatologia\t" + "Temp\t" +
                "ppm\t" + "Ten Sis\t" + "Ten Dias\t" + "Fecha de alta\t" +
                "Hora de alta\t" + "Motivo del alta");
        Person[] persons = admisions.getAdmisions();
        for (Person person: persons) {
            System.out.println(person.toString());
        }

//        for (int i = 0; i < persons.length; i++) {
//             System.out.println(person.toString());
//        }
    }
}
