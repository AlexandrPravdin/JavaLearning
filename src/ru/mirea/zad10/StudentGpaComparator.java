package ru.mirea.zad10;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa().compareTo(o2.getGpa());
    }
}
