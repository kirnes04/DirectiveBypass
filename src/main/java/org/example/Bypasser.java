package org.example;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Bypasser class.
 */
public class Bypasser {
    /**
     * contains all the files.
     */
    private static final List<String> allFiles = new ArrayList<>();

    /**
     * Bypasses the chosen directory.
     * @param directory chosen directory.
     */
    static void bypass(File directory) {
        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        for (var file : files) {
            if (file.isDirectory()) {
                bypass(file);
            } else {
                allFiles.add(file.getName());
            }
        }
    }

    /**
     * Property.
     * @return allFiles.
     */
    public static List<String> getAllFiles() {
        return allFiles;
    }
}
