package ru.mirea.lab3;

public class Main {
    public static void main(String[] args) {
        Plate p = new Plate(100, 10);
        Tureen t = new Tureen(100, 30);
        p.eating();
        t.eating();
        p.washngTime();
        System.out.println(p);
    }
}
