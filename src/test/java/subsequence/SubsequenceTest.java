package subsequence;

import org.junit.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dshegera on 12/18/2014
 */

public class SubsequenceTest {

    Subsequence TestChecker;
    List commonList;
    List rightList;
    List wrongList;

    @Before
    public  void setUp(){
        TestChecker = new Subsequence();
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
