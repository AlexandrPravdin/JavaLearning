package ru.mirea.zad6_10;

public class Memory {
    private String name;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int i;
    int b;
    String s;

    void PutInformation(int i, int b, String s) {
        this.i = i;
        this.b = b;
        this.s = s;
    }

    void TakeInformation() {
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "name='" + name + '\'' +
                '}';
    }
}
