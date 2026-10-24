import java.util.List;
import java.util.Scanner;

public class IRCTCAPP {
    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();
    private final BookingService bookingService = new BookingService();

    public static void main(String[] args) {
        new IRCTCAPP().start();
    }

    public void start() {

        boolean running = true;

        while (running) {

            System.out.println("--------Welcome To IRCTC APP--------");

            if (!userService.isLoggedIn()) {

                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.println("Enter Your Choice : ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> register();
                    case 2 -> login();

                    case 3 -> {
                        exitApp();
                        running = false;
                    }

                    default -> System.out.println("Invalid Choice...");
                }

            } else {
                showUserMenu();
            }
        }

        scanner.close();
    }
    public void register(){
        System.out.print("Enter username : ");
        String userName = scanner.next();
        System.out.print("Enter email : ");
        String email = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.print("Enter your fullName : ");
        scanner.nextLine();
        String fullName = scanner.nextLine();
        System.out.print("Enter Your Contact : ");
        String contact = scanner.next();

        userService.registerUser(userName,email,password,fullName,contact);
    }

    public void login(){
        System.out.print("Enter email : ");
        String email = scanner.next();
        System.out.print("Enter password : ");
        String password = scanner.next();

        userService.loginUser(email,password);
    }

    private void showUserMenu(){
        while (userService.isLoggedIn()){
            System.out.println("\n --------User Menu--------");
            System.out.println("1. Search Trains");
            System.out.println("2. Book Ticket");
            System.out.println("3. View My Tickets");
            System.out.println("4. Cancel Tickets");
            System.out.println("5. View All Trains");
            System.out.println("6. Logout");
            System.out.print("Enter Your Choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> searchTrains();
                case 2 -> bookTicket();
                case 3 -> viewMyTicket();
                case 4 -> cancelTicket();
                case 5 -> bookingService.listOfTrains();
                case 6 -> userService.logoutUser();
                default -> System.out.println("Invalid choice...");
            }
        }
    }

    public void searchTrains(){
        System.out.println("Enter Source Point : ");
        String source = scanner.next();
        System.out.println("Enter Destination : ");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source,destination);
        if (trains.isEmpty()){
            System.out.println("No Trains Found Between "+source+" and "+destination);
            return;
        }
        System.out.println("Trains Found");
        for (Train train : trains ){
            System.out.println(train);
        }

        System.out.println("Do you want to book ticket ? { yes/no }");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")){
            System.out.println("Enter Train Number To Proceed : ");
            int trainNo = scanner.nextInt();
            System.out.println("Enter number of seats you want to book : ");
            int seatCount = scanner.nextInt();

            Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),seatCount,trainNo);
            if (ticket !=null){
                System.out.println("Booking Successful!");
                System.out.println(ticket);
            }
        }else {
            System.out.println("Returning to userMenu...");
        }


    }

    public void bookTicket(){
        System.out.println("Enter Source Point : ");
        String source = scanner.next();
        System.out.println("Enter Destination : ");
        String destination = scanner.next();

        List<Train> trains = bookingService.searchTrain(source,destination);
        if (trains.isEmpty()){
            System.out.println("no trains available for booking...");
            return;
        }
        System.out.println("Available Trains");
        for (Train train : trains ){
            System.out.println(train);
        }

        System.out.println("Enter Train Number To Proceed : ");
        int trainNo = scanner.nextInt();
        System.out.println("Enter number of seats you want to book : ");
        int seatCount = scanner.nextInt();

        Ticket ticket = bookingService.bookTicket(userService.getCurrentUser(),seatCount,trainNo);
        if (ticket !=null){
            System.out.println("Booking Successful!");
            System.out.println(ticket);
        }

    }

    public void viewMyTicket(){
       List<Ticket> tickets = bookingService.getTicketListOfUser(userService.getCurrentUser());
       if (tickets.isEmpty()){
           System.out.println("No tickets are booked..");
           return;
       }else {
           System.out.println("Your tickets : ");
           for (Ticket ticket:tickets){
               System.out.println(ticket);
           }
       }

    }

    public void cancelTicket(){
        System.out.println("Enter TicketId to cancel ");
        int ticketId = scanner.nextInt();
        bookingService.cancelTicket(ticketId, userService.getCurrentUser());
    }

    public void exitApp(){
            System.out.println("Thank you for using IRCTC App!");
    }

}

