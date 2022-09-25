package ru.mirea.pract7;

import java.util.Stack;

public class Player {
    int numbers;
    Stack<Integer> card = new Stack<>();

    void Player() {
        int[] arr = new int[]{10,10,10,10,10};

        int math;
        for (int i = 0; i < 5; i++) {
            math = (int) (Math.random() / 0.1);
            for (int j = 0; j < 5;j++){
                if (arr[j] == math){
                    math = (int)(Math.random() / 0.1);
                    j = -1;
                }
            }
            arr[i] = math;
        }
        for (int i = 0; i < 5; i++){
            card.push(arr[i]);
            System.out.print(arr[i] + " " );
        }
        System.out.println();
    }

    void Win(int num){
        Stack<Integer> cardnext = new Stack<>();
        int winnerCard = card.pop();
        int size = card.size();
        for (int i = 0; i < size; i++){
            cardnext.push(card.pop());
        }
        card.push(num);
        card.push(winnerCard);
        size = cardnext.size();
        for (int i = 0; i < size; i++){
            card.push(cardnext.pop());
        }
    }
    void Win(){
        Stack<Integer> cardnext = new Stack<>();
        int winnerCard = card.pop();
        int size = card.size();
        for (int i = 0; i < size; i++){
            cardnext.push(card.pop());
        }
        card.push(winnerCard);
        size = cardnext.size();
        for (int i = 0; i < size; i++){
            card.push(cardnext.pop());
        }
    }

    void Lose(){
        card.pop();
    }

    int GetSize(){
        return card.size();
    }

    int GetTop(){
        return card.peek();
    }

}
