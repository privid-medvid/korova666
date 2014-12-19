package simple.tasks;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dshegera on 12/19/2014
 */
public class CharsDistributionTest {

    CharsDistribution Distributor;

    @Before
    public  void setUp(){
        Distributor = new CharsDistribution();
    }


    @Test
    public void testCharsDistribution() {

        String testString = "aaaa1033_";
        Map<Character, Integer> testAutoMap = Distributor.getDistribution(testString);

        Map<Character, Integer> testManualMap = new HashMap<>();
        testManualMap.put('a', 4);
        testManualMap.put('_', 1);
        testManualMap.put('0', 1);
        testManualMap.put('1', 1);
        testManualMap.put('3', 2);

        Assert.assertEquals(testAutoMap, testManualMap);
    }



}
