package org.example;


import org.joda.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student s1 = new Student();

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
    }
}