package com.bridgelabz.stacksandqueues;

public class Stack <T> {
      //creating Object

    LinkedList linkedList = new LinkedList();

    // pushing the value at first place calling method through object

    public void push(Object data) {
        linkedList.push(data);
    }

    // calling method to display value in linkedList/stack

    public void displayStack() {
        linkedList.show();
    }
}
