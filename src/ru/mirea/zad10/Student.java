package ru.mirea.zad10;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private String group;
    private int GPA;

    public Student(String name, String surname, String specialization, int course, String group, int GPA) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGPA() {
        return this.GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return String.format("Student %1$s %2$s, GPA = %3$s\n", this.name, this.surname, this.GPA);
    }
}
