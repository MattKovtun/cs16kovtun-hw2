package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;



public class Queue {
    ImmutableLinkedList myList;

    public Queue() {
        myList = new ImmutableLinkedList();
    }
    public Object peek(){
        return  myList.getFirst();
    }
    public Object dequeue() {
        Object first = myList.getFirst();
        myList = (ImmutableLinkedList) myList.remove(0);
        return first;
    }
    public void enqueue(Object e) {
        myList = (ImmutableLinkedList) myList.add(e);
    }

}
