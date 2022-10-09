/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:


        1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).

        2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).

        3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).

        4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.

        5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        */
package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Анализируем строку I like Java!!! :");
        String text = "I like Java!!!";

        //проверка условий
        boolean one = text.contains("Java");
        boolean two = text.startsWith("I like");
        boolean three = text.endsWith("!!!");

        //вывести в верхнем регистре, если все условия верны
        if (one==true & two==true & three==true) System.out.println(text.toUpperCase());

        //вывести подстроку Jovo - в задаче указано введите, я подумала, что опечатка
        System.out.println(text.replace('a','o').substring(7,11));
    }
}