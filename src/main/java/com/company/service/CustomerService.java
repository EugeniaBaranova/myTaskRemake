package com.company.service;

import com.company.entity.Customer;

public interface CustomerService {

    void fillCustomer(Customer[] customers);

    void printListOfCustomers(Customer[] customers);

    void sortBySurname(Customer[] customers);

    void cardOfInterval(Customer[] customers, int from, int to);

}
