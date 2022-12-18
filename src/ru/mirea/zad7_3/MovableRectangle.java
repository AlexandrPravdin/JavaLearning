package ru.mirea.zad7_3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveRight() {
        System.out.println("Прямоугольник движется вправо");
    }

    @Override
    public void moveLeft() {
        System.out.println("Прямоугольник движется влево");
    }

    @Override
    public void moveDown() {
        System.out.println("Прямоугольник движется вниз");
    }

    @Override
    public void moveUp() {
        System.out.println("Прямоугольник движется вверх");
    }

    void SpeedTest() {
        if (topLeft.Speed == bottomRight.Speed) System.out.println("Скорость одинаковая");
        else System.out.println("Скорость различается на " + (topLeft.Speed - bottomRight.Speed));
    }
}
