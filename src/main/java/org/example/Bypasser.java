package org.example;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bypasser {
    private static final List<String> allFiles = new ArrayList<>();
    static void bypass(File directory) {
        String[] files = directory.list();
        if (files == null) {
            return;
        }
        for (String s : files) {
            File file = new File(s);
            if (file.isDirectory()) {
                bypass(file);
            } else {
                allFiles.add(file.getName());
            }
        }
    }

    public List<String> getResult() {
        return allFiles;
    }
}
