package com.company.service;

public class CalculatorImpl implements Calculator {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int multiply(int x, int y) {
        return x*y;
    }


    @Override
    public double divide(double x, double y) {
        return x/y;
    }

    @Override
    public int subtract(int subtrahend, int minuend) {
        return subtrahend-minuend;
    }

    @Override
    public double exponentiation(int base, int exponent) {
        if(exponent == 0 && base == 0){
            System.out.println("0^0 - indeterminate form");
            //!!!
            return 0;
        }
        if(exponent == 0 && base != 0){
            return 1;
        }
        double result = base;
        if(base != 0 && exponent > 0) {
            for(int i = 1; i < exponent; i++) {
                result = result*base;
            }
        }
        if(base != 0 && exponent < 0) {
            for(int i = 1; i < Math.abs(exponent); i++) {
                result = result*base;
            }
            result = 1/result;
        }
        return result;
    }


}
