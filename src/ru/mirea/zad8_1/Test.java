package ru.mirea.zad8_1;

public class Test {
    public static void main(String[] args) {
        Recurs recurs = new Recurs();
        recurs.Recurs1toN(5);
        System.out.println("\n");
        recurs.RecursAtoB(5, 7);
        System.out.println("\n");
        recurs.RecursAtoB(7, 8);
        System.out.println("\n");
        recurs.RecursAtoB(5, 5);
    }
}
