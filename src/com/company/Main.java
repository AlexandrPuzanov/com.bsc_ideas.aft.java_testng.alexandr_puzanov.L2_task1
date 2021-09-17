package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

   /* public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int countString = Integer.parseInt(reader.readLine());
        String veryShortString = null;
        String veryLongString = null;
        //String verySredString = null;
        float verySredString = 0;
        String verySredString1 = null;
        String verySredString2 = null;
        for (int i = 0; i < countString; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            String currentString = reader.readLine();


            if (veryShortString == null || currentString.length() < veryShortString.length()) {
                veryShortString = currentString;
            }
            if (veryLongString == null || currentString.length() > veryLongString.length()) {
                veryLongString = currentString;
            }
            //verySredString = verySredString + currentString;
            verySredString += ((float) currentString.length()) / countString;
            for (int j = 0; j < countString; j++) {


                if (verySredString1 == null || currentString.length() < verySredString) {

                    verySredString1 = currentString;


                }

            }

            //verage += (float) item.length();
        }

            System.out.println("Самая короткая строка = " + veryShortString);
            System.out.println("Ее длина равна " + veryShortString.length());
            System.out.println("Самая длинная строка = " + veryLongString);
            System.out.println("Ее длина равна " + veryLongString.length());
        System.out.println("средняя длина " + verySredString);
            System.out.println("строки длина которых меньше средней  " + verySredString1);
        //System.out.println("длина строки длина которых меньше средней " + verySredString1.length());

        }*/

   /* public static void main(String[] args) {
        String veryShortString = null;
        String veryLongString = null;
        int n = 0;
        //Ввод количества строк с клавиатуры
        while(true){
            System.out.println("Введите количество строк");
            Scanner sc1 = new Scanner (System.in);
            try{
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
            }

        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);

        //Инициализация массива str строками
        for(int i = 0; i < str.length; i++){
            System.out.println("Введите строку №" + (i+1));
            str[i] = sc2.nextLine();
        }
        float average = 0f;
        //Считаем общую сумму длин строк
        for(String item : str){
            average += (float) item.length();
        }
        //Считаем среднее арифметическое суммы длин этих строк
        average /= str.length;

        System.out.println("Средняя длина строки = (" + average + ")");
        //Выводим результат (выводит все строки имеющие длину ниже средней)
        for(int i = 0; i < n; i++){
            if (veryShortString == null ||str[i].length() < veryShortString.length()){

                veryShortString  = str[i];

            }

            if (veryLongString == null ||str[i].length() > veryLongString.length()){

                veryLongString  = str[i];

            }

            if (str[i].length() < average){
                System.out.println("Строка меньшая чем средняя длина: ");
                System.out.println(str[i] + " ee длина = " + str[i].length());
            }

            if (str[i].length() > average){
                System.out.println("Строка больше чем средняя длина: ");
                System.out.println(str[i] + " ee длина = " + str[i].length());
            }


        }
        System.out.println("Самая короткая строка = " + veryShortString);
        System.out.println("Ее длина равна " + veryShortString.length());
        System.out.println("Самая длинная строка = " + veryLongString);
        System.out.println("Ее длина равна " + veryLongString.length());

    }*/

    private static int diffWords(String st) { // число уникальных символов
        StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
        String c; // текущий символ в строке
        for (int i = 0; i < st.length(); i++) { // обход строки
            c = String.valueOf(st.charAt(i)); // получить текущий символ
            if (u.indexOf(c) == -1) // символ еще не встречался
                u.append(c); // добавляем
        }

        return u.length(); // возвращаем длину получившейся строки
    }

    private static boolean uniqueSymbolsChecker(String word) {
        boolean result = false;

        ArrayList<Character> list = new ArrayList<>();
        char[] chars = word.toCharArray();

        for (char c : chars) {
            if (list.contains(c)) {
                result = false;
                return result;
            } else {
                list.add(c);
                result = true;
            }
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        String veryShortString = null;
        String veryLongString = null;
        int n = 0;
        //Ввод количества строк с клавиатуры
        while (true) {
            System.out.println("Введите количество слов");
            Scanner sc1 = new Scanner(System.in);
            try {
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            }

        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);

        //Инициализация массива str строками
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите слово №" + (i + 1));
            str[i] = sc2.nextLine();



        }

        float average = 0f;
        //Считаем общую сумму длин строк
        for(String item : str){
            average += (float) item.length();
        }
        //Считаем среднее арифметическое суммы длин этих строк
        average /= str.length;

        System.out.println("Средняя длина строки = (" + average + ")");


        for(int i = 0; i < n; i++){
            if (veryShortString == null ||str[i].length() < veryShortString.length()){

                veryShortString  = str[i];

            }

            if (veryLongString == null ||str[i].length() > veryLongString.length()){

                veryLongString  = str[i];

            }

            if (str[i].length() < average){
                System.out.println("Строка меньшая чем средняя длина: ");
                System.out.println(str[i] + " ee длина = " + str[i].length());
            }

            if (str[i].length() > average){
                System.out.println("Строка больше чем средняя длина: ");
                System.out.println(str[i] + " ee длина = " + str[i].length());
            }


        }
        System.out.println("Самая короткая строка = " + veryShortString);
        System.out.println("Ее длина равна " + veryShortString.length());
        System.out.println("Самая длинная строка = " + veryLongString);
        System.out.println("Ее длина равна " + veryLongString.length());


        String goal = str[0]; // искомое слово

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + ", "); // выводим очередной элемент
            if (diffWords(str[i]) < diffWords(goal))
                goal = str[i]; // новый мин.эл
        }

        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("[“:”,\"'`;()?_-]", "");
            if (uniqueSymbolsChecker(str[i])) {
                System.out.print("Cлово, состоящее только из различных символов:\n" + str[i]);
                break;
            }


        }


        System.out.println("Искомое слово: " + goal + ", число разных символов: " + diffWords(goal));

        int t = 1;
        for (int i = 0; i < t; i++) {
            System.out.print("Введите слова:\t");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = reader.readLine();
            Matcher matcher = Pattern.compile("\\b\\d+\\b").matcher(a);

            int counter = 0;
            String word = null;
            while (matcher.find()) {
                counter++;
                word = matcher.group();
                if (counter == 2) break;
            }
            if (word == null) {
                System.out.println("нет слов, состоящих из цифр");
            } else if (counter == 1) {
                System.out.println(word + " - 'найдено только одно слово, состоящее из цифр");
            } else {
                System.out.println(word + " - 'это слово второе и состоит из цифр");
            }
        }

    }
}


