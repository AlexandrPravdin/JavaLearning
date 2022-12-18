package ru.mirea.pract1_0;

public class Main {
    public static void main(String[] args) {
        //String name, int age, int weight, String breed
        Dog Rax = new Dog("Rax", 10, 15, "Sheepdog");
        Dog Puppy = new Dog("Puppy", 15, 25, "Husky");
        System.out.println(Rax);
        System.out.println(Puppy.ToHumanAge());
    }
}
