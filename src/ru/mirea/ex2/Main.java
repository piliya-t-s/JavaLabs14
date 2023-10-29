package ru.mirea.lab14.src.ru.mirea.ex2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String input: ");
        String input = scanner.nextLine();

        String regex = "^abcdefghijklmnopqrstuv18340$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Совпадает");
        } else {
            System.out.println("Не совпадает");
        }
    }
}
