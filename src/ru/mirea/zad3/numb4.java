package ru.mirea.zad3;

import java.util.Random;
import java.util.Scanner;

public class numb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int N = scanner.nextInt();

        while (N <= 0) {
            System.out.println("Повторите ввод пожалуйста");
            N = scanner.nextInt();
        }
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) % (N + 1);
            System.out.print(arr[i] + " ");
        }

        int newN = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) newN++;
        }

        System.out.println();

        int[] newarr = new int[newN];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newarr[count] = arr[i];
                System.out.print(newarr[count] + " ");
                count++;
            }
        }
    }
}
