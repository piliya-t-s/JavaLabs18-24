package ru.mirea.lab20.ex3;

public interface Animal extends Comparable<Animal> {
    String getName();
    void makeSound();
    int getAge();
}

