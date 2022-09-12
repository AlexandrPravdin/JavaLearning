package ru.mirea.pract1;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String breed;

    public Dog(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.breed = "Mongrel";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void DogPassport (){
        System.out.println("Dog's Name = " + name + "\nDog's age = " + age + "\nDog's Weight = " + weight + "\nDog's Breed = " + breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    public String ToHumanAge() {
        return (name+"'s age in human years is "+age*7+" years");
    }
}
