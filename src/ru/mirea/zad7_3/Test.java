package ru.mirea.zad7_3;

public class Test {
    public static void main(String[] args) {
        MovablePoint lt = new MovablePoint(3,3,10);
        MovablePoint rb = new MovablePoint(6,6,10);
        MovableRectangle rect = new MovableRectangle(lt,rb);
        rect.SpeedTest();
        System.out.println(rect);

    }
}
