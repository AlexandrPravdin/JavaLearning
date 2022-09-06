package ru.mirea.lab4;

import java.awt.*;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(5, Color.BLACK);
        c.setColor(Color.BLUE);
        System.out.println(c.Leinght() + "\n");
        System.out.println(c.Area());
    }
}
