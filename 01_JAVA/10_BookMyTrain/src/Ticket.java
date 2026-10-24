public class Ticket {
    private static int counter = 1001;
    private int ticketId;
    private User user;
    private Train train;
    private int bookedSeat;

    public Ticket( User user, Train train, int bookedSeat) {
        this.ticketId = counter++;
        this.user = user;
        this.train = train;
        this.bookedSeat = bookedSeat;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Ticket.counter = counter;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    @Override
    public String toString(){
        return "TicketID : "+ticketId+" Train "+train.getName()+" | Route :  "+train.getSource()+" | Destination : "+train.getDestination()+" | Seats : "+bookedSeat+" | Booked By : "+user.getFullName();
    }

}
