package ua.edu.ucu.collections.immutable;

/**
 * Created by matt on 11/3/16.
 */
public class MainArrayList {


    public static void main(String args[]) {
        ImmutableArrayList a = new ImmutableArrayList();
        System.out.println(a);
        a.add(1);
        a = (ImmutableArrayList) a.add(1);
        a = (ImmutableArrayList) a.add(2);
        a = (ImmutableArrayList) a.add(3);
        System.out.println(a);
        a = (ImmutableArrayList) a.set(9, "HELLO");
        System.out.println(a);
        a = (ImmutableArrayList) a.add(5);
        System.out.println(a);
        a = (ImmutableArrayList) a.remove(0);
        System.out.println(a);


    }
}
