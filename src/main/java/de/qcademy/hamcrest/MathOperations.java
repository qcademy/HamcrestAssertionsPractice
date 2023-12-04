package de.qcademy.hamcrest;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed!");
        }
        return (double) a / b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
