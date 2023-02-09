package com.bridgelabz.stacksandqueues;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Queue programme");
        Queue myQueue = new Queue();
        System.out.println("Add data to create Queue");
        myQueue.append(56);
        myQueue.append(30);
        myQueue.append(70);
        System.out.println("show data according fifo rule Queue");
        myQueue.displayQueue();
        System.out.println("Peak in a Queue");
        myQueue.peek();
        System.out.println("Pop the Elements in Queue");
        myQueue.emptyQueue();
    }
}
