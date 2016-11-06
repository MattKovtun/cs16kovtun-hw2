package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void peek() throws Exception {
        Stack myStack = new Stack();
        myStack.add(1);
        myStack.add(2);
        assertEquals(myStack.peek(),2);



    }

    @Test
    public void pop() throws Exception {       Stack myStack = new Stack();
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.pop();
        assertEquals(myStack.toString(),"2 1 ");


    }

    @Test
    public void add() throws Exception {
        Stack myStack = new Stack();
        myStack.add(1);
        myStack.add(2);
        myStack.add(3);
        myStack.add(4);
        assertEquals(myStack.toString(),"4 3 2 1 ");

    }

    
}
