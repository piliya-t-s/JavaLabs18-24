package ru.mirea.lab22.ex1;

import java.util.Stack;

public class RPNCalculator {
    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static double RPNeval(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double res = operation(token, operand1, operand2);
                stack.push(res);
            }
        }

        return stack.pop();
    }

    private static double operation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String[] expression = {"2", "9", "+", "8", "*"};

        double result = RPNeval(expression);

        System.out.println("Результат: " + result);
    }
}

