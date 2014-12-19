package pairs.problem;

import org.junit.*;
import tasks.PairedBracketsAlgorithm;

/**
 * Created by dshegera on 12/18/2014
 */

public class PairsProblemTest {


    String  expressionForTestRight;
    String  expressionForTestWrong;
    PairedBracketsAlgorithm  Pair;


    @Before
    public  void setUp(){
        expressionForTestRight = "(fyutyur{}{()hgkgkgh})g()";
        expressionForTestWrong = "[(fyutyur{}{()hgkgkgh})g";
        Pair = new PairsProblem();
    }

    @Test
    public void testCheckExpressionCorrect() {
        Assert.assertTrue(Pair.checkExpressionCorrect(expressionForTestRight));
        System.out.println("@Test - checkExpressionCorrect");
    }

    @Test
    public void testCheckExpressionNotCorrect() {
        Assert.assertFalse(Pair.checkExpressionCorrect(expressionForTestWrong));
        System.out.println("@Test - checkExpressionNotCorrect");
    }
}
