package com.example.web_customer_tracker;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer theCustomer) ;

    List<Customer> getCustomers();

    List<Customer> getCustomers(int theSortField);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomer(String theSearchName);
}
