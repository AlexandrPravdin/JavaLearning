package ru.mirea.lab1_0;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int[] arr = new int[10];
    private Scanner sc = new Scanner(System.in);

    public void InputArray() {
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public int SummArray() {
        int summ = 0;
        for (int i = 0; i < 10; i++) {
            summ += arr[i];
        }
        return summ;
    }

    @Override
    public String toString() {
        return "Array =" + Arrays.toString(arr);
    }
}
