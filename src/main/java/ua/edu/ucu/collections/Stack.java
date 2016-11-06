package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.Node;

public class Stack {
    ImmutableLinkedList myList;

    public Stack() {
        myList = new ImmutableLinkedList();
    }

    public Object peek() {
        return ((Node) myList.getFirst()).getData();
    }

    public Object pop() {
        Object first = myList.getFirst();
        myList = (ImmutableLinkedList) myList.remove(0);
        return first;
    }

    public void add(Object e) {
        myList = (ImmutableLinkedList) myList.addFirst(e);
    }

    public String toString(){
        return myList.toString();
    }

}
