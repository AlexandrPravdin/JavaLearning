package ru.mirea.pract5_0;

import java.util.Scanner;

public class HOHO {
    private Scanner scanner = new Scanner(System.in);

    private int global = 0;

    public int rec(int max) {
        int a = scanner.nextInt();
        if (a == 0) return 0;
        if (a > max) {
            max = a;
            global = 0;
        } else if (a == max) global += 1;
        return rec(max);
    }

    public int getGlobal() {
        return global + 1;
    }
}
