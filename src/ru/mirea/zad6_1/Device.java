package ru.mirea.zad6_1;

public abstract class Device implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Девайс двигается вправо");
    }

}
