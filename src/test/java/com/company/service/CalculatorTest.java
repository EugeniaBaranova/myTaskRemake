package com.company.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;


    @Test
    public void whenAllElementIsPositiveTest(){

        int result = calculator.add(10, 10);
        Assert.assertSame(result,20);
    }

    @Test
    public void whenAllElementsIsZeroTest(){

        int add = calculator.add(0, 0);
        Assert.assertSame(0,add);

    }

    @Test
    public void whenFirstElementIsNegativeTest(){

        int add = calculator.add(-1, 1);

        Assert.assertSame(add,0);

        int add1 = calculator.add(-1, 12);

        Assert.assertSame(11,add1);

    }

    @Test
    public void whenSecondElementIsNegativeTest(){

        int add = calculator.add(1, -1);

        Assert.assertSame(add,0);

        int add1 = calculator.add(1, -12);

        Assert.assertSame(-11,add1);

    }


}
