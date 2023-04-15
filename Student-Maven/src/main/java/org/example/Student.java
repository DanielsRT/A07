package org.example;

public class Student {
    int id;

    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
        id = 0;
        name = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}