package ru.mirea.lab20.ex3;

import java.io.Serializable;

class AnimalClass implements Animal, Serializable {
    @Override
    public int compareTo(Animal other) {
        return 0;
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public void makeSound() {

    }
    @Override
    public int getAge() {
        return 0;
    }
}
