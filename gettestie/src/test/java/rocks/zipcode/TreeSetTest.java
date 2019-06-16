package rocks.zipcode;

import org.junit.Assert;

import java.util.TreeSet;

public class TreeSetTest {

    @org.junit.Test
    public void TestTreeSet1() {
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        newTreeSet.add(1);
        newTreeSet.add(2);
        newTreeSet.add(3);

        Assert.assertFalse(newTreeSet.add(1));
    }

    @org.junit.Test
    public void TestTreeSet2() {
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        newTreeSet.add(1);
        newTreeSet.add(2);
        newTreeSet.add(3);

        Assert.assertEquals(2, (int)newTreeSet.higher(1));
    }
}
