package simple.tasks;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dshegera on 12/18/2014
 */

@RunWith(Parameterized.class)
public class LeapYearTest {

    @Parameterized.Parameter
    public LeapYear YearTest = new LeapYear();


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> params = new ArrayList<>();
        params.add(new Object[]{new LeapYear()});
        return params;
    }

    @BeforeClass
    public static void DataSetUp(){
    }

    @Test
    public void testIsLeapYear() throws Exception {
        Assert.assertTrue(YearTest.isLeapYear(1996));
    }

    @Test
         public void testIsNotLeapYear() throws Exception {
        Assert.assertFalse(YearTest.isLeapYear(2001));
    }

    @Test
    public void testIsNotLeapYearOld() throws Exception {
        Assert.assertFalse(YearTest.isLeapYear(600));
    }
    @Test
    public void testIsNotLeapYear400() throws Exception {
        Assert.assertFalse(YearTest.isLeapYear(3000));
    }

}