package ru.mirea.lab3;

public class Tureen extends Dish{ //нацальника дать мискa суп

    public Tureen(int weight, int depth) {
        super(weight, depth);
    }

    @Override
    public void eating() {
        System.out.println("Eating soup from Tureen");
        System.out.println("Weight is " +  weight);
    }

}
