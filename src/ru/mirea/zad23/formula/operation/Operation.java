package ru.mirea.zad23.formula.operation;

import ru.mirea.zad23.formula.Evaluatable;

public abstract class Operation {
    protected Evaluatable firstOperand;
    protected Evaluatable secondOperand;

    public Operation(Evaluatable firstOperand,Evaluatable secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

}
