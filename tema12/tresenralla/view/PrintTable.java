package com.programacionOO.tema12.tresenralla.view;

import com.programacionOO.tema12.tresenralla.model.Table;

public class PrintTable {
    private Table table;

    public PrintTable() {
        table = new Table();
        init();
    }

    private void init(){
        System.out.println("   |   |   \n-----------\n   |   |   \n-----------\n   |   |   \n");
    }
    public void updateTable(){
        System.out.printf(" %c | %c | %c \n-----------\n %c | %c | %c \n-----------\n %c | %c | %c \n","c");

    }
}
