package ru.mirea.lab4;

public class SkodaOctaviaRs implements Priceable {
    private int price = 1000000;

    @Override
    public void getPrice() {
        System.out.println("Skoda's price is " + price);
    }

}
