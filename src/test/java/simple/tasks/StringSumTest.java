package simple.tasks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by dshegera on 12/19/2014
 */
public class StringSumTest {

    StringSum Calcul;

    @Before
    public  void setUp(){
        Calcul = new StringSum();
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
