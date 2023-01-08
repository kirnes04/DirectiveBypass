package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String initialDirectory = Menu.startingMenu();
        try {
            File file = new File(initialDirectory);
            Bypasser.bypass(file);
        } catch (NullPointerException exception) {
            System.out.println("You've entered incorrect path.");
        } catch (SecurityException exception) {
            System.out.println("Access denied for some files of the entered directory.");
        }
        // bypass
        // sort the list
        // print all to the new file
    }
}

