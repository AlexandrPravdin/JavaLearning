package ru.mirea.zad6_1;

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.moveRight();
        Transport transport = new Transport();
        transport.start();
        transport.moveLeft();


    }
}
