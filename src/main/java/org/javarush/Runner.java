package org.javarush;
import java.io.IOException;


public class Runner {

    public static void main(String[] args) throws IOException {
        String command = args[0].toUpperCase();

        String filepath = args[1];

        int key;

        try {
            key = Math.abs(Integer.parseInt(args[2]));// Застосування модулю для ключа
        } catch (NumberFormatException e) {
            System.out.println("Invalid key");
            return;
        }
        FileService fileService = new FileService(command, filepath, key);
        fileService.processFile();
    }
}
