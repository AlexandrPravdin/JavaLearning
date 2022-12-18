package ru.mirea.zad23.queue;

import ru.mirea.zad23.queue.queueArray.ArrayQueue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(4);
        arrayQueue.enqueue("four");
        arrayQueue.enqueue('5');
        System.out.println("Queue before deleting" + Arrays.toString(arrayQueue.getElements()));
        System.out.println("Deleted element: " + arrayQueue.dequeue());
        System.out.println("Queue after deleting" + Arrays.toString(arrayQueue.getElements()));

        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue('5');
        linkedQueue.enqueue(5);
        linkedQueue.enqueue("five");
        System.out.println("Queue before deleting" + Arrays.toString(linkedQueue.getElements()));
        System.out.println("Deleted element: " + linkedQueue.dequeue());
        System.out.println("Queue after deleting" + Arrays.toString(linkedQueue.getElements()));
    }
}
