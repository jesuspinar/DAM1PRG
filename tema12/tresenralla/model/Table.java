package com.programacionOO.tema12.tresenralla.model;

import java.util.TreeMap;

/**
 * This class will interact with the table printed
 */
public class Table {
    protected TreeMap tree;

    public Table() {
        tree = new TreeMap();
    }

    /**
     * Adds a move into the table
     * for terminal
     */
    public void addMove(Player player,int col, int row){
        char ox = 'x';
        if(player.getPiece()){
            ox = 'o';
        }
        if (col == 1 && row == 1){
            tree.put(1,ox);
        }
        else if (col == 1 && row == 2){
            tree.put(2,ox);
        }
        else if (col == 1 && row == 3){
            tree.put(3,ox);
        }
        else if (col == 2 && row == 1){
            tree.put(4,ox);
        }
        else if (col == 2 && row == 2){
            tree.put(5,ox);
        }
        else if (col == 2 && row == 3){
            tree.put(6,ox);
        }
        else if (col == 3 && row == 1){
            tree.put(7,ox);
        }
        else if (col == 3 && row == 2){
            tree.put(8,ox);
        }
        else if (col == 3 && row == 3){
            tree.put(9,ox);
        }

    }


}



