package ru.mirea.pract5_0;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> card = new Stack<>();
        int[] arr = new int[]{10,10,10,10,10,10,10,10,10,10};

        int math;
        for (int i = 0; i < 10; i++) {
            math = (int) (Math.random() / 0.1);
            for (int j = 0; j < 10;j++){
                if (arr[j] == math){
                    math = (int)(Math.random() / 0.1);
                    j = -1;
                }
            }
            arr[i] = math;
        }
        for (int i = 0; i < 10; i++){
            card.push(arr[i]);
            System.out.println(arr[i]);
        }
        //System.out.println((int) (Math.random() / 0.1));
    }
}
