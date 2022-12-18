package ru.mirea.zad23.formula.operation;

import ru.mirea.zad23.formula.Evaluatable;

public class Subtract extends Operation implements Evaluatable {

    public Subtract(Evaluatable firstOperand, Evaluatable secondOperand) {
        super(firstOperand, secondOperand);
    }

    @Override
    public double evaluate(double x) {
        return firstOperand.evaluate(x) - secondOperand.evaluate(x);
    }
}
