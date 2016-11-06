package ua.edu.ucu.collections.immutable;

public class ImmutableLinkedList implements ImmutableList{
    protected Node head;
    protected int listLength;
    protected ImmutableLinkedList myNewList;
    protected Node finCurr;
    protected int curPos;
    protected Node current;

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
    }    // addLast


    public ImmutableList addFirst(Object e) {
        return add(0, e);
    }


    public void preprocessing(int index) {
        checkIndex(index);
        myNewList = new ImmutableLinkedList();
        curPos = 0;
        current = head;
        finCurr = myNewList.head;

        while (curPos != index && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }

    }

    public void postprocessing() {
        while (curPos != listLength && current.getNext() != null) {
            Node t = current.getNext();
            Node finT = new Node(t.getData(), t.getNext());
            current = t;
            finCurr.setNext(finT);
            finCurr = finCurr.getNext();
            curPos++;
        }
    }


    @Override
    public ImmutableList add(int index, Object e) {
        preprocessing(index);
        Node tmp = new Node(e);
        tmp.setNext(finCurr.getNext());
        finCurr.setNext(tmp);
        finCurr = finCurr.getNext();
        postprocessing();
        listLength++;
        myNewList.listLength = listLength;
        return myNewList;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        preprocessing(index);
        for (int i = 0; i < c.length; ++i) {
            Node e = new Node(c[i]);
            finCurr.setNext(e);
            finCurr = finCurr.getNext();
        }
        postprocessing();

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
        preprocessing(index + 1);
        return current;
    }

    public Object getLast() {
        return get(listLength);
    }


    public Object getFirst() {
        return get(0);
    }


    @Override
    public ImmutableList remove(int index) {
        preprocessing(index);
        current = current.getNext();
        postprocessing();
        myNewList.listLength = listLength - 1;
        return myNewList;
    }


    public ImmutableList removeFirst() {
        return remove(0);
    }


    public ImmutableList removeLast() {
        return remove(listLength);
    }


    @Override
    public ImmutableList set(int index, Object e) {
        preprocessing(index + 1);
        Node tmp = new Node(e);
        finCurr.setData(tmp.getData());
        postprocessing();
        myNewList.listLength = listLength;
        return myNewList;
    }

    @Override
    public int indexOf(Object e) {
        current = head;
        int pos = 0;
        Node tmp = new Node(e);
        while (current.getNext() != null) {
            if (current.getData() == tmp.getData()) {
                return pos - 1;
            }
            pos++;
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public int size() {
        return listLength;
    }

    @Override
    public ImmutableList clear() {
        myNewList = new ImmutableLinkedList();
        return myNewList;
    }

    @Override
    public boolean isEmpty() {
        if (listLength == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] n = new Object[listLength];
        int i = 0;
        current = head;
        while (current.getNext() != null) {
            current = current.getNext();
            n[i] = current.getData();
            ++i;
        }
        return n;
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
