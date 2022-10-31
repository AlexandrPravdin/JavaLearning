package ru.mirea.zad6_6;

public class TEsT{
    public static void main(String[] args) {
        Book bk = new Book();
        Shop sp = new Shop();
        Printable[] print = new Printable[]{bk, sp, sp, bk, sp};
        for (int i = 0; i < 5; i++) {
            print[i].print();
        }
    }
}
