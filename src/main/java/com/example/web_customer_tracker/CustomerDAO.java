package com.example.web_customer_tracker;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomers();

    List<Customer> getCustomers(int theSortField);

    void saveCustomer(Customer tempCustomer) ;

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);

    List<Customer> searchCustomers(String theSearchName);
}
