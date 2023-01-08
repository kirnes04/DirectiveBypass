package org.example;

import java.util.Scanner;

public class Menu {
    static String startingMenu() {
        System.out.println("You are currently working with the Bypasser." +
                " To start the program, you need to enter the path to the directory you want to bypass");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        return path;
    }

    static String outputPath() {
        System.out.println("""
                The program has scanned all the files in the entered directory.
                Enter the path to the file, where you want the result to be printed.
                """);

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        return path;
    }

    static void repeat() {
        System.out.println("The program finished. If you want to run it once again, type 1." +
                " Else, the application will sut down.");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            Main.main();
        } else {
            System.out.println("Goodbye!");
        }

        scanner.close();
    }
}
