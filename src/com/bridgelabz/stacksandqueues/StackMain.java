package com.bridgelabz.stacksandqueues;

public class StackMain <T> {
    public static void main(String[] args) {
        System.out.println("Welcome to stack programme");
        Stack crateStack = new Stack();
        System.out.println("Add data to create stack");
        crateStack.push(70);
        crateStack.push(30);
        crateStack.push(56);
        System.out.println("show data according lifo rule stack");
        crateStack.displayStack();
        System.out.println("Peak in a Stack");
        crateStack.peek();
        System.out.println("Pop the Elements in stack");
        crateStack.emptyStack();
    }
}

