package ru.mirea.lab4;

public class MitsEvolution implements Priceable {
    private int price = 1500000;

    @Override
    public void getPrice() {
        System.out.println("Evolution's price is " + price);
    }
}
