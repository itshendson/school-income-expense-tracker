package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher beth = new Teacher("Beth", 12345, 40000);
        Teacher jules = new Teacher("Jules", 52525, 45000);
        Teacher jack = new Teacher("Jack", 84811, 46000);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(beth);
        teachers.add(jules);
        teachers.add(jack);

        Student mitt = new Student("Mitt", 11111);
        Student mel = new Student("Mel", 22222);
        Student matt = new Student("Matt", 33333);
        List<Student> students = new ArrayList<>();
        students.add(mitt);
        students.add(mel);
        students.add(matt);

        School school = new School(students, teachers);

        System.out.println("The school initially get has an income of $" + school.getTotalRevenue());

        mitt.makePayment(5000);
        school.increaseRevenue(5000);

        System.out.println("After Mitt makes a payment, the school's income is $" + school.getTotalRevenue());
    }
}