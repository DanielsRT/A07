package org.example;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");
        double a = getValue();
        double b = 0;
        System.out.println();
        double result = 0.0;

        switch (chooseOperation()) {
            case 1:
                b = getValue();
                result = add(a,b);
                System.out.printf("%.2f + %.2f = %.2f\n",a,b,result);
                break;
            case 2:
                b = getValue();
                result = subtract(a,b);
                System.out.printf("%.2f - %.2f = %.2f\n",a,b,result);
                break;
            case 3:
                b = getValue();
                result = multiply(a,b);
                System.out.printf("%.2f * %.2f = %.2f\n",a,b,result);
                break;
            case 4:
                b = getValue();
                result = divide(a,b);
                System.out.printf("%.2f / %.2f = %.2f\n",a,b,result);
                break;
        }

    }

    public static double add(double a, double b) {return a + b;}

    public static double divide(double a, double b) {return a / b;}

    private static int chooseOperation() {
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Choose an operation: ");
        return Integer.parseInt(s.nextLine());
    }

    private static double getValue() {
        System.out.print("\nEnter a value: ");
        return Double.parseDouble(s.nextLine());
    }

    public static double multiply(double a, double b) {return a * b;}

    public static double subtract(double a, double b) {return a - b;}
}