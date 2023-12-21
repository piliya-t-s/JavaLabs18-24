package ru.mirea.lab23.ex1;

interface Queue {
    void enqueue(Object element); // добавить элемент в очередь
    Object element(); // первый элемент в очереди
    Object dequeue(); // удалить и вернуть первый элемент в очереди
    int size(); // текущий размер очереди
    boolean isEmpty(); // является ли очередь пустой
    void clear(); // удалить все элементы из очереди
}
