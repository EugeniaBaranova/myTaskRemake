package com.company.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new CalculatorImpl();


    @Test
    public void addWhenAllElementIsPositiveTest(){

        int add = calculator.add(10, 10);
        Assert.assertSame(20,add);
    }
    @Test
    public void addWhenAllElementsIsZeroTest(){

        int add = calculator.add(0, 0);
        Assert.assertSame(0,add);
    }
    @Test
    public void addWhenFirstElementIsNegativeTest(){

        int add = calculator.add(-1, 1);
        Assert.assertSame(0,add);

        int add1 = calculator.add(-1, 12);
        Assert.assertSame(11,add1);
    }
    @Test
    public void addWhenSecondElementIsNegativeTest(){

        int add = calculator.add(1, -1);
        Assert.assertSame(0,add);

        int add1 = calculator.add(1, -12);
        Assert.assertSame(-11,add1);
    }
    @Test
    public void addWhenAllElementIsNegativeTest(){

        int add = calculator.add(-1, -1);
        Assert.assertSame(-2,add);
    }





    @Test
    public void multiplyWhenAllElementIsPositiveTest(){

        int multiply = calculator.multiply(1,2);
        Assert.assertSame(2,multiply);

    }
    @Test
    public void multiplyWhenFirstElementIsNegativeTest(){

        int multiply = calculator.multiply(-1,2);
        Assert.assertSame(-2,multiply);

    }
    @Test
    public void multiplyWhenSecondElementIsNegativeTest(){

        int multiply = calculator.multiply(5,-3);
        Assert.assertSame(-15,multiply);

    }
    @Test
    public void multiplyWhenAllElementsIsZeroTest(){

        int multiply = calculator.multiply(0,0);
        Assert.assertSame(0,multiply);

    }
    @Test
    public void multiplyWhenAllElementsIsNegativeTest(){

        int multiply = calculator.multiply(-5,-4);
        Assert.assertSame(20,multiply);

    }






    @Test
    public void divideWhenAllElementIsPositiveTest(){

        double divide = calculator.divide(1,2);
        Assert.assertEquals(0.5,divide,0.0);

    }
    @Test
    public void divideWhenFirstElementIsNegativeTest(){

        double divide = calculator.divide(-1,2);
        Assert.assertEquals(-0.5,divide,0.0);

    }
    @Test
    public void divideWhenSecondElementIsNegativeTest(){

        double divide = calculator.divide(10,-2);
        Assert.assertEquals(-5,divide,0);

        double divide1 = calculator.divide(1,-2);
        Assert.assertEquals(-0.5,divide1,0.0);

    }
    @Test
    public void divideWhenFirstElementsIsZeroTest(){

        double divide = calculator.divide(0,1);
        Assert.assertEquals(0,divide,0);

    }
    @Test
    public void divideWhenAllElementsIsNegativeTest(){

        double divide = calculator.divide(-20,-4);
        Assert.assertEquals(5,divide,0);

    }
    @Test
    public void divideWhenSecondElementsIsZeroTest() throws  ArithmeticException{

        calculator.divide(1,0);

    }






    @Test
    public void subtractWhenAllElementIsPositiveTest(){

        int subtract = calculator.subtract(10, 10);
        Assert.assertSame(0, subtract);

        int subtract1 = calculator.subtract(20, 10);
        Assert.assertSame(10, subtract1);
    }
    @Test
    public void subtractWhenAllElementsIsZeroTest(){

        int subtract = calculator.subtract(0, 0);
        Assert.assertSame(0,subtract);
    }
    @Test
    public void subtractWhenFirstElementIsNegativeTest(){

        int subtract = calculator.subtract(-1, 1);
        Assert.assertSame(-2, subtract);

    }
    @Test
    public void subtractWhenSecondElementIsNegativeTest(){

        int subtract = calculator.subtract(1, -3);
        Assert.assertSame(4, subtract);
    }
    @Test
    public void subtractWhenAllElementIsNegativeTest(){

        int subtract = calculator.subtract(-1, -1);
        Assert.assertSame(0,subtract);

        int subtract1 = calculator.subtract(-1,-10);
        Assert.assertSame(9,subtract1);
    }







    @Test
    public void exponentiationWhenAllElementIsPositiveTest() {

        double exponentiation = calculator.exponentiation(2,3);
        Assert.assertEquals(8, exponentiation, 0);

    }
    @Test
    public void exponentiationWhenSecondElementIsZeroAndFirstElementIsNotZeroTest() {

        double exponentiation = calculator.exponentiation(2,0);
        Assert.assertEquals(1,exponentiation,0);

    }
    @Test
    public void exponentiationWhenAllElementIsNegativeTest() {

        double exponentiation = calculator.exponentiation(-2,-2);
        Assert.assertEquals(0.25,exponentiation,0.00);

    }
    @Test
    public void exponentiationWhenFirstElementIsNegativeTest() {

        double exponentiation = calculator.exponentiation(-2,2);
        Assert.assertEquals(4,exponentiation,0);

        double exponentiation1 = calculator.exponentiation(-2,3);
        Assert.assertEquals(-8,exponentiation1,0);

    }
    @Test
    public void exponentiationWhenSecondElementIsNegativeTest() {

        double exponentiation = calculator.exponentiation(2,-2);
        Assert.assertEquals(0.25,exponentiation,0.00);

    }
    //!!!!
    @Test
    public void exponentiationWhenAllElementIsZeroTest() {

        double exponentiation = calculator.exponentiation(0,0);
        Assert.assertEquals(0,exponentiation,0);

    }






}
