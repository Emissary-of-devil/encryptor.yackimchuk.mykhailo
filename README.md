Caesar Cipher Encrypter/Decrypter/Bruteforce.

Я сподіваюся, що мені вдалося зробити робочу версію програми.

Oгляд проєкту:
1.Використовується алфавіт на латиниці.
2.Брутфорс (BRUTEFORCE)- программа підбирає усі можливі ключі.
3.Файли .txt таков вкладені у проєкт.

Встановлення та конфігурація:
1.Відкрийте программу на своєму додатку IntelliJ IDEA.
2.Відкрийте головний клас Runner і запустіть його.
3.Також можна запустити програму використовуючи JAR file. Щоб це зробити відкрийте командну строку або вікно терміналу
та перейдіть до директорії де JAR file знаходиться. Та запустіть JAR file використовуючи команди
 java -jar <JAR_FILE_NAME> <command> <filePath> <key>.

Використання:
1.Запуск здійснюється за командою java -jar myApp.jar command filePath key у вкладці Run\Debug configuration.
2.Копіюйте шлях знаходження проєкту і вставте замість filePath.
3.Не потрібно міняти шлях до файлу після команди ENCRYPT. Можна лише змінювати ENCRYPT\DECRYPT.
4.Тест файл з якого буде робитися зашифрування має мати назву MainFile.txt.
5.Після filePath введіть ключ. Ключ має складатися не з букв, а цифер.
6.Программа створить зашифрований і дешифрований текст з MainFile із назвами MainFile[DECRYPTED].txt тв MainFile[DECRYPTED].txt.
7.Брутфорс (BRUTEFORCE) також не потребує введення шляху. Потрібно лише ввести команду(command) BRUTEFORCE.
8. Результат BRUTEFORCE буде записаний у створений файл з закінченням MainFile[BRUTEFORCE].txt.
