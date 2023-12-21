package ru.mirea.lab20.ex1;

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

    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    public void setSecondParameter(V secondParameter) {
        this.secondParameter = secondParameter;
    }

    public void setThirdParameter(K thirdParameter) {
        this.thirdParameter = thirdParameter;
    }

    public void displayParameters() {
        System.out.println("First Parameter: " + firstParameter);
        System.out.println("Second Parameter: " + secondParameter);
        System.out.println("Third Parameter: " + thirdParameter);
    }

    public static void main(String[] args) {
        GenericClass<String, Integer, Double> example = new GenericClass<>("Hello World", 0, 18.14);
        example.displayParameters();
    }
}

