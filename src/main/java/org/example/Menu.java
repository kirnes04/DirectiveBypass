package org.example;

import java.util.Scanner;

public class Menu {
    static String startingMenu() {
        System.out.println("You are currently working with the Bypasser." +
                " To start the program, you need to enter the path to the directory you want to bypass");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
