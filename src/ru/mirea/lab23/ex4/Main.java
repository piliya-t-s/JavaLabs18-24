package ru.mirea.lab23.ex4;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <expression>");
            return;
        }

        String inputExpression = args[0];
        ExpressionParser parser = new ExpressionParser(inputExpression);
        Expression expression = parser.parse();

        if (expression != null) {
            System.out.println(" x\tf");
            for (int x = 0; x <= 10; x++) {
                try {
                    int result = expression.evaluate(x);
                    System.out.println(" " + x + "\t" + result);
                } catch (ArithmeticException e) {
                    System.out.println(" " + x + "\t" + e.getMessage());
                }
            }
        }
    }
}
