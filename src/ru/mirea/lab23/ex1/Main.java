package ru.mirea.lab23.ex1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule queueModule = new ArrayQueueModule();
        testQueue(queueModule);

        ArrayQueueADT queueADT = new ArrayQueueADT();
        testQueue(queueADT);

        ArrayQueue queue = new ArrayQueue();
        testQueue(queue);
    }

    private static void testQueue(Queue queue) {
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i * 10);
        }

        System.out.println("Элемент в начале очереди: " + queue.element());

        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Очередь - пустая? " + queue.isEmpty());

        System.out.println("Вывод из очереди:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        System.out.println("Размер очереди после вывода: " + queue.size());

        System.out.println("Пустая ли очередь после вывода? " + queue.isEmpty());

        queue.clear();
        System.out.println("Очередь очищена.");

        System.out.println("Размер очереди после очистки: " + queue.size());

        System.out.println("Пустая ли очередь после очистки? " + queue.isEmpty());
    }
}
