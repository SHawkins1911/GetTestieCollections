package rocks.zipcode;

import org.junit.Assert;

import java.util.TreeMap;

public class TreeMapTest {

    @org.junit.Test
    public void TestTreeMap1() {
        TreeMap<Character, Integer> newTreeMap = new TreeMap<>();
        newTreeMap.put('a', 1);
        newTreeMap.put('b', 2);
        newTreeMap.put('c', 3);

        Assert.assertEquals('a', (char) newTreeMap.firstKey());
    }

    @org.junit.Test
    public void TestTreeMap2() {
        TreeMap<Character, Integer> newTreeMap = new TreeMap<>();
        newTreeMap.put('a', 1);
        newTreeMap.put('b', 2);
        newTreeMap.put('c', 3);
        newTreeMap.remove('b');

        Assert.assertEquals(2, newTreeMap.size());
    }

}
