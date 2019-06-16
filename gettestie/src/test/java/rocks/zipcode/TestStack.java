package rocks.zipcode;

import static org.junit.Assert.*;


import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void TestStack2(){
        Stack<String> stack = new Stack<>();
        stack.push("Hi");
        stack.push("Stefun");

        assertEquals("Stefun", stack.peek());
    }

    @org.junit.Test
    public void TestStack3(){
        Stack<String> stack = new Stack<>();
        stack.push("Hi");



        assertEquals( 1, stack.search("Hi"));
    }


    // Make a bigger test exercising more Stack methods.....
}
