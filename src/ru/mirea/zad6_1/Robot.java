package ru.mirea.zad6_1;

public class Robot implements Moveable {

    @Override
    public void moveRight() {
        System.out.println("Робот двигается вправо");
    }

    @Override
    public void moveLeft() {
        System.out.println("Робот двигается влево");
    }
}
