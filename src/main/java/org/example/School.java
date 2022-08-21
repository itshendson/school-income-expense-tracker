package org.example;

import java.util.List;

/**
 * School can have multiple teachers and students.
 */
public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private double totalRevenue;
    private double totalExpense;

    /**
     * New school object.
     * @param students list of students in the school.
     * @param teachers list of teachers in the school.
     */
    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        this.totalRevenue = 0;
        this.totalExpense = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }


    public void increaseRevenue(double income) {
        totalRevenue += income;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void increaseExpense(double expense) {
        totalExpense += expense;
    }

    /**
     * Calculates the difference between total revenue and total expense.
     * @return the difference between total revenue and total expense. Negative numbers allowed.
     */
    public double getNetRevenue() {
        return totalRevenue - totalExpense;
    }
}
