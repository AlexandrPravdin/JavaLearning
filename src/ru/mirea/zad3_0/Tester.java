package ru.mirea.zad3_0;

public class Tester {
    private Circle[] arr = new Circle[5];
    private int N = 5;

    public Tester() {
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Circle();
            System.out.println(arr[i]);
        }
    }

    void Biggest() {
        Circle c = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getRadious() > c.getRadious()){
                c = arr[i];
            }
        }
        System.out.println("Biggest is " + c);
    }

    void Sort() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[j].getRadious() > arr[i].getRadious()){
                    Circle trash = arr[i];
                    arr[i] = arr[j];
                    arr[j] = trash;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
