package com.raghav.controllers;

import com.raghav.services.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteCustomerController extends HttpServlet {

    CustomerService customerService = new CustomerService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Integer id = Integer.parseInt(req.getParameter("customerId"));
        boolean result = customerService.deleteCustomer(id);

        if(result){
            out.println("customer with id " + id + " deleted successfully.");
        }
        else{
            out.println("error deleting the customer.");
        }
    }
}
