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
}
