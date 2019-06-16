package rocks.zipcode;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @org.junit.Test
    public void TestLinkedList1() {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        newLinkedList.add(734);
        newLinkedList.add(3677);
        newLinkedList.addFirst(302);
        assertEquals("[302, 734, 3677]", newLinkedList.toString());
    }

    @org.junit.Test
    public void TestLinkedList2(){
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        newLinkedList.add(501);
        newLinkedList.add(13);

        assertEquals(-1, newLinkedList.indexOf(37));
    }


}
