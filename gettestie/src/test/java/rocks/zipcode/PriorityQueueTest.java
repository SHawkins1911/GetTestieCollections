package rocks.zipcode;

import org.junit.Assert;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PriorityQueueTest {

    @org.junit.Test
    public void TestPriorityQueue1() {
        PriorityQueue<Integer> newPriorityQueue = new PriorityQueue<>();
        newPriorityQueue.add(734);
        newPriorityQueue.add(3677);
        newPriorityQueue.add(302);
        newPriorityQueue.poll();
        assertEquals(2, newPriorityQueue.size());
    }

    @org.junit.Test
    public void TestPriorityQueue2(){
        PriorityQueue<Integer> newPriorityQueue = new PriorityQueue<>();
        newPriorityQueue.add(501);
        newPriorityQueue.add(13);
        newPriorityQueue.clear();


        assertTrue(newPriorityQueue.isEmpty());
    }


}
