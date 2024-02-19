package calculator1;

import java.util.Scanner;

public class calculator1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = 100;

        System.out.print("Enter the second number: ");
        double num2 = 200;
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));

        scanner.close();
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}
