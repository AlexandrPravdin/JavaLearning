package ru.mirea.lab41;

import java.awt.*;

public class Circle {
    private int radius;
    private Color color = Color.white;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double Area () {
        return 3.14 * radius * radius;
    }

    public double Leinght () {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                '}';
    }
}
