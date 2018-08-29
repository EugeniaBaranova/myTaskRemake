package com.company.service;

import org.junit.*;

public class CustomerServiceTest {

    private CustomerService customerService;


    @BeforeClass
    public static void beforeClass(){


        System.out.println("Before class!");

    }

    @AfterClass
    public static void afterClass(){

        System.out.println("After class");
    }

    @Before
    public void before(){
        System.out.println("BEFORE METHOD");
    }


    @After
    public void after(){

        System.out.println("AFTER METHOD");

    }


    @Test
    public void test(){
        System.out.println("I'm test ");

    }


    @Test(expected = RuntimeException.class)
    public void test1(){
        System.out.println("I'm test1 ");
        throw new RuntimeException();

    }

    @Test
    public void test2(){
        System.out.println("I'm test 2 ");
        int x = 10;

    }

}
