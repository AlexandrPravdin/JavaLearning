package ru.mirea.zad21.convert;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {61, 15, 91, -2};
        Conversion<Integer> conversionInt = new Conversion<>(integers);
        conversionInt.showList();

        String[] strings = {"one", "two", "three"};
        Conversion<String> conversionStr = new Conversion<>(strings);
        conversionStr.showList();
    }
}