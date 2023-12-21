package ru.mirea.lab20.ex4;

public class Calculator {
    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Double || num1 instanceof Float) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            return (T) Long.valueOf(num1.longValue() + num2.longValue());
        }
    }

    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Double || num1 instanceof Float) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            return (T) Long.valueOf(num1.longValue() * num2.longValue());
        }
    }

    public static <T extends Number> T divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }

        if (num1 instanceof Double || num1 instanceof Float) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            return (T) Long.valueOf(num1.longValue() / num2.longValue());
        }
    }

    public static <T extends Number> T subtraction(T num1, T num2) {
        if (num1 instanceof Double || num1 instanceof Float) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            return (T) Long.valueOf(num1.longValue() - num2.longValue());
        }
    }
}
