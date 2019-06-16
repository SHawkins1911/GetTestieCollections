package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Collection;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayDequeTest {

    @org.junit.Test
    public void TestArrayDeque1() {
       ArrayDeque<String> newArrDeque = new ArrayDeque<>();
        newArrDeque.add("Zip Code Rocks");
        assertTrue(newArrDeque.contains("Zip Code Rocks"));
    }

    @org.junit.Test
    public void TestArrayDeque2(){
        Collection<String> newArrDeque = new ArrayDeque<>();
        newArrDeque.add("Hi");
        newArrDeque.add("Stefun");

        assertEquals("Stefun", ((ArrayDeque<String>) newArrDeque).peekLast());
    }
}
