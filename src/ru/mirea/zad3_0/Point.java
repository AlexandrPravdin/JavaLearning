package ru.mirea.zad3_0;

import java.util.Random;

public class Point {
    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                '}';
    }

    private Random r = new Random();
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public Point() {
        x = r.nextInt() % 100;
        y = r.nextInt() % 100;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
