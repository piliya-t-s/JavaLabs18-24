package ru.mirea.lab23.ex1;

import java.util.Arrays;

class ArrayQueueModule implements Queue {
    private static Object[] array = new Object[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public void enqueue(Object element) {
        ensureCapacity();
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public Object element() {
        assert size > 0 : "Queue is clear";
        return array[head];
    }

    public Object dequeue() {
        assert size > 0 : "Queue is clear";
        Object removedElement = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return removedElement;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        Arrays.fill(array, null);
        size = 0;
        head = 0;
        tail = 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, head, newArray, 0, array.length - head);
            System.arraycopy(array, 0, newArray, array.length - head, head);
            array = newArray;
            head = 0;
            tail = size;
        }
    }
}



