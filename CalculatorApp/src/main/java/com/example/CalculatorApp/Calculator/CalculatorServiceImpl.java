package com.example.CalculatorApp.Calculator;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double divide(double d1, double d2) {
        if (d2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return d1 / d2;
    }
}
