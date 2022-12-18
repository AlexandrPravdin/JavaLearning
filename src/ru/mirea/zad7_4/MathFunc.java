package ru.mirea.zad7_4;

public class MathFunc implements MathCalculate {
    @Override
    public double pow(int x, int count) {
        for (int i = 0; i < count - 1; i++) {
            x *= x;
        }
        return x;
    }

    @Override
    public double modCompl(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double circlePerimetr(int radius) {
        return 2.0 * Pi * radius;
    }
}
