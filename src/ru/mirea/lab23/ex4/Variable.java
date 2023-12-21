package ru.mirea.lab23.ex4;

class Variable extends Expression {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int evaluate(int x) {
        return x;
    }
}
