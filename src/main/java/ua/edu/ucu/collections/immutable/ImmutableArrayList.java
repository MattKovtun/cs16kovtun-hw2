package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class ImmutableArrayList implements ImmutableList{
        public Object[] myList;
        public int size;

    public ImmutableArrayList() {
        myList = new Object[10];
        size = 0;
    }

    public void checkIndex(int index) {
        if (index > myList.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void resize() {
        if (myList[myList.length - 1] != null) {
        Object[] lst = new Object[myList.length + 10];
        System.arraycopy(myList, 0, lst, 0, myList.length);
        myList = lst;}

    }
    @Override
    public ImmutableList add(Object e) {
        return add(size, e);
    }
    @Override
    public ImmutableList add(int index, Object e) {
        resize();
        checkIndex(index);
        ImmutableArrayList myNewList = new ImmutableArrayList();
        myNewList.myList = new Object[myList.length];
        System.arraycopy(myList, 0, myNewList.myList, 0, myList.length);
        myNewList.size = size;
        myNewList.myList[index] = e;
        myNewList.size++;
        return myNewList;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(size, c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        resize();
        checkIndex(index);
        ImmutableArrayList myNewList = new ImmutableArrayList();
        myNewList.myList = new Object[myList.length];
        System.arraycopy(myList, 0, myNewList.myList, 0, myList.length);
        myNewList.size = size;
        for (int i = 0; i < c.length; ++i) {
            myNewList.myList[index] = c[i];
            index++;
            myNewList.size++;
        }

        return myNewList;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return myList[index];
    }

    @Override
    public ImmutableList remove(int index) {
        checkIndex(index);
        ImmutableArrayList myNewList = new ImmutableArrayList();
        myNewList.myList = new Object[myList.length];
        System.arraycopy(myList, 0, myNewList.myList, 0, myList.length);
        myNewList.size = size;
        myNewList.myList[index] = null;
        myNewList.size--;
        return myNewList;
    }


    @Override
    public ImmutableList set(int index, Object e) {
        checkIndex(index);
        ImmutableArrayList myNewList = new ImmutableArrayList();
        System.arraycopy(myList, 0, myNewList.myList, 0, myList.length);
        myNewList.size = size;
        myNewList.myList[index] = e;
        return myNewList;
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < myList.length; ++i ) {
            if (myList[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < myList.length; ++ i) {
            if (myList[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray() {

        return myList;
    }

    public String toString() {
        return Arrays.toString(myList);
    }
}
