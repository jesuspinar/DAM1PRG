package com.programacionOO.tema10.practica08;

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
    private Diccionario diccionario;

    public Practica08(int init) {//constructor for Practica09
        diccionario = new Diccionario(init);
        genTestWords();
    }

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
    public boolean addWord() throws IOException {
        String word = Util.askStringRestricted("Añade una palabra", 3,15).toLowerCase();
        String description = Util.askStringRestricted("Añade una descripcion", 5,30).toLowerCase();
        if (diccionario.addWord(word,description)){
            System.out.println("Palabra añadida correctamente");
            return true;
        }else {
            throw new IOException("La palabra no existe intentalo de nuevo");
        }
    }

    public boolean modifyWord() throws IOException {
        String word = Util.askStringRestricted("Añade una palabra que cambiar", 3,15).toLowerCase();
        String description = Util.askStringRestricted("Añade una nueva descripcion", 5,30).toLowerCase();
        if (diccionario.modifyWord(word,description)){
            System.out.println("Palabra modificada correctamente");
            return true;
        }else {
            throw new IOException("La palabra no existe intentalo de nuevo");
        }
    }
    public boolean deleteWord() throws IOException {
        String word = Util.askStringRestricted("Añade una palabra que eliminar", 3,15).toLowerCase();
        if (diccionario.deleteWord(word)){
            System.out.println("Palabra eliminada correctamente");
            return true;
        }else {
            throw new IOException("La palabra no existe intentalo de nuevo");
        }
    }

    public void showWordDefition() {
        String word = Util.askStringRestricted("Añade una palabra que buscar", 3,15).toLowerCase();
        System.out.printf("Definicion : %s\n",diccionario.getWord(word));
    }

    /**
     * Prints the definition and returns the key value
     * @return
     */
    public String showRandomWordDefition() {
        int index = Util.random(0,diccionario.getSize()-1);
        String randomWord = diccionario.getWord(index);
        String definition = diccionario.getWord(randomWord);
        System.out.printf("Definicion : %s\n",definition);
        return randomWord;
    }

    private void genTestWords(){
        diccionario.addWord("presidente","Persona que preside un Gobierno, consejo, tribunal, junta, sociedad, acto...");
        diccionario.addWord("grupo","Pluralidad de seres o cosas que forman un conjunto, material o mentalmente considerado.");
        diccionario.addWord("madre","Mujer que ha concebido o ha parido uno o más hijos.");
        diccionario.addWord("salud","Conjunto de las condiciones físicas en que se encuentra un organismo en un momento determinado.");
        diccionario.addWord("información","Acción y efecto de informar.");
        diccionario.addWord("perro","Mamífero doméstico de la familia de los cánidos, de tamaño, forma y pelaje muy diversos, según las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueño.");
        diccionario.addWord("aguacate","Esmeralda de forma de perilla.");
    }

    @Override
    public String toString() {
        return diccionario.toString();
    }
}
