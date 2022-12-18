package ru.mirea.lab3;

public abstract class Dish {
    protected int weight;
    protected int depth;

    public Dish(int weight, int depth) {
        this.weight = weight;
        this.depth = depth;
    }

    abstract public void eating();
}



