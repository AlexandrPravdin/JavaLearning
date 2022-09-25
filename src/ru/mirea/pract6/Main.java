package ru.mirea.pract6;

public class Main {
    public static void main(String[] args) {
        int[] iDNumber = new int[]{1, 6, 7, 4, 2, 36, 7, 1,9,2};
        Student s = new Student();
        s.setArr(iDNumber);
        s.sortArr();
        System.out.println(s);
    }
}
