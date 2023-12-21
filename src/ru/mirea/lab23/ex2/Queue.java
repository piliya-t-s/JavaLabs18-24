package ru.mirea.lab23.ex2;

public interface Queue<E> {
    void enqueue(E element);
    int size();
    boolean isEmpty();
    E dequeue();
    E peek();
}

