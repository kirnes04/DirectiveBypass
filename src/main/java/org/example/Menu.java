package org.example;

import java.util.Scanner;

/**
 * Implements console menu.
 */
public class Menu {
    /**
     * Prints the starting Menu and scans the path.
     * @return path to the initial directory.
     */
    static String printStartingMenu() {
        System.out.println("You are currently working with the Bypasser." +
                " To start the program, you need to enter the path to the directory you want to bypass");

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        return path;
    }

    /**
     * Scans the output path.
     * @return path to the file, where the result may be written.
     */
    static String scanOutputPath() {
        System.out.println("""
                The program has scanned all the files in the entered directory.
                Enter the path to the file, where you want the result to be printed.
                """);

        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        return path;
    }

    /**
     * Starting the application from the very beginning.
     */
    static void repeat() {
        System.out.println("If you want to run the program once again, type 1." +
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

    /**
     * Writes the message if the application finished its work successfully.
     */
    static void successfullyFinished() {
        System.out.println("The application finished and text from all the files" +
                " is concatenated to the chosen one.");
    }
}
