package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    @Test
    public void addFirst() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        myList = (ImmutableLinkedList) myList.addFirst("---1---");
        myList = (ImmutableLinkedList) myList.addFirst("---2---");
        myList = (ImmutableLinkedList) myList.addFirst("---3---");
        assertEquals(myList.toString(), "---3--- ---2--- ---1--- ");

    }


    @Test
    public void add() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        myList = (ImmutableLinkedList) myList.add("---1---");
        myList = (ImmutableLinkedList) myList.add(0, "---2---");
        myList = (ImmutableLinkedList) myList.add(0, "---3---");
        assertEquals(myList.toString(), "---3--- ---2--- ---1--- ");

    }



    @Test
    public void addAll() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        assertEquals(myList.toString(), "5 6 7 ");

    }

    @Test
    public void addAll1() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        myList = (ImmutableLinkedList) myList.addFirst("---3---");
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(0, testArr);
        assertEquals(myList.toString(), "5 6 7 ---3--- ");

    }

    @Test
    public void get() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        assertEquals(((Node)myList.get(0)).getData(), 5);

    }

    @Test
    public void remove() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        myList = (ImmutableLinkedList) myList.remove(0);
        assertEquals(myList.toString(), "6 7 ");

    }

    @Test
    public void set() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        myList = (ImmutableLinkedList) myList.set(0, "!@#");
        assertEquals(myList.toString(), "!@# 6 7 ");

    }

    @Test
    public void indexOf() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        assertEquals(myList.indexOf(5), 0);

    }

    @Test
    public void size() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        assertEquals(myList.size(), 3);


    }

    @Test
    public void clear() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        myList = (ImmutableLinkedList) myList.clear();
        assertEquals(myList.toString(), "");

    }

    @Test
    public void isEmpty() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        assertEquals(myList.isEmpty(), false);

    }

    @Test
    public void toArray() throws Exception {
        ImmutableLinkedList myList = new ImmutableLinkedList();
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = (ImmutableLinkedList) myList.addAll(testArr);
        Object[] n = myList.toArray();
        assertEquals(Arrays.toString(n), "[5, 6, 7]");

    }



}
