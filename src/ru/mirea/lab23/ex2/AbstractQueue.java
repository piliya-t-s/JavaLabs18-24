package ru.mirea.lab23.ex2;

public abstract class AbstractQueue<E> implements Queue<E> {
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}

