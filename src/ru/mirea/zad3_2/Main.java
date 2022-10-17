package ru.mirea.zad3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rubbles = scanner.nextInt();
        Converter converter = new Converter(rubbles);
        converter.ConverteToDollars();
        converter.ConverteToEuros();
        converter.ConverteToChina();
    }
}
