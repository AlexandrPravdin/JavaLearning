package ru.mirea.lab4;

public class NissanGtr implements Priceable {
    private int price = 3000000;

    @Override
    public void getPrice() {
        System.out.println("Niisan's price is " + price);
    }
}
