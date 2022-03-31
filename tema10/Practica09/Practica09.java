package com.programacionOO.tema10.Practica09;

import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.libs.Util;
import com.programacionOO.tema10.Practica08.Practica08;

import java.io.IOException;
import java.util.TreeMap;

public class Practica09 {
    private final String menuMain = "Juego diccionario";
    private final String[] menuOptions = {"Añadir palabra",
            "Modificar palabra",
            "Eliminar palabra",
            "Consultar palabra",
            "Mostra diccionario",
            "Jugar",
            "Mejores puntuaciones"};
    private Practica08 extra ;
    private int playerPoints;
    private TreeMap<Integer,String> scores;

    public Practica09() throws IOException {
        extra = new Practica08(10);
        scores = new TreeMap<>();// todo : = new TreeMa<int, Jugador> de forma que el int actua como id del jugador(o indice)
        // y jugador mantiene los atributos (nombre y puntacion o vida...)
        int opcion = 0;
        do {
            opcion = MenuBuilder.printMenu(menuOptions,menuMain);
            switch (opcion){
                case 1: extra.addWord();break;
                case 2: extra.modifyWord();break;
                case 3: extra.deleteWord();break;
                case 4: extra.showWordDefition();break;
                case 5: System.out.println(extra.toString());break;
                case 6: playerPoints = play();
                    updatePodium(playerPoints);
                    ;break;
                case 7:
                    printPodium();
                    ;break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");
    }

    private int play() {
        boolean valid;
        int point = 0;
        do {
            System.out.println("Adivina que palabra es ...");
            String word = extra.showRandomWordDefition();
            String playerWord = Util.askStringRestricted("", 3,15);
            valid = word.equalsIgnoreCase(playerWord);
            if (valid){
                point++;
                System.out.println("*** Palabra adivinada *** ");
            }
        } while (valid);
        System.out.printf("Adivinaste : %d\n\n",point);
        return point;
    }
    //todo : implement positions
    private boolean updatePodium(int playerScore){
        Object[] score = scores.keySet().toArray();

        if (score.length > 0){
            for (int i = 0; i < score.length; i++) {//order > . <
                if(playerScore > (int)score[i] && scores.get(playerScore) == null){
                    String playerName = Util.askStringRestricted("Enter your name",3,15);
                    scores.replace((int)score[i], playerName);
                }
            }
            return true;
        }else{
            createPodium();
            return updatePodium(playerScore);
        }
    }
    private void printPodium(){
        System.out.println(scores.toString());
    }
    private void createPodium(){
        scores.put(1,"Juan");
        scores.put(3, "Sergio");
        scores.put(5, "Marco");

    }



}