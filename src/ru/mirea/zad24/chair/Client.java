package ru.mirea.zad24.chair;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Sitting...");
    }

    public void setChair(Chair chair){
        this.chair = chair;
    }
}
