package service;

import config.DBConfig;
import entity.Invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {

    public static void addInvoice(Invoice invoice) throws SQLException {
        Connection con = DBConfig.getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO invoices(customer_id,vehicle_id,services_id) VALUES(?,?,?)");
        ps.setInt(1,invoice.getCustomer_id());
        ps.setInt(2,invoice.getService_id());
        ps.setInt(3,invoice.getService_id());
        ps.executeUpdate();
        ps.close();
        con.close();
    }


    public List<Invoice> getAllInvoices () throws  SQLException{
        List<Invoice> list = new ArrayList<>();
        Connection con = DBConfig.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM invoices");

        while(rs.next()){
            list.add(new Invoice(
                    rs.getInt("id"),
                    rs.getInt("customer_id"),
                    rs.getInt("vehicle_id"),
                    rs.getInt("services_id")
            ));
        }

        return  list;
    }

}
