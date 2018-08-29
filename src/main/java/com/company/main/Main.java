package com.company.main;

import com.company.entity.Customer;
import com.company.service.CustomerService;
import com.company.service.CustomerServiceImpl;

public class Main {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerServiceImpl();

        Customer[] customers = new Customer[4];
        customers[0] = new Customer(123, "Vjhgd", "Nat", "Bfgdh", 3567, 3567);
        customers[1] = new Customer(567, "Dhfkbbv", "Bdhhs", "FGdhsc", 3568, 2567);
        customers[2] = new Customer(765,"Sdouvm", "DShcjb","Fghucb", 3784,6853);
        customers[3] = new Customer();

        customerService.fillCustomer(customers);

        customerService.sortBySurname(customers);
        customerService.cardOfInterval(customers, 3500, 3600);

    }

}
