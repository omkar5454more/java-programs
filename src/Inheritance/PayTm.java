package Inheritance;

public class PayTm extends TicketBooking{
    @Override
    public void bookTicket(int qty) {
        double total = qty*100;
        System.out.println("TOTAL PRICE FOR THE TICKET IS "+ total);
    }
}
