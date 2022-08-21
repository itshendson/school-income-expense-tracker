package org.example;

/**
 * This class is responsible for tracking students including
 * name, student ID, and the amount of tuition the student owes the school.
 */
public class Student {
    private final String name;
    private final int studentId;
    private double tuitionOwed;

    /**
     * To create a new Student object by initializing value
     * Student tuition is $10,000 per year
     * @param name name of the student.
     * @param studentId unique ID for student. TODO: Implement unique ID.
     */
    public Student(String name, int studentId) {
        if (name == null || name.length() < 1) throw new IllegalArgumentException("Name cannot be empty.");
        this.name = name;
        this.studentId = studentId;
        this.tuitionOwed = 10_000;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getTuitionOwed() {
        return tuitionOwed;
    }

    /**
     * Student makes payment to their tuition owed.
     * School will receive the amount.
     * @param paymentAmount the amount the student pays.
     */
    public void makePayment(double paymentAmount) {
        if (paymentAmount < 0) throw new IllegalArgumentException("Payment amount cannot be negative.");
        if (paymentAmount > tuitionOwed) throw new IllegalArgumentException("Payment cannot exceed tuition owed.");
        tuitionOwed -= paymentAmount;
    }
}
