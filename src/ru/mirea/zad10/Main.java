package ru.mirea.zad10;

public class Main {
    public static void main(String[] args) throws StudentNotFound {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.setArray(10);
        System.out.println(sortingStudentsByGPA.iDNumber);
        Student student = sortingStudentsByGPA.find("Student0", "Student1");
        System.out.println("Success");
    }
}
