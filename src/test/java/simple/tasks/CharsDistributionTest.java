package simple.tasks;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pairs.problem.PairsProblem;
import tasks.PairedBracketsAlgorithm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dshegera on 12/19/2014
 */

@RunWith(Parameterized.class)
public class CharsDistributionTest {


    @Parameterized.Parameter
    public  CharsDistribution Distributor  = new CharsDistribution();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> params = new ArrayList<>();
        params.add(new Object[]{new CharsDistribution()});
        return params;
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
        @Test
        public void testCharsDistributionOne() {

        String testString = "G";
        Map<Character, Integer> testAutoMap = Distributor.getDistribution(testString);
        Map<Character, Integer> testManualMap2 = new HashMap<Character, Integer>();
        testManualMap2.put('G', 1);
        Assert.assertEquals(testAutoMap, testManualMap2);
    }
        @Test
         public void testCharsDistributionEmpty() {

        String testString = new String();
        Map<Character, Integer> testAutoMap = Distributor.getDistribution(testString);
        Map<Character, Integer> testManualMap = new HashMap<Character, Integer>();
        Assert.assertEquals(testAutoMap, testManualMap);
    }
}