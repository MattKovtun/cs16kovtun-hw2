package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList {
    protected Node head;
    protected int listLength;

    public ImmutableLinkedList() {
        head = new Node(null);
        listLength = 0;
    }

    public void checkIndex(int index) {
        if (index > listLength) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public ImmutableList add(Object e) {
        return add(listLength, e);
    }


    public ImmutableList addToTheStart(Object e) {
        return add(0, e);
    }



    @Override
    public ImmutableList add(int index, Object e) {
        checkIndex(index);
        ImmutableLinkedList myNewList = new ImmutableLinkedList();

        Node tmp = new Node(e);
        int curPos = 0;
        Node current = head;
        Node finCurr = myNewList.head;

        while (curPos != index && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }
        tmp.setNext(finCurr.getNext());
        finCurr.setNext(tmp);
        finCurr = finCurr.getNext();

        while (curPos != listLength && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }
        listLength++;

        myNewList.listLength = listLength;
        return myNewList;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        checkIndex(index);
        ImmutableLinkedList myNewList = new ImmutableLinkedList();
        int curPos = 0;
        Node current = head;
        Node finCurr = myNewList.head;
        while (curPos != index && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos ++;
        }
        for (int i = 0; i < c.length; ++ i ) {
            Node e = new Node(c[i]);
            finCurr.setNext(e);
            finCurr = finCurr.getNext();
        }
        while (curPos != listLength && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }

        myNewList.listLength = listLength;
        myNewList.listLength += c.length;

        return myNewList;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(listLength, c);
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        Node current = head;
        int curPos = 0;
        while (curPos != index + 1) {
            current = current.getNext();
            curPos ++;
        }
        return current;
    }

    @Override
    public ImmutableList remove(int index) {
        checkIndex(index);
        ImmutableLinkedList myNewList = new ImmutableLinkedList();

        int curPos = 0;
        Node current = head;
        Node finCurr = myNewList.head;

        while (curPos != index && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }
        current = current.getNext();

        while (curPos != listLength && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }
        return myNewList;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ImmutableList clear() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String toString() {
        Node current = head;
        String s = "";
        while (current.getNext() != null) {
            current = current.getNext();
            s += current.data;
            s += ' ';
        }
        return s;
    }
}
