package ru.mirea.pract6;

import java.util.Arrays;

public class Student {
    private int[] arr = new int[10];

    @Override
    public String toString() {
        return "Student{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void sortArr() {
        for (int i = 0; i < 10; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
    }
}
