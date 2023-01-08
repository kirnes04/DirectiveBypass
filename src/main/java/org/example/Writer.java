package org.example;

import java.io.*;
import java.util.List;
import java.util.Scanner;

/**
 * Writes to the file.
 */
public class Writer {
    /**
     * Path to the output file.
     */
    private final File outputPath;

    /**
     * Public constrictor
     * @param output File to write in.
     */
    Writer(File output) {
        outputPath = output;
    }

    /**
     * Writes the result.
     * @param files list of files.
     * @throws IOException The file exist but is a directory rather than a regular file,
     * doesn't exist and cannot be created or cannot be opened
     */
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
