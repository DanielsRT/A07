package org.example;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static String[] EMPLOYEES = {"1:John", "2:Ted", "3:Maryl", "4:Tony", "5:Alice", "6:Tom", "7:Mary", "8:Darryl", "9:Sue"};
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Lookup Application!");
        BiMap<Integer, String> employeeMap = convertArrayToBiMap(EMPLOYEES);
        int searchType = 0;

        while(searchType != 3) {
            searchType = getSearchType();
            if (searchType == 1) {
                searchByName(getTargetName(employeeMap), employeeMap);
            } else if (searchType == 2) {
                searchByID(getTargetId(employeeMap), employeeMap);
            }
        }

        System.out.println("\nGoodbye!");
    }

    public static BiMap<Integer, String> convertArrayToBiMap(String[] employees) {
        if (employees.length == 0)
            return null;
        BiMap<Integer, String> employeeMap = HashBiMap.create();
        for (String item : employees) {
            String[] parts = item.split(":");
            if (parts.length == 2) {
                employeeMap.put(Integer.parseInt(parts[0]), parts[1].toUpperCase());
            }
        }
        return employeeMap;
    }

    private static int getSearchType() {
        int type = -1;

        while(type < 0) {
            System.out.println("\n1) Search By Employee Name");
            System.out.println("2) Search By Employee ID");
            System.out.println("3) Cancel");
            System.out.print("Enter a Search Type: ");
            type = Integer.parseInt(s.nextLine());
            if (type < 1 || type > 3) {
                System.out.println("Invalid choice, try again");
                type = -1;
            }
        }

        return type;
    }

    private static Integer getTargetId(BiMap<Integer, String> employeeMap) {
        System.out.print("\nEnter an ID: ");
        return Integer.parseInt(s.nextLine());
    }

    private static String getTargetName(BiMap<Integer, String> employeeMap) {
        System.out.print("\nEnter a Name: ");
        return s.nextLine().toUpperCase();
    }

    public static void searchByName(String target, BiMap<Integer, String> employeeMap) {
        Integer results = employeeMap.inverse().get(target);

        if (results == null)
            System.out.println("Employee not found");
        else
            System.out.println("Employee's ID: " + results);
    }

    public static void searchByID(Integer target, BiMap<Integer, String> employeeMap) {
        String results = employeeMap.get(target);

        if (results == null)
            System.out.println("Employee not found");
        else
            System.out.println("Employee's Name: " + results);
    }
}