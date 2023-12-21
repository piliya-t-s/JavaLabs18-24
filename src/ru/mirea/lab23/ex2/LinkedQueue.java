package ru.mirea.lab23.ex2;

public class LinkedQueue<E> extends AbstractQueue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E element) {
            this.data = element;
            this.next = null;
        }
    }

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is clear");
        }
        E removedElement = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return removedElement;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is clear");
        }
        return front.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

