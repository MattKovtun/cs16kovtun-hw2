package ua.edu.ucu.collections.immutable;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by matt on 10/31/16.
 */
public class Main {


    public static void main(String args[]) {

//        Node q0 = new Node(null);
//        Node q = new Node("--->");
//        Node t1 = q;
//        Node t2 = q;
//        t1.setData("@!#!@#");
//        System.out.println(t2.getData());
//        Node q1 = new Node("<---");
////        q0.setNext(q);
//        q.setNext(q1);
//     //   System.out.println(q.getNext());
//        //System.out.println(q1.getData());
//        Node testq = new Node(q.getData());
//        testq.setNext(q1);
//
//        System.out.println(q.getData());
//        System.out.println(testq.getData());
//
//

        ImmutableList myList = new ImmutableLinkedList();
        myList = myList.add("---1---");
        myList = myList.add(0, "---2---");
        System.out.println(myList);
        myList = myList.add(0, "---3---");
        System.out.println(myList);
        myList = myList.add(2, "---4---");
        myList.add(2, "---5---");
        System.out.println(myList);
        Integer[] testArr = new Integer[]{5, 6, 7};
        myList = myList.addAll(testArr);
        System.out.println(myList);
        System.out.println(((Node) myList.get(3)).getData());
        myList = myList.remove(3);
        System.out.println(myList);
       // System.out.println(myList.size());
        myList = myList.set(2, "___000___");
        System.out.println(myList);
        Object[] n = myList.toArray();


        ImmutableLinkedList List = new ImmutableLinkedList();
        testArr = new Integer[]{5, 6, 7};
        List = (ImmutableLinkedList) List.addAll(testArr);
        System.out.println(List.size());
        Object[] q = List.toArray();
        System.out.println(Arrays.toString(q));
        //System.out.println(myList.indexOf(6));
        //int[] a = new int[]{1,2,3};
       // int[] b = new int[5];
     //   System.arraycopy(a, 0, b, 0, 3);
   //     System.out.println(Arrays.toString(b));
    }
}
