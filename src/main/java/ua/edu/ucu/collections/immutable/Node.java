package ua.edu.ucu.collections.immutable;

/**
 * Created by matt on 10/31/16.
 */
public class Node implements Cloneable {
    Node next;          // reference to the next node in the chain, or null if there isn't one.
    Object data;


    public Node(Object data) {
        next = null;
        this.data = data;
    }

    // another Node constructor if we want to
    // specify the node to point to.
    public Node(Object data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Node clone() {
        return new Node(this.data);
    }
    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
