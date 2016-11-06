package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    ImmutableLinkedList myList;
    public Stack() {
        myList = new ImmutableLinkedList();
    }
    public Object peek(){
        return  myList.getFirst();
    }
    public Object pop() {
        Object first = myList.getFirst();
        myList = (ImmutableLinkedList) myList.remove(0);
        return first;
    }
    public void add(Object e) {
        myList = (ImmutableLinkedList) myList.addFirst(e);
    }


}
