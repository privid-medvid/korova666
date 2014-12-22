package subsequence;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pairs.problem.PairsProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by dshegera on 12/18/2014
 */

@RunWith(Parameterized.class)
public class SubsequenceTest {

    @Parameterized.Parameter
    public Subsequence TestChecker = new Subsequence();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> params = new ArrayList<>();
        params.add(new Object[]{new Subsequence()});
        return params;
    }

    List commonList;
    List rightList;
    List wrongList;

    @Before
    public  void setUp(){
        commonList = Arrays.asList("1", "2", "3", "4");
        rightList = Arrays.asList("3", "4");
        wrongList = Arrays.asList("4", "1");
    }

    @Test
    public void isSubSequenceY() {
        Assert.assertTrue(TestChecker.isSubSequence(commonList, rightList));
    }

    @Test
    public void isSubSequenceN() {
        Assert.assertFalse(TestChecker.isSubSequence(commonList, wrongList));
    }
}
