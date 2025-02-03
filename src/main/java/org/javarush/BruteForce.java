package org.javarush;

import java.util.ArrayList;
import java.util.List;

public class BruteForce {

    static String bruteforce (String text){
        ArrayList<Character> alphabet = Constants.Alphabet;
        List<String> listOfDescriptions = new ArrayList<>();

        for(int key = 1; key< alphabet.size(); key++){
            String decryptedText = CaesarCipher.cipher(text,-key);
            listOfDescriptions.add("Варіант:"+key+"\n"+decryptedText);
        }
return String.join("\n", listOfDescriptions) ;
    }
}

