package ru.mirea.lab23.ex3;

class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
