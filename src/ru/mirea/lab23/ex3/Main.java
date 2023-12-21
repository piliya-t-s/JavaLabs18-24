package ru.mirea.lab23.ex3;

public class Main {
    public static void main(String[] args) {
        // Пример использования выражения: (2 * x) - 3, где x = 5
        Expression expression = new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3));
        int result = expression.evaluate(5);

        System.out.println("Результат выражения при x = 5: " + result);
    }
}
