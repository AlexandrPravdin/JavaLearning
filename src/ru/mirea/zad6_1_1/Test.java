package ru.mirea.zad6_1_1;

public class Test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(2,4,5,1,10);
        System.out.println(circle);
        circle.moveDown();
    }
}
