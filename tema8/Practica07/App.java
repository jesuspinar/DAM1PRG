package com.programacionOO.tema8.Practica07;

import com.programacionOO.libs.Util;

public class App {
    private CardDrum cDrum = new CardDrum(Config.NUM_CARDS,Config.INDX_CARDS);
    private Data admisions = new Data(Config.ENTRIES_TEST,cDrum);
//    private Person newAdmision = new Person();

    public App(){

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

    //todo : regist or add new person entries to data admisions
    //todo : print history table

}
