package org.example;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Writer {
    private final File outputPath;
    Writer(File output) {
        outputPath = output;
    }

    void writeResult(List<String> files) throws IOException {
        FileWriter fileWriter = new FileWriter(outputPath);

        for (var file : files) {
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                fileWriter.write(scanner.nextLine() + '\n');
            }

            fileReader.close();
            scanner.close();
        }

        fileWriter.close();
    }
}
