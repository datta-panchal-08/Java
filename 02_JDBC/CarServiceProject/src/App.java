import entity.Customer;
import service.BillingService;
import service.CustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        BillingService billingService = new BillingService();

        while (true){

            System.out.println("1. Add Customers With Vehicle \n 2. Generate Invoice \n 3. Show Invoice \n 4. Exit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1: {
                    sc.nextLine();

                    System.out.print("Customer name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.println("Enter Vehicle Number: ");
                    String number_plate = sc.nextLine();
                    System.out.println("Enter Model  : ");
                    String model = sc.nextLine();
                    System.out.println();

                    Customer customerBasedOnNum = service.CustomerService.getCustomerBasedOnNum(phone);

                    CustomerService.addCustomer(new Customer(0, name, phone));
                    System.out.println("Customer added successfully!");
                    break;
                }
                case 2 : {
                    System.out.println("Enter customerID : ");
                    int customer_id = sc.nextInt();
                    System.out.println("Enter vehicleID : ");
                    int vehicle_id = sc.nextInt();
                    System.out.println("Enter number of services : ");
                    int n = sc.nextInt();
                    List<Integer> serviceIds = new ArrayList<>();
                    for (int i = 0;i<n;i++){
                        System.out.println("Enter the service id : ");
                        serviceIds.add(sc.nextInt());
                    }
                   billingService.CreateInvoice(customer_id, vehicle_id, serviceIds);
                    break;
                }
                case 3: {
                    billingService.showAllInvoices();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid choice.");
                }
            }

        }
    }
}
