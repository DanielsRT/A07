package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final PrintStream standardOut = System.out;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
    @Test
    void nameFoundTest() {
        BiMap<Integer, String> employees = HashBiMap.create();
        employees.put(1,"JOHN");
        Main.searchByName("JOHN", employees);
        assertEquals("Employee's ID: 1", outputStreamCaptor.toString().trim());
    }
    @Test
    void nameNotFoundTest() {
        BiMap<Integer, String> employees = HashBiMap.create();
        employees.put(1,"JOHN");
        Main.searchByName("TED", employees);
        assertEquals("Employee not found", outputStreamCaptor.toString().trim());
    }

    @Test
    void idFoundTest() {
        BiMap<Integer, String> employees = HashBiMap.create();
        employees.put(1,"JOHN");
        Main.searchByID(1, employees);
        assertEquals("Employee's Name: JOHN", outputStreamCaptor.toString().trim());
    }
    @Test
    void idNotFoundTest() {
        BiMap<Integer, String> employees = HashBiMap.create();
        employees.put(1,"JOHN");
        Main.searchByID(2, employees);
        assertEquals("Employee not found", outputStreamCaptor.toString().trim());
    }

    @Test
    void convertAllValidInputTest() {
        String[] input = {"1:John", "2:Jane"};
        BiMap<Integer, String> employees = Main.convertArrayToBiMap(input);
        assertEquals(2, employees.size());
    }

    @Test
    void oneInvalidInputTest() {
        String[] input = {"Ted", "2:Jane"};
        BiMap<Integer, String> employees = Main.convertArrayToBiMap(input);
        assertEquals(1, employees.size());
    }
}