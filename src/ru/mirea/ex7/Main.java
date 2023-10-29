package ru.mirea.lab14.src.ru.mirea.ex7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String inp = sc.nextLine();
        sc.close();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inp);
        System.out.println(matcher.matches() ? "Подходит" : "Не подходит");
    }
}
