package org.example;

/**
 * This class is responsible for tracking students including
 * name, student ID, and the amount of tuition the student owes the school.
 */
public class Student extends Person{
    private double tuitionOwed;

    /**
     * To create a new Student object by initializing value
     * Student tuition is $10,000 per year
     * @param name name of the student.
     * @param id unique ID for student. TODO: Implement unique ID.
     */
    public Student(String name, int id) {
        super(name, id);
        this.tuitionOwed = 10_000;
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
