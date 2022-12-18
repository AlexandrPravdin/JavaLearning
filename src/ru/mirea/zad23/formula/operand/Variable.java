package ru.mirea.zad23.formula.operand;



public class Variable extends Operand {
    public Variable(char symbol){
    }

    @Override
    public double evaluate(double x) {
        return x;
    }
}
