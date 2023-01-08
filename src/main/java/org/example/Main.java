package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main() {
        String initialDirectory = Menu.printStartingMenu();

        try {
            File directory = new File(initialDirectory);

            Bypasser.bypass(directory);
            var files = Bypasser.getAllFiles().stream().sorted().toList();

            String outputPath = Menu.scanOutputPath();
            File output = new File(outputPath);

            Writer writer = new Writer(output);
            writer.writeResult(files);

            Menu.successfullyFinished();
        } catch (NullPointerException exception) {
            System.out.println("You've entered incorrect path.");
        } catch (SecurityException exception) {
            System.out.println("Access denied for some files of the entered directory.");
        } catch (IOException exception) {
            System.out.println("The file exist but is a directory rather than a regular file," +
                    " doesn't exist and cannot be created or cannot be opened");
        }

        Menu.repeat();
    }
}

