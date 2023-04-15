package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getOddIdTest() {
        Student s1 = new Student(3, "John");
        assertEquals(3, s1.getId());
    }
    @Test
    void getEvenIdTest() {
        Student s1 = new Student(6, "John");
        assertEquals(6, s1.getId());
    }
    @Test
    void getIdFromEmptyDefaultObjectTest() {
        Student s1 = new Student();
        assertEquals(0, s1.getId());
    }

    @Test
    void replaceOddIdTest() {
        Student s1 = new Student(1, "John");
        s1.setId(4);
        assertNotEquals(1,s1.getId());
    }
    @Test
    void replaceEvenIdTest() {
        Student s1 = new Student(2, "John");
        s1.setId(5);
        assertNotEquals(2,s1.getId());
    }
    @Test
    void replaceDefaultIdTest() {
        Student s1 = new Student();
        s1.setId(4);
        assertNotEquals(0,s1.getId());
    }

    @Test
    void getDefaultNameTest() {
        Student s1 = new Student();
        assertEquals("",s1.getName());
    }
    @Test
    void getMaleNameTest() {
        Student s1 = new Student(1,"John");
        assertEquals("John",s1.getName());
    }
    @Test
    void getFemaleNameTest() {
        Student s1 = new Student(1,"Jane");
        assertEquals("Jane",s1.getName());
    }

    @Test
    void setFemaleNameTest() {
        Student s1 = new Student(1,"John");
        s1.setName("Jane");
        assertEquals("Jane",s1.getName());
    }
    @Test
    void setMaleNameTest() {
        Student s1 = new Student(1,"Jane");
        s1.setName("John");
        assertEquals("John",s1.getName());
    }
    @Test
    void replaceDefaultNameTest() {
        Student s1 = new Student();
        s1.setName("Jane");
        assertEquals("Jane",s1.getName());
    }
}