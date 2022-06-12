package com.programacionOO.libs;

public class MenuBuilder {
    public static int printMenu(String [] options,String title) {
        if (options != null) {
            System.out.printf("+");
            int posibleOptions = options.length - 1;
            int selectedOption = 0;
            for (int i = 0; i < title.length() + 2; i++) {
                System.out.printf("-");
            }
            System.out.printf("+\n");
            System.out.printf("| %s |\n", title.toUpperCase());
            System.out.printf("+");
            for (int i = 0; i < title.length() + 2; i++) {
                System.out.printf("-");
            }
            System.out.printf("+\n");
            for (int i = 0; i < options.length; i++) {
                System.out.printf("%d. %s\n", (i + 1), options[i]);
            }
            System.out.println("0. Exit");
            do {
                selectedOption = Util.askInteger("Choose :");
            } while (selectedOption > posibleOptions && selectedOption < 0);
            return selectedOption;
        }
        return 0;
    }

}
