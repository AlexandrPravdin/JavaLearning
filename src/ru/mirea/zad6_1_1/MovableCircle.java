package ru.mirea.zad6_1_1;


public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveRight() {
        System.out.println("Круг движется вправо");
    }

    @Override
    public void moveLeft() {
        System.out.println("Круг движется влево");
    }

    @Override
    public void moveDown() {
        System.out.println("Круг движется вниз");
    }

    @Override
    public void moveUp() {
        System.out.println("Круг движется вверх");
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
