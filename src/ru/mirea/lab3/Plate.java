package ru.mirea.lab3;

class Plate extends Dish {
    private int eatingTime = 10;

    public Plate(int weight, int depth) {
        super(weight, depth);
    }  //тарелка

    @Override
    public void eating() {
        System.out.println("Eating from plate in " + eatingTime + " Minutes");
    }

    public void washngTime() {
        System.out.println("Plate is washing");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "eatingTime=" + eatingTime +
                '}';
    }
}
