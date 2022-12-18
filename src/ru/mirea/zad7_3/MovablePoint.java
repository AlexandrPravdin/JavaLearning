package ru.mirea.zad7_3;

public class MovablePoint implements Movable {

    protected int x, y, Speed;

    public MovablePoint(int x, int y, int Speed) {
        this.x = x;
        this.y = y;
        this.Speed = Speed;
    }

    @Override
    public void moveRight() {
        System.out.println("Точка движется вправо");
    }

    @Override
    public void moveLeft() {
        System.out.println("Точка движется влево");
    }

    @Override
    public void moveDown() {
        System.out.println("Точка движется вниз");
    }

    @Override
    public void moveUp() {
        System.out.println("Точка движется вверх");
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", Speed=" + Speed +
                '}';
    }
}
