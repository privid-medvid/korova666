package pairs.problem;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tasks.PairedBracketsAlgorithm;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dshegera on 12/18/2014
 */

@RunWith(Parameterized.class)
public class PairsProblemTest {

    @Parameterized.Parameter
    public PairedBracketsAlgorithm  Pair = new PairsProblem();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> params = new ArrayList<>();
        params.add(new Object[]{new PairsProblem()});
        return params;
    }

    String  expressionForTestRight;
    String  expressionForTestWrong;
    String  expressionForTestOne;
    String  expressionForTestEmpty;
    String  closeOpen;

    @Before
    public  void setUp(){
        expressionForTestRight = "(fyutyur{}{()hgkgkgh})g()";
        expressionForTestWrong = "[(fyutyur{}{()hgkgkgh})g";
        expressionForTestOne = "[";
        expressionForTestEmpty = "";
        closeOpen = "}{";
    }

    @Test
    public void testCheckExpressionCorrect() {
        Assert.assertTrue(Pair.checkExpressionCorrect(expressionForTestRight));
    }

    @Test
    public void testCheckExpressionNotCorrect() {
        Assert.assertFalse(Pair.checkExpressionCorrect(expressionForTestWrong));
    }

    @Test
    public void testCheckExpressionOne() {
        Assert.assertFalse(Pair.checkExpressionCorrect(expressionForTestOne));
    }
    @Test
    public void testCheckExpressionEmpty() {
        Assert.assertTrue(Pair.checkExpressionCorrect(expressionForTestEmpty));
    }

}
