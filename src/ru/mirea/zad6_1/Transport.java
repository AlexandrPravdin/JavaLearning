package ru.mirea.zad6_1;

public class Transport implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Транспортное средство двигается вправо");
    }

    @Override
    public void moveLeft() {
        System.out.println("Транспортное средство двигается влево");
    }

    public void stop() {
        System.out.println("Транспортное средство остановилось");
    }

    public void start() {
        System.out.println("Транспортное средство поехало");
    }
}
