package ru.mirea.lab20.ex2;

public class GenericClass<T, V, K> {
    public GenericClass(T first, V second, K third) {
        this.firstParameter = first;
        this.secondParameter = second;
        this.thirdParameter = third;
    }

    private T firstParameter;
    private V secondParameter;
    private K thirdParameter;

    public T getFirstParameter() {
        return firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public K getThirdParameter() {
        return thirdParameter;
    }

    public void displayParameters() {
        System.out.println("First Parameter: " + firstParameter);
        System.out.println("Second Parameter: " + secondParameter);
        System.out.println("Third Parameter: " + thirdParameter);
    }

    public void displayClassNames() {
        System.out.println("Class name for first parameter: " + firstParameter.getClass().getName());
        System.out.println("Class name for second parameter: " + secondParameter.getClass().getName());
        System.out.println("Class name for third parameter: " + thirdParameter.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClass<String, Integer, Double> example = new GenericClass<>("Hello World", 0, 18.14);
        example.displayParameters();
        example.displayClassNames();
    }
}

