package ru.mirea.zad8_1;

import java.util.Scanner;

public class Recurs {
    private int a, b;
    Scanner scanner = new Scanner(System.in);


    public void Recurs1toN(int b) {
        a = 1;
        System.out.print(a + " ");
        if (a == b) return;
        ClosedRecursAtoB(a + 1, b);
    }

    public void RecursAtoB(int a, int b) {
        if (a == b) {
            while (true) {
                System.out.println("Введи норм число 🤡");
                a = scanner.nextInt();
                if (a != b) break;
            }
        }
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        System.out.print(a + " ");
        ClosedRecursAtoB(a + 1, b);
    }

    private void ClosedRecursAtoB(int a, int b) {
        System.out.print(a + " ");
        if (a == b) return;
        ClosedRecursAtoB(a + 1, b);
    }

    int RecursAinB(int pow, int summ) {
        this.b = summ;
        this.a = pow;
        return ClosedRecursAinB(((int) Math.pow(10, pow + 1)) - 1, ((int) Math.pow(10, pow)));
    }

    private int ClosedRecursAinB(int aend, int astart) {
        if (astart > aend) return 0;
        int num = astart, count = 0;
        for (int i = 0; i < a; i++) {
            count += num % 10;
            num %= 10;
        }
        if (count == b) {
            System.out.println(num);
            return 1 + ClosedRecursAinB(aend, astart + 1);
        }
        return ClosedRecursAinB(aend, astart + 1);
    }

}
