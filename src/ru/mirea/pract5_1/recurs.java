package ru.mirea.pract5_1;

import java.util.Scanner;

public class recurs {
    int a;

    public recurs(int a) {
        this.a = a;
    }

    void rec(int now) {
        if (now == a) return;
        for (int i = 0; i < now; i++) {
            System.out.print(now + " ");
        }
        rec(now + 1);
    }
}
