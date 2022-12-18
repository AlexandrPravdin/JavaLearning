package ru.mirea.zad3;

import java.util.Random;

public class numb1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = r.nextInt() % 1000;
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");
        System.out.println();
        for (int i = 0; i < 10; i++) arr[i] = (int) (Math.random() * 1000);
        for (int i = 0; i < 10; i++) System.out.print(arr[i] + " ");

    }
}
