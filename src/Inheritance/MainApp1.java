package Inheritance;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TICKET QTY");
        int qty = sc.nextInt();
        System.out.println("ENTER THE PLATFORM ");
        System.out.println("1 BOOKMYSHOW");
        System.out.println("2  PAYTM");
        int ch = sc.nextInt();
        TicketBooking t1 ;
        if(ch==1)
            t1 = new BookMyShow();
        else
            t1 = new PayTm();
      t1.bookTicket(qty);
        

    }
}
