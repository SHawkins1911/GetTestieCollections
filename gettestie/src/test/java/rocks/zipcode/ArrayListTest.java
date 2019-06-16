package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    @org.junit.Test
    public void TestArrayList1() {
        List<String> newArrList = new ArrayList<>();

        newArrList.add("Stefun");

        Assert.assertTrue(newArrList.contains("Stefun"));

    }

    @org.junit.Test
    public void TestArrayList2() {
        List<String> newArrList = new ArrayList<>();

        newArrList.add("Stefun");

        Assert.assertEquals("Stefun", newArrList.get(0));

    }
}
