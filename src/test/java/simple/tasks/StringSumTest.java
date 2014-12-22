package simple.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pairs.problem.PairsProblem;
import tasks.PairedBracketsAlgorithm;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by dshegera on 12/19/2014
 */

@RunWith(Parameterized.class)
public class StringSumTest {

    @Parameterized.Parameter
    public StringSum Calcul = new StringSum();

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayList<Object[]> params = new ArrayList<>();
        params.add(new Object[]{new StringSum()});
        return params;
    }

    @Test
    public void testCheckExpressionCorrect() {
        double rezultForCheck = Calcul.getSumFromString("a01s1sd2df3*");
        Assert.assertEquals(rezultForCheck, 7, 0);
    }

    @Test
    public void testCheckExpressionCorrect2() {
        double rezultForCheck = Calcul.getSumFromString("111a01s1sd++2df3*");
        Assert.assertEquals(rezultForCheck, 10, 0);
    }

    @Test
    public void testCheckExpressionCorrect3() {
        double rezultForCheck = Calcul.getSumFromString("@a!@#$s_s--d{df-]Ъ.");
        Assert.assertEquals(rezultForCheck, 0, 0);
    }



}
