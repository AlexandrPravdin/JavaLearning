package ru.mirea.lab42;

interface Hand {
    default void DoFight (){
        System.out.println("Hand is Fighting");
    }

    default void DoEat (){
        System.out.println("Eating");
    }
}
