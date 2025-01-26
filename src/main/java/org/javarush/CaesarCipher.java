package org.javarush;

import java.util.ArrayList;

 class CaesarCipher {

     static String cipher(String text, int shift){

        ArrayList<Character> alphabet = Constants.Alphabet;// витяг з класу Constants
        StringBuilder encrypt = new StringBuilder(); // зберігає зашифровані рядки
        shift = Math.floorMod(shift,alphabet.size());//модуль

        for (char symbol: text.toCharArray()){// створюємо чар і текст у одноіменній змінні перетворюємо на Чар
            if(alphabet.contains(symbol)){// перевірка чи входить символ у заданий алфавіт
                int index = alphabet.indexOf(symbol);
                int indexShift = (index+shift) % alphabet.size();//циклічний зсув
                encrypt.append(alphabet.get(indexShift));//додаємо у енкріпт алфавіт із зсувом
            }else {
                encrypt.append(symbol);//Якщо символ не знайдено повертаємо його без змін
            }
        }
        return encrypt.toString();
        //повертаємо енкріпт у стрінг
    }
     static String decipher(String text, int shift) {//реалізація декріптера
         return cipher(text,-shift );
     }
}
