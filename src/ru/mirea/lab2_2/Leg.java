package ru.mirea.lab2_2;

interface Leg {
    default void DoMove (){
        System.out.println("Leg is moving");
    }

    default void DoSit(){
        System.out.println("Legs is siting");
    }
}
