package org.example;

import java.io.File;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String initialDirectory = Menu.startingMenu();
        try {
            File directory = new File(initialDirectory);
            Bypasser.bypass(directory);
            var files = Bypasser.getAllFiles().stream().sorted().toList();
            String outputPath = Menu.outputPath();
            File output = new File(outputPath);
            Writer writer = new Writer(output);
            writer.writeResult(files);

        } catch (NullPointerException exception) {
            System.out.println("You've entered incorrect path.");
        } catch (SecurityException exception) {
            System.out.println("Access denied for some files of the entered directory.");
        }
    }
}

