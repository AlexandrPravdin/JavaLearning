package ru.mirea.zad10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator<Student> pcomp = new StudentGpaComparator();
        ArrayList<Student> students = new ArrayList<Student>();
        setArray(students);

        students.sort(pcomp);

        outArray(students);


    }

    public static void setArray(ArrayList<Student> students){
        students.add(new Student("Bread", 24));
        students.add(new Student("Pop",34));
        students.add(new Student("Total",20));
        students.add(new Student(16,"Sasha","Petrov",1,"sd"));

    }


    public static void outArray(ArrayList<Student> students){
        for (Student student: students) {
            System.out.println(student);
        };
    }

}
