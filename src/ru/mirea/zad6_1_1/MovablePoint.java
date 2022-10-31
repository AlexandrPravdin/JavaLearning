package ru.mirea.zad6_1_1;


public class MovablePoint implements Movable {

    protected int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
