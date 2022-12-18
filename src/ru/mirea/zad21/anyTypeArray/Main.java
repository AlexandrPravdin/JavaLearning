package ru.mirea.zad21.anyTypeArray;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {7, 2, -1};
        AnyTypeArray anyTypeArray = new AnyTypeArray<Integer>(integers);
        anyTypeArray.showArray();

        String[] strings = {"hello", "world", "!"};
        anyTypeArray = new AnyTypeArray<String>(strings);
        anyTypeArray.showArray();

        System.out.println(anyTypeArray.getElement(1));
    }
}