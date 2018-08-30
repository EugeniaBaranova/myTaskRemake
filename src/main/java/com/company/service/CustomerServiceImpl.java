package com.company.service;

import com.company.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void fillCustomer(Customer[] customers) {
        for (Customer customer: customers) {
            if(customer.getSurname() == null){
                while(customer.getId() == 0 || customer.getId() < 100 || customer.getId() > 999) {
                    System.out.println("Enter ID (3 symbols): ");
                    customer.setId(nextIntByScanner());
                }
                System.out.println("Enter Surname: ");
                customer.setSurname(nextLineByScanner());
                System.out.println("Enter Name: ");
                customer.setName(nextLineByScanner());
                System.out.println("Enter Address: ");
                customer.setAddress(nextLineByScanner());
                while(customer.getNoOfCard() == 0 || customer.getNoOfCard() < 1000 || customer.getNoOfCard() > 9999) {
                    System.out.println("Enter Number of card (4 symbols): ");
                    customer.setNoOfCard(nextIntByScanner());
                }
                while(customer.getNoOfBankAccount() == 0 || customer.getNoOfBankAccount() < 1000 || customer.getNoOfBankAccount() > 9999) {
                    System.out.println("Enter Number of bank account (4 symbols): ");
                    customer.setNoOfBankAccount(nextIntByScanner());
                }
            }
        }
    }

    @Override
    public void printListOfCustomers(Customer[] customers) {
        for(Customer customer: customers) {
            System.out.println(customer);
        }
    }

    @Override
    public Customer[] sortBySurname(Customer[] customers) {
        // Bubble Sort
        for (int i = 0; i < customers.length-1 ; i++) {
            for (int j = customers.length-1; j > i ; j--) {
                if (customers[i] != null && customers[j] != null) {
                    if (customers[i].getSurname() != null && customers[j].getSurname() != null) {
                        if (customers[i].getSurname().toLowerCase().charAt(0) > customers[j].getSurname().toLowerCase().charAt(0)) {
                            Customer transitCustomer = customers[i];
                            customers[i] = customers[j];
                            customers[j] = transitCustomer;
                        }
                    } else {
                        System.out.println("This array has customer with null Surname. Fill and try again.");
                        return customers;
                    }
                } else {
                    System.out.println("This array of customers has null customer. Fill array and try again.");
                    return customers;
                }
            }
        }
        /*System.out.println("List of customers sorted by surname");
        printListOfCustomers(customers);*/
        return customers;
    }

    @Override
    public Customer[] customersWhoHaveCardNumberInTheRangeFromTo(Customer[] customers, int from, int to) throws Exception {

        //System.out.println("List of customer's cards (interval from " + from + " to " + to + ")");

        List<Customer> customersInTheRangeList = new ArrayList<>();
        for (Customer customer: customers){
            if(customer != null) {
                if(customer.getNoOfCard() > from && customer.getNoOfCard() < to){
                    //System.out.println(customer);
                    customersInTheRangeList.add(customer);
                }
            }
        }
        if(customersInTheRangeList.isEmpty()) {
            throw new Exception("Nothing has found. There are no customers with such card numbers.");
        }
        Customer[] customersInTheRangeArray = new Customer[customersInTheRangeList.size()];
        for (int i = 0; i < customersInTheRangeList.size(); i++){
            customersInTheRangeArray[i] = customersInTheRangeList.get(i);
        }
        return customersInTheRangeArray;
    }

    private String nextLineByScanner() {
        String string = this.scanner.nextLine();
        while (string.isEmpty()) {
            System.out.println("Try again!");
            string = this.scanner.nextLine();
        }
        return string;
    }

    private int nextIntByScanner() {
        String string = this.scanner.nextLine();
        while (string.isEmpty()) {
            System.out.println("Try again!");
            string = this.scanner.nextLine();
        }
        boolean conditionOfRepeatedInput = true;
        while(conditionOfRepeatedInput) {
            for(int j = 0; j < string.length(); j++) {
                if (!(string.charAt(j) >= 48 && string.charAt(j) <= 57)) {
                    conditionOfRepeatedInput = false;
                }
            }
            String newString = "don't need check";
            if(!conditionOfRepeatedInput) {
                System.out.println("Wrong format! Use numerals and try again!");
                string = this.scanner.nextLine();
                while (string.isEmpty()) {
                    System.out.println("Wrong format! Use numerals and try again!");
                    string = this.scanner.nextLine();
                }
                newString = "need check";
            }
            if(newString.equals("need check")) {
                conditionOfRepeatedInput = true;
            } else {
                return Integer.parseInt(string);
            }
        }
        return 0;
    }


    void print(Object object){
        System.out.println(object);
    }

}
