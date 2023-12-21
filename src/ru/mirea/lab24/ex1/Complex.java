package ru.mirea.lab24.ex1;

public class Complex {
    private int real;
    private int imag;

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }
}
