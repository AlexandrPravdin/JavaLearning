package ru.mirea.zad10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator {
    ArrayList<Student> iDNumber;

    public SortingStudentsByGPA() {
    }

    public void setArray(int len) {
        this.iDNumber = new ArrayList(len);
        new Random();

        for (int i = 0; i < len; ++i) {
            int randomNumber = 1;
            this.iDNumber.add(new Student("Student" + randomNumber, "Student" + randomNumber,
                    "prog", 3, "inbo", randomNumber));
        }

    }

    public void outArray() {
        Iterator var1 = this.iDNumber.iterator();

        while (var1.hasNext()) {
            Student student = (Student) var1.next();
            System.out.println(student);
        }

    }

    public int compare(Object o1, Object o2) {
        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }

    private int partition(ArrayList<Student> arr, int begin, int end) {
        Student pivot = (Student) arr.get(end);
        int i = begin - 1;

        for (int j = begin; j < end; ++j) {
            if (this.compare(arr.get(j), pivot) < 0) {
                ++i;
                Student swapTemp = (Student) arr.get(i);
                arr.set(i, (Student) arr.get(j));
                arr.set(j, swapTemp);
            }
        }

        Student swapTemp = (Student) arr.get(i + 1);
        arr.set(i + 1, (Student) arr.get(end));
        arr.set(end, swapTemp);
        return i + 1;
    }

    public void qSort(ArrayList<Student> arr, int begin, int end) {
        if (begin < end) {
            int partitions = this.partition(arr, begin, end);
            this.qSort(arr, begin, partitions - 1);
            this.qSort(arr, partitions + 1, end);
        }

    }

    public void merge(ArrayList<Student> a, ArrayList<Student> l, ArrayList<Student> r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (this.compare(l.get(i), r.get(j)) < 0) {
                a.set(k++, (Student) l.get(i++));
            } else {
                a.set(k++, (Student) r.get(j++));
            }
        }

        while (i < left) {
            a.set(k++, (Student) l.get(i++));
        }

        while (j < right) {
            a.set(k++, (Student) r.get(j++));
        }

    }

    public void mergeSort(ArrayList<Student> a) {
        if (a.size() >= 2) {
            int mid = a.size() / 2;
            ArrayList<Student> l = new ArrayList(mid);
            ArrayList<Student> r = new ArrayList(a.size() - mid);

            int i;
            for (i = 0; i < mid; ++i) {
                l.add((Student) a.get(i));
            }

            for (i = mid; i < a.size(); ++i) {
                r.add((Student) a.get(i));
            }

            this.mergeSort(l);
            this.mergeSort(r);
            this.merge(a, l, r, mid, a.size() - mid);
        }
    }

    public void exOne() {
        this.setArray(4);
        System.out.println("Unsorted array: ");
        this.outArray();

        for (int i = 0; i < this.iDNumber.size(); ++i) {
            Student st = (Student) this.iDNumber.get(i);

            int j;
            for (j = i - 1; j >= 0 && this.compare(st, this.iDNumber.get(j)) < 0; --j) {
                this.iDNumber.set(j + 1, (Student) this.iDNumber.get(j));
            }

            this.iDNumber.set(j + 1, st);
        }

        System.out.println("\nSorted array: ");
        this.outArray();
    }

    public void exTwo() {
        this.setArray(4);
        System.out.println("Unsorted array: ");
        this.outArray();
        this.qSort(this.iDNumber, 0, this.iDNumber.size() - 1);
        System.out.println("\nSorted array: ");
        this.outArray();
    }

    public void exThree() {
        Student[] students1 = new Student[]{new Student("Nik10", "Nik10", "prog", 3, "inbo", 10),
                new Student("Nik9", "Nik9", "prog", 3, "inbo", 9),
                new Student("Nik5", "Nik5", "prog", 3, "inbo", 5),
                new Student("Nik4", "Nik4", "prog", 3, "inbo", 4)};
        Student[] students2 = new Student[]{new Student("Nik3", "Nik3", "prog", 3, "inbo", 3),
                new Student("Nik7", "Nik7", "prog", 3, "inbo", 7),
                new Student("Nik1", "Nik1", "prog", 3, "inbo", 1),
                new Student("Nik2", "Nik2", "prog", 3, "inbo", 2)};
        this.iDNumber = new ArrayList();
        this.iDNumber.addAll(Arrays.asList(students1));
        this.iDNumber.addAll(Arrays.asList(students2));
        this.mergeSort(this.iDNumber);
        System.out.println("Sorted array: ");
        this.outArray();
    }

    public Student find(String surname, String name) throws StudentNotFound {
        Iterator var3 = this.iDNumber.iterator();

        Student student;
        do {
            if (!var3.hasNext()) {
                throw new StudentNotFound(String.format("Student %1$s %2$s not found", surname, name));
            }

            student = (Student) var3.next();
        } while (!student.getSurname().equals(surname) || !student.getName().equals(name));

        return student;
    }
}

