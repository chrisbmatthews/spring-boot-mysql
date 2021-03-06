package com.cbmatthews.springbootmysql.dao;

import com.cbmatthews.springbootmysql.jpa.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> listCustomers();

    public Customer getCustomer(int id);

    public Customer deleteCustomer(Customer c);

    public Customer saveCustomer(Customer c, boolean explode);
}
