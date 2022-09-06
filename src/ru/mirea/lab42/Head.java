package ru.mirea.lab42;

interface Head {
    default void DoThink (){
        System.out.println("Head is thinking");
    }

    default void DoBendOver(){
        System.out.println("Head is bend over");
    }
}
