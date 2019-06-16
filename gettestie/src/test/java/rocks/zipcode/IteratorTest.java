package rocks.zipcode;

import org.junit.Assert;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTest {
    @org.junit.Test
    public void TestIterator1() {
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        newTreeSet.add(1);
        newTreeSet.add(2);
        newTreeSet.add(3);
        Iterator<Integer> newIterator = newTreeSet.iterator();
        newIterator.next();


        Assert.assertTrue(newIterator.hasNext());
        }
}
