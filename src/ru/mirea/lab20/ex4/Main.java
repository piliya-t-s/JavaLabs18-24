package ru.mirea.lab20.ex4;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {13, 1, 5, 0, 3};

        MinMax<Integer> minMaxInt = new MinMax<>(intArray);
        System.out.println("Min: " + minMaxInt.findMin());
        System.out.println("Max: " + minMaxInt.findMax());


        Double[] doubleArray = {14.13, 1.7, 3.8, 33.16, 5.0};

        MinMax<Double> minMaxDouble = new MinMax<>(doubleArray);
        System.out.println("Min: " + minMaxDouble.findMin());
        System.out.println("Max: " + minMaxDouble.findMax());

        System.out.println("Sum: " + Calculator.sum(3, 9.27));
        System.out.println("Multiply: " + Calculator.multiply(0, 5.13));
        System.out.println("Divide: " + Calculator.divide(7, 2.1));
        System.out.println("Subtraction: " + Calculator.subtraction(10, 6.2));
    }
}

