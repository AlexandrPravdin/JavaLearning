package ru.mirea.zad3_0;

import java.util.Random;

public class Circle {
    private Random r = new Random();
    private Point center = new Point();
    private int radious;
    private double perimeter;

    public Circle() {
        radious = 1 + (int)(Math.random() * 20);
        perimeter = radious * 3.14 * 2.0;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "center = " + center +
                ", radious = " + radious +
                ", perimeter = " + perimeter +
                '}';
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }
}
