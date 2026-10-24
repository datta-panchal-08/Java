package service;

import entity.Invoice;

import java.sql.SQLException;
import java.util.List;

public class BillingService {

    public CustomerService customerService = new CustomerService();
    public InvoiceService invoiceService = new InvoiceService();

    public void CreateInvoice(int customer_id, int vehicle_id, List<Integer> services_id) throws SQLException {

       for(int serviceId:services_id){
           invoiceService.addInvoice(new Invoice(0,customer_id,vehicle_id,serviceId));
       }

        System.out.println("Invoice generated successfully...");
    }

    public void showAllInvoices() throws  SQLException{
        List<Invoice> invoices = invoiceService.getAllInvoices();

        for (Invoice invoice:invoices){
            System.out.println(invoice);
        }
    }

}
