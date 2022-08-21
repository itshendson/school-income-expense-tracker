package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentTest {
    Student testStudent = new Student("Dummy", 11111);

    @DisplayName("Test null student name")
    @Test
    void testNullStudentName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student(null, 22222));
        assertEquals("Name cannot be empty.", exception.getMessage());
    }

    @DisplayName("Test empty student name")
    @Test
    void testEmptyStudentName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Student(null, 22222));
        assertEquals("Name cannot be empty.", exception.getMessage());
    }

    @DisplayName("Test payment of 3000 towards tuition owed")
    @Test
    void testValidMakePayment() {
        testStudent.makePayment(3000);
        assertEquals(7000, testStudent.getTuitionOwed());
    }

    @DisplayName("Test payment of 0 towards tuition owed")
    @Test
    void testZeroMakePayment() {
        testStudent.makePayment(0);
        assertEquals(10000.0, testStudent.getTuitionOwed());
    }

    @DisplayName("Test over payment")
    @Test
    void testOverMakePayment() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                testStudent.makePayment(15_000));
        assertEquals("Payment cannot exceed tuition owed.", exception.getMessage());
    }

    @DisplayName("Test negative payment towards tuition owed")
    @Test
    void testInvalidMakePayment() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                testStudent.makePayment(-1000));
        assertEquals("Payment amount cannot be negative.", exception.getMessage());
    }


}