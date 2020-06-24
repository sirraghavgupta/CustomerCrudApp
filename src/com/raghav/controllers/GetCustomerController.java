package com.raghav.controllers;

import com.raghav.beans.Customer;
import com.raghav.services.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCustomerController extends HttpServlet {

    CustomerService customerService = new CustomerService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Integer id = Integer.parseInt(req.getParameter("customerId"));
        System.out.println(id);
        Customer customer = customerService.findCustomer(id);
        System.out.println(id);
        if(customer != null){
            out.println("customer with id " + id + " found");
            out.println("Id : " + customer.getId());
            out.println("Name : " + customer.getName());
            out.println("Age : " + customer.getAge());
            out.println("Country : " + customer.getCountry());
            out.println("Gender : " + customer.getGender());
            out.println("Address : " + customer.getAddress());
            out.println("Areas of Interest : " + customer.getAreasOfInterest());
        }
        else{
            out.println("customer not found.");
        }
    }
}
