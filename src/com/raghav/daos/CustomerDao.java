package com.raghav.daos;

import com.raghav.beans.Customer;

public interface CustomerDao {
    Integer createCustomer(Customer customer);
    boolean deleteCustomerById(Integer id);
    boolean updateCustomer(Customer customer);

    Customer findById(Integer id);
}
