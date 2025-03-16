package org.javarush;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class WriteFile {
    static void writeFile(String originalFilePath, String content, String addName) {
        try {
            String newFilePath = originalFilePath.replace(".txt", addName + ".txt");
            Files.write(Paths.get(newFilePath), content.getBytes());
        } catch(IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}