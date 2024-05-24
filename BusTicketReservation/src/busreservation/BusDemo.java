package busreservation;
import java.util.Scanner;
import java.util.*;

public class BusDemo {
 public static void main(String[] args)
 {
	 
	 
//        CREATE THE BUS OBJECT: 
	 ArrayList<Bus> buses = new ArrayList<>();
	 ArrayList<Booking> passenger = new ArrayList<>();
	 
	 buses.add(new Bus(1,true,"Kaviarasan",2));
	 buses.add(new Bus(2,false,"anandh",3));
	 buses.add(new Bus(3,true,"murugan",3));
	 buses.add(new Bus(4,true,"Ajith",4));
	 buses.add(new Bus(6,false,"Kalai",4));
	 
	 for(Bus b : buses)	
	 {
		 System.out.println(b.toString());
	 }
	 
	 
	 Scanner read = new Scanner(System.in);
	 boolean exit = true;
	 while(exit)
	 {
		 System.out.println(" 1. BOOK TICKET \n 2. EXIT");
		 int userOptions = read.nextInt();
		 switch(userOptions)
		 {
		 case 1: 
			 Booking bookings = new Booking();
			if( bookings.isAvailable(buses, passenger))
			{
				passenger.add(bookings);
				System.out.println("Ticket Booking confirmed");
			}
			else {
				System.out.println("Sorry Seat is full , Try another Bus");
			}
			 break;
		 case 2:
			 System.out.print("You Exited the Booking");
			 exit = false;
			 break;
		 }
	 }
	System.out.print(passenger);
	 
 }
}
