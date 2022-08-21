package org.example;

public abstract class Person {
    private final String name;
    private final int id;

    public Person(String name, int id) {
        if (name == null || name.length() < 1) throw new IllegalArgumentException("Name cannot be empty.");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
