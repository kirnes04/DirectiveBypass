package org.example;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bypasser {
    private static final List<String> allFiles = new ArrayList<>();
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

    public static List<String> getAllFiles() {
        return allFiles;
    }
}
