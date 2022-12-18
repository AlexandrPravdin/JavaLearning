package ru.mirea.zad6_10;

public class Processor {
    private String name;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void Mathing() {
        System.out.println("Считаю какую то чушь");
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                '}';
    }
}
