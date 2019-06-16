package rocks.zipcode;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.TreeSet;

public class ComparableTest {

    @org.junit.Test
    public void TestCompareTo1() {
        Person student1 = new Person("John", 1990);
        Person student2 = new Person("Doug", 1991);
        ArrayList<Person> classList = new ArrayList<>();
        classList.add(student1);
        classList.add(student2);


        Assert.assertTrue(student1.getName().compareTo(student2.getName()) > 0);

    }
}
