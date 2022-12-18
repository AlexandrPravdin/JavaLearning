package ru.mirea.zad6_11;

public class Calcium implements Convertable {

    @Override
    public void Convert(double a) {
        System.out.println(a + " Цельсий в фаренгейтах " + (a * 9 / 5 + 32));
        System.out.println(a + " Цельсий в кельвинах " + (a + 273.15));
    }
}
