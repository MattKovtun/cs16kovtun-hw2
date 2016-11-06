package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    @Test
    public void add() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.add(3);
        assertEquals(a.toString(), "[1, 2, 3, null, null, null, null, null, null, null]");
    }

    @Test
    public void add1() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.add(5, 3);
        assertEquals(a.toString(), "[1, 2, null, null, null, 3, null, null, null, null]");

    }

    @Test
    public void addAll() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        Integer[] n = new Integer[]{1, 2};
        a = (ImmutableArrayList) a.addAll(n);
        assertEquals(a.toString(), "[1, 2, 1, 2, null, null, null, null, null, null]");

    }

    @Test
    public void addAll1() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        Integer[] n = new Integer[]{1, 2};
        a = (ImmutableArrayList) a.addAll(4, n);
        assertEquals(a.toString(), "[1, 2, null, null, 1, 2, null, null, null, null]");

    }

    @Test
    public void get() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        assertEquals(a.get(1), 2);

    }

    @Test
    public void remove() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.remove(0);
        assertEquals(a.toString(), "[null, 2, null, null, null, null, null, null, null, null]");

    }

    @Test
    public void set() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.set(0, 5);
        assertEquals(a.toString(), "[5, 2, null, null, null, null, null, null, null, null]");

    }

    @Test
    public void indexOf() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        assertEquals(a.indexOf(1), 0);

    }

    @Test
    public void size() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        assertEquals(a.size(), 2);

    }

    @Test
    public void clear() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.clear();
        assertEquals(a.toString(), "[null, null, null, null, null, null, null, null, null, null]");

    }

    @Test
    public void isEmpty() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        assertEquals(a.isEmpty(), false);
        a = (ImmutableArrayList) a.clear();
        assertEquals(a.isEmpty(), true);

    }

    @Test
    public void toArray() throws Exception {
        ImmutableArrayList a = new ImmutableArrayList();
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.clear();
        assertEquals(Arrays.toString(a.toArray()), "[null, null, null, null, null, null, null, null, null, null]");



    }
}
