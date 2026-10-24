package service;

import config.DBConfig;
import entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public static void addCustomer(Customer customer) throws SQLException {
      Connection con = DBConfig.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO customers(name,phone) VALUES (?,?)");
        ps.setString(1, customer.getName());
        ps.setString(2, customer.getPhone());
        ps.executeUpdate();
        ps.close();
        con.close();
    }


    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> list = new ArrayList<>();

        Connection con = DBConfig.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers");

        while (rs.next()) {
            list.add(new Customer(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("phone")
            ));
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }

    public Customer getCustomerBasedOnNum(String phone) throws SQLException {
       Customer customer = new Customer();
        Connection con = DBConfig.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE phone = "+phone);

        while (rs.next()) {
            customer = new Customer(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("phone")
            );
        }

        return customer;
    }

}
