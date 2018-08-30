package com.company.service;

import com.company.entity.Customer;
import org.junit.*;

public class CustomerServiceTest {

    private CustomerService customerService = new CustomerServiceImpl();

    private Customer[] customers;

    public CustomerServiceTest() {
        customers = new Customer[3];
        customers[0] = new Customer(123, "Window", "Natan", "Kfghfg 1-2", 3567, 3567);
        customers[1] = new Customer(456, "Brijes", "Jake", "FGdhsc 2-3", 3568, 2567);
        customers[2] = new Customer(789,"Devison", "Bob","Fghucb 3-4", 3784,6853);
    }



    @Test
    public void sortBySurnameTest(){
        Customer[] expected = {customers[1],customers[2],customers[0]};
        Customer[] customersSortedBySurname = customerService.sortBySurname(customers);
        Assert.assertArrayEquals(expected,customersSortedBySurname);
    }
    @Test
    public void sortBySurname_IfCustomerSurnameIsNull_Test(){
        Customer[] customersWithNullCustomerSurname = {customers[0],customers[1],customers[2],new Customer()};
        Customer[] customersWithNullCustomerSurnameSortedBySurname = customerService.sortBySurname(customersWithNullCustomerSurname);
        Assert.assertArrayEquals(customersWithNullCustomerSurname,customersWithNullCustomerSurnameSortedBySurname);
    }
    @Test
    public void sortBySurname_IfCustomerIsNull_Test(){
        Customer[] customersWithNullCustomer = {customers[0],null};
        Customer[] customersWithNullCustomerSortedBySurname = customerService.sortBySurname(customersWithNullCustomer);
        Assert.assertArrayEquals(customersWithNullCustomer,customersWithNullCustomerSortedBySurname);
    }

    @Test
    public void customersWhoHaveCardNumberInTheRangeFromTo_WhenThereIsSuchACustomer_Test(){
        Customer[] expected = {customers[0],customers[1]};
        Customer[] customersInTheRange = new Customer[0];
        try {
            customersInTheRange = customerService.customersWhoHaveCardNumberInTheRangeFromTo(customers,3500,3600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertArrayEquals(expected,customersInTheRange);
    }
    @Test(expected = Exception.class)
    public void customersWhoHaveCardNumberInTheRangeFromTo_WhenThereIsNotSuchACustomer_Test() throws Exception {
        customerService.customersWhoHaveCardNumberInTheRangeFromTo(customers,3400,3500);
    }




    /*@BeforeClass
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

    }*/






}
