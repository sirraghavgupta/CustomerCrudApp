package com.raghav.daos;

import com.raghav.beans.Customer;
import com.raghav.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao{

    @Override
    public Integer createCustomer(Customer customer) {
        ResultSet rs = null;
        Integer id = null;

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into customer_info(full_name, " +
                    "age, country, address, gender, areas_of_interest) values(?, ?, ?, ?, ?, ?)");
            ps.setString(1, customer.getName());
            ps.setInt(2, customer.getAge());
            ps.setString(3, customer.getCountry());
            ps.setString(4, customer.getAddress());
            ps.setString(5, customer.getGender());
            ps.setString(6, customer.getAreasOfInterest());
            ps.executeUpdate();

            PreparedStatement ps2 = conn.prepareStatement("select * from customer_info where " +
                                                            "id=(select max(id) from customer_info);");
            rs = ps2.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
        }
        return id;
    }

    @Override
    public boolean deleteCustomerById(Integer id) {
        boolean result =  false;
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("delete from customer_info where id = ?");
            ps.setInt(1, id);
            int count = ps.executeUpdate();

            if(count>0){
                result = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
        }
        return result;
    }

    @Override
    public boolean updateCustomer(Customer updatedCustomer) {
        boolean result = false;

        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("update customer_info set full_name=?, " +
                    "age=?, country=?, address=?, gender=?, areas_of_interest=? where id=?");
            ps.setString(1, updatedCustomer.getName());
            ps.setInt(2, updatedCustomer.getAge());
            ps.setString(3, updatedCustomer.getCountry());
            ps.setString(4, updatedCustomer.getAddress());
            ps.setString(5, updatedCustomer.getGender());
            ps.setString(6, updatedCustomer.getAreasOfInterest());
            ps.setInt(7, updatedCustomer.getId());

            int count = ps.executeUpdate();
            if(count>0){
                result=true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
        }
        return result;
    }

    @Override
    public Customer findById(Integer id) {
        Customer customer = null;
        ResultSet rs = null;
        Connection conn = DBConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from customer_info where id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if(rs.next()){
                customer = new Customer();
                customer.setId(rs.getInt(1));
                customer.setName(rs.getString(2));
                customer.setAge(rs.getInt(3));
                customer.setCountry(rs.getString(4));
                customer.setAddress(rs.getString(5));
                customer.setGender(rs.getString(6));
                customer.setAreasOfInterest(rs.getString(7));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBConnection.closeConnection(conn);
        }
        System.out.println(customer);
        return customer;
    }
}
