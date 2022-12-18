package ru.mirea.zad6_10;

public class Monitor {
    private String name;
    private String s = "Пока пусто";

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void ShowInformation() {
        System.out.println(s);
    }

    void PutInformation(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'';
    }
}
