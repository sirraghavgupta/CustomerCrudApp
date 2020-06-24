package com.raghav.services;

import com.raghav.beans.Customer;
import com.raghav.daos.CustomerDao;
import com.raghav.daos.CustomerDaoImpl;

public class CustomerService {

    CustomerDao customerDao = new CustomerDaoImpl();

    public Integer createCustomer(Customer newCustomer) {
        return customerDao.createCustomer(newCustomer);
    }

    public boolean deleteCustomer(Integer id){
        return customerDao.deleteCustomerById(id);
    }

    public boolean updateCustomer(Customer updatedCustomer){
        return customerDao.updateCustomer(updatedCustomer);
    }

    public Customer findCustomer(Integer id) {
        return customerDao.findById(id);
    }
}
