package rocks.zipcode;

import org.junit.Assert;


import java.util.Vector;

public class VectorTest {

    @org.junit.Test
    public void TestVector1(){
        Vector<String> newVector = new Vector<>(4,2);

        Assert.assertEquals(4, newVector.capacity());

    }

    @org.junit.Test
    public void TestVector2(){
        Vector<String> newVector = new Vector<>(4,2);
        newVector.add(0,"-1694");
        newVector.add(1,"222");
        newVector.add(2, "(302)");
        newVector.add(3,"Test");
        newVector.addElement("Old Number");

        Assert.assertTrue(newVector.contains("(302)"));

    }
}
