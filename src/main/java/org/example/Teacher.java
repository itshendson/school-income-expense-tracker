package org.example;

public class Teacher {
    private final String name;
    private final int teacherID;
    private int salary;

    public Teacher(String name, int teacherID, int salary) {
        this.name = name;
        this.teacherID = teacherID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
