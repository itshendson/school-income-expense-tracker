package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school;

    @BeforeEach
    void beforeEach() {
        Teacher beth = new Teacher("Beth", 12345, 40000);
        Student mitt = new Student("Mitt", 11111);

        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        teachers.add(beth);
        students.add(mitt);

        school = new School(students, teachers);
    }

    @DisplayName("Disabled test ")
    @Disabled
    @Test
    void soutStudent() {
        school.getStudents().forEach(student ->
                System.out.println(student.getName() + ", " + student.getStudentId() + ", " + student.getTuitionOwed()));
    }

    @DisplayName("Increase school's total revenue by 2000 three times")
    @Test
    void increaseRevenue() {
        school.increaseRevenue(2000);
        school.increaseRevenue(2000);
        school.increaseRevenue(2000);
        assertEquals(6000, school.getTotalRevenue());
    }

    @DisplayName("Increase school's total expense by 1000 three times")
    @Test
    void increaseExpense() {
        school.increaseExpense(1000);
        school.increaseExpense(1000);
        school.increaseExpense(1000);
        assertEquals(3000, school.getTotalExpense());
    }

    @DisplayName("Increase revenue, decrease revenue, then get net revenue.")
    @Test
    void netRevenue() {
        school.increaseRevenue(40000);
        school.increaseExpense(10000);
        assertEquals(30_000, school.getNetRevenue());
    }
}