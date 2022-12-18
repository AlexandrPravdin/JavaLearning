package ru.mirea.zad20.calculator;

public class Calculator {
    public static <N extends Number> N sum(N a, N b) {
        if (a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() + b.intValue()));
        else if (a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() + b.doubleValue()));
        else if (a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() + b.floatValue()));

        return null;
    }

    public static <N extends Number> N subtraction(N a, N b) {
        if (a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() - b.intValue()));
        else if (a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() - b.doubleValue()));
        else if (a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() - b.floatValue()));

        return null;
    }

    public static <N extends Number> N multiply(N a, N b) {
        if (a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() * b.intValue()));
        else if (a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() * b.doubleValue()));
        else if (a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() * b.floatValue()));

        return null;
    }

    public static <N extends Number> N divide(N a, N b) {
        if (a instanceof Integer)
            return (N) (Integer.valueOf(a.intValue() / b.intValue()));
        else if (a instanceof Double)
            return (N) (Double.valueOf(a.doubleValue() / b.doubleValue()));
        else if (a instanceof Float)
            return (N) (Float.valueOf(a.floatValue() / b.floatValue()));

        return null;
    }

    public static void main(String[] args) {
        System.out.printf("8 + 9 = %1$s\n", sum(Integer.valueOf(8), Integer.valueOf(9)));
        System.out.printf("5.4 - 9.1 = %1$s\n", subtraction(5.4, 9.1));
        System.out.printf("4.7 * 7.2 = %1$s\n", multiply(4.7f, 7.2f));
    }
}