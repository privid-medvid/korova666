package simple.tasks;

import org.junit.*;

/**
 * Created by dshegera on 12/18/2014
 */

public class LeapYearTest {

    LeapYear YearTest;

    @Before
    public void initialization() throws Exception {
        YearTest = new LeapYear();
        System.out.println("@Before - setUp");
    }

    @Test
    public void testIsLeapYear() throws Exception {
        Assert.assertTrue(YearTest.isLeapYear(1996));
        System.out.println("@Test - testIsLeapYear");
    }

    @Test
    public void testIsNotLeapYear() throws Exception {
        Assert.assertFalse(YearTest.isLeapYear(2001));
        System.out.println("@Test - testIsNotLeapYear");
    }

}