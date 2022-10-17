package ru.mirea.pract5_2;

public class recurs {
    int n;

    public recurs(int n) {
        this.n = n;
    }

    void rec (int r){
        if (n == r) return;
        System.out.print(r + " ");
        rec(r+1);
    }
}
