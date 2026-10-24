import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingService {
    private List<Train> trainList = new ArrayList<>();
    private List<Ticket> ticketList = new ArrayList<>();

    public BookingService(){
       trainList.add(new Train(
               11020,
               "Konark Express",
               "Mumbai",
               "Bhubaneswar",
               500
       ));

       trainList.add(new Train(
               12124,
               "Deccan Queen",
               "Pune",
               "Mumbai",
               450
       ));
       trainList.add( new Train(
               12628,
               "Karnataka Express",
               "New Delhi",
               "Bengaluru",
               600
       ));

       trainList.add(new Train(
               12010,
               "Shatabdi Express",
               "Ahmedabad",
               "Mumbai",
               400
       ));
       trainList.add(new Train(
               12702,
               "Hussain Sagar Express",
               "Hyderabad",
               "Mumbai",
               550
       ));
       trainList.add(new Train(
               12230,
               "Lucknow Mail",
               "New Delhi",
               "Lucknow",
               480
       ));
    }

    public List<Train> searchTrain(String source , String destination){

        List<Train> res = new ArrayList<>();

        for (Train train:trainList){
            if(train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)){
                res.add(train);
            }
        }
        return res;
    }

    public Ticket bookTicket(User user,int seatCount,int trainNo) {
        for (Train train : trainList) {
            if (train.getTrainNo() == trainNo) {
                if (train.bookSeats(seatCount)) {
                    Ticket ticket = new Ticket(user, train, seatCount);
                    ticketList.add(ticket);
                    return ticket;
                } else {
                    System.out.println("No Seats Available");
                    return null;
                }
            }
        }
        System.out.println("TrainNo Not Found");
        return null;
    }

    public List<Ticket> getTicketListOfUser(User user){
        List<Ticket> res = new ArrayList<>();

        for (Ticket ticket:ticketList){
            if(ticket.getUser().getUserName().equalsIgnoreCase(user.getUserName())){
                res.add(ticket);
            }
        }
        return res;
    }

    public boolean cancelTicket(int ticketId,User user){
        Iterator<Ticket> iterator = ticketList.iterator();
        while (iterator.hasNext()){
            Ticket ticket = iterator.next();
            if(ticket.getTicketId() == ticketId && ticket.getUser().getUserName().equalsIgnoreCase(user.getUserName())){
                Train train = ticket.getTrain();
                train.cancelSeats(ticket.getBookedSeat());
                 iterator.remove();
                System.out.println("Ticket "+ticketId+" Cancelled Successfully!");
                return  true;
            }
        }
        System.out.println("Ticket not found or Ticket does not belongs to the current user");
        return  false;
    }

    public void listOfTrains(){
        System.out.println("List Of All Trains");
        for (Train train:trainList){
            System.out.println(train);
        }
    }

}
