package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    @Test
    public void checkIndex() throws Exception {

    }

    @Test
    public void add() throws Exception {
        ImmutableList myList = new ImmutableLinkedList();
        myList = myList.add("---1---");
        myList = myList.add(0, "---2---");
        myList = myList.add(0, "---3---");
        assertEquals(myList.toString(), "---3--- ---2--- ---1--- ");

    }

    @Test
    public void addToTheStart() throws Exception {

    }

    @Test
    public void add1() throws Exception {

    }

    @Test
    public void addAll() throws Exception {

    }

    @Test
    public void addAll1() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void set() throws Exception {

    }

    @Test
    public void indexOf() throws Exception {

    }

    @Test
    public void size() throws Exception {

    }

    @Test
    public void clear() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {

    }

    @Test
    public void toArray() throws Exception {

    }


    @Test
    public void testSomeMethod() {
    }
    
}
