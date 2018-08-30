package com.company.service;

import com.company.entity.Customer;

public interface CustomerService {

    void fillCustomer(Customer[] customers);

    void printListOfCustomers(Customer[] customers);

    Customer[] sortBySurname(Customer[] customers);

    Customer[] customersWhoHaveCardNumberInTheRangeFromTo(Customer[] customers, int from, int to) throws Exception;

}
