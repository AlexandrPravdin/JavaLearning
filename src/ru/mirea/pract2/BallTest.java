package ru.mirea.pract2;

public class BallTest {
    public static void main(String[] args){
        Ball ball = new Ball(3.4, 5.8);
        ball.setXY(4.6,6.7);
        ball.move(4.6,7.6);
        System.out.println(ball);
    }
}
