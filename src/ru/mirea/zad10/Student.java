package ru.mirea.zad10;

public class Student{
    public Integer gpa;
    public String firstname;
    public String secondname;
    public Integer numberofcourse;
    public String group;


    public Student(Integer gpa, String firstname, String secondname, Integer numberofcourse, String group) {
        this.gpa = gpa;
        this.firstname = firstname;
        this.secondname = secondname;
        this.numberofcourse = numberofcourse;
        this.group = group;
    }

    public Student(String firstname, Integer gpa) {
        this.gpa = gpa;
        this.firstname = firstname;
    }

    public Student(Integer gpa) {
        this.gpa = gpa;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", numberofcourse=" + numberofcourse +
                ", group='" + group + '\'' +
                '}';
    }
}
