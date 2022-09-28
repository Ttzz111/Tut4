package qqq;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class TestCalc
{
@Test
    public void test(){
        Calc calc = new Calc();
        int ret = calc.add(1,2);
        Assertions.assertEquals(3,ret);
    }

    @Test
    public void test2(){
    Calc calc2 = new Calc();
    int ret2 = calc2.subtract(3,1);
    Assertions.assertEquals(2,ret2);
    }
}
