package ru.mirea.zad11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthday;
    private DateFormat dateFormat;

    public Student(String name, String surname, Date birthday, String format) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.dateFormat = new SimpleDateFormat(format);
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

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return String.format("Name - %1$s %2$s, birthday - %3$s", this.name, this.surname, this.dateFormat.format(this.birthday.getTime()));
    }

    public static void main(String[] args) {
        Student student = new Student("Anton", "Ivanov", new Date(), "dd.MM.yyyy");
        System.out.println(student);
    }
}
