package rocks.zipcode;

import org.junit.Assert;
import org.junit.Assert.*;

import java.util.HashSet;

public class TestHashSet {

    @org.junit.Test
        public void TestHashSet1() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Stefun");

        Assert.assertTrue(hashSet.contains("Stefun"));

    }

    @org.junit.Test
    public void TestHashSet2() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Stefun");

        Assert.assertFalse(hashSet.isEmpty());

    }
    @org.junit.Test
    public void TestHashSet3() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Stefun");
        hashSet.clear();

        Assert.assertTrue(hashSet.isEmpty());

    }
}
