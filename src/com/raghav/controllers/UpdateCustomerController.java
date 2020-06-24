package com.raghav.controllers;

import com.raghav.beans.Customer;
import com.raghav.services.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UpdateCustomerController extends HttpServlet {
    CustomerService customerService = new CustomerService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Integer id = Integer.parseInt(req.getParameter("customerId"));
        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String country = req.getParameter("country");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");
        String areasOfInterest = req.getParameter("areasOfInterest");
        Customer updatedCustomer = new Customer(id, name, age, country, address, gender, areasOfInterest);

        boolean result = customerService.updateCustomer(updatedCustomer);

        if(result){
            out.println("customer details updated");
        }
        else{
            out.println("error updated the customer details");
        }
    }
}
