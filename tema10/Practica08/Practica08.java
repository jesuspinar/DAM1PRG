package com.programacionOO.tema10.Practica08;

import com.programacionOO.libs.MenuBuilder;
import com.programacionOO.libs.Util;

import java.io.IOException;

public class Practica08 {//controler, view
    private final String menuMain = "Gestión diccionario";
    private final String[] menuOptions = {"Añadir palabra",
                                        "Modificar palabra",
                                        "Eliminar palabra",
                                        "Consultar palabra",
                                        "Mostra diccionario"};
    Diccionario diccionario;
    public Practica08() throws IOException {
        int opcion = 0;
        diccionario = new Diccionario();
        do {
            opcion = MenuBuilder.printMenu(menuOptions,menuMain);
            switch (opcion){
                case 1: addWord();break;
                case 2: modifyWord();break;
                case 3: deleteWord();break;
                case 4: showWordDefition();break;
                case 5: System.out.println(diccionario.toString());break;
            }
        }while (opcion != 0);
        System.out.println("Hasta pronto !!");


    }
    private boolean addWord() throws IOException {
        String word = Util.askStringRestricted("Añade una palabra", 3,15).toLowerCase();
        String description = Util.askStringRestricted("Añade una descripcion", 5,30).toLowerCase();
        if (diccionario.addWord(word,description)){
            System.out.println("Palabra añadida correctamente");
            return true;
        }else {
            throw new IOException("La palabra no existe intentalo de nuevo");
        }
    }

    private boolean modifyWord() throws IOException {
        String word = Util.askStringRestricted("Añade una palabra que cambiar", 3,15).toLowerCase();
        String description = Util.askStringRestricted("Añade una nueva descripcion", 5,30).toLowerCase();
        if (diccionario.modifyWord(word,description)){
            System.out.println("Palabra modificada correctamente");
            return true;
        }else {
            throw new IOException("La palabra no existe intentalo de nuevo");
        }
    }
    private boolean deleteWord() throws IOException {
        String word = Util.askStringRestricted("Añade una palabra que eliminar", 3,15).toLowerCase();
        if (diccionario.deleteWord(word)){
            System.out.println("Palabra eliminada correctamente");
            return true;
        }else {
            throw new IOException("La palabra no existe intentalo de nuevo");
        }
    }

    private void showWordDefition() {
        String word = Util.askStringRestricted("Añade una palabra que buscar", 3,15).toLowerCase();
        System.out.printf("Definicion : %s\n",diccionario.showWord(word));
    }


}
