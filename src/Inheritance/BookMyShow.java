package Inheritance;

public class BookMyShow extends  TicketBooking{
    @Override
    public void bookTicket(int qty) {
        double total = qty*120;
        System.out.println("TOTAL PRICE FOR TICKET IS "+ total);

    }
}
