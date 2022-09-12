package ru.mirea.lab22;

interface Hand {
    default void DoFight (){
        System.out.println("Hand is Fighting");
    }

    default void DoEat (){
        System.out.println("Eating");
    }
}
