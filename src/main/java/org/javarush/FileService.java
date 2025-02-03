package org.javarush;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileService {

    private String command;

    private String filepath;

    private int key;

    public FileService(String command, String filepath, int key) throws IOException {
        this.command = command;
        this.filepath = filepath;
        this.key = key;
    }

    private File newFailPath (){
        String encryptedFilePath = filepath.replace(".txt", "[ENCRYPTED].txt");//
        File encryptedFile = new File(encryptedFilePath);
        // Перевірка, що файл існує
        if (!encryptedFile.exists()) {
            System.out.println("Error: Encrypted file not found: " + encryptedFilePath);
            return null;
        }
        return encryptedFile;
    }

 void processFile(){
    File ReadFromFile = new File(filepath);// перевірка чи файл існує
        if (!ReadFromFile.exists()) {
        System.out.println("Error:" + filepath + " File is not exist! Please enter valid file path");
        return;
        }

        try {
        String content = new String(Files.readAllBytes(Paths.get(filepath.toLowerCase())));// Читання файлу
        String result = "";// Результат з ENCRYPT або з DECRYPT

        switch (command) {
            case "ENCRYPT":
                result = CaesarCipher.cipher(content, key); // Шифруємо
                WriteFile.writeFile(filepath, result, "[ENCRYPTED]");// Запис зашифрованого в файл
                break;

            case "DECRYPT":
                File encryptedFile = newFailPath();
                if (encryptedFile == null) return;// Енкріпт без зміни шляху

                String encryptedContent = new String(Files.readAllBytes(encryptedFile.toPath()));// Зчитування з файлу
                result = CaesarCipher.decipher(encryptedContent, key);// Розшифровка і запис в файл з новим іменем
                WriteFile.writeFile(filepath, result, "[DECRYPTED]");
                break;

            case "BRUTEFORCE":
                File encryptedFileBruteforce = newFailPath();
                if (encryptedFileBruteforce == null) {
                    return;
                }

                String encryptedContentBruteforce = new String(Files.readAllBytes(encryptedFileBruteforce.toPath()));
                result = BruteForce.bruteforce(encryptedContentBruteforce);
                WriteFile.writeFile(filepath, result, "[BRUTEFORSE]");// Запис зашифрованого в файл
                break;

            default:
                System.out.println("Invalid command");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    }

