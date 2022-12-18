package ru.mirea.zad3;

public class generator {
    private int[] arr = new int[4];

    public generator() {
        for (int i = 0; i < 4; i++) {
            arr[i] = 10 + (int) (Math.random() * 88);
            System.out.print(arr[i] + " ");
        }
    }

    void growing() {
        boolean count = true;
        for (int i = 0; i < 3; i++) {
            if (arr[i] > arr[i + 1]) {
                count = false;
                break;
            }
        }
        if (count) System.out.println("Да, строго возрастает");
    }


}
