package ru.mirea.lab23.ex3;

class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}
