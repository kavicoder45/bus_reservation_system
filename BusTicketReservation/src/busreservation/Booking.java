package busreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String passengerName;
	int age;
	int busNo;
	Date date;

	Booking()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter you name: ");
		this.passengerName = read.next();
		System.out.println("Enter your age: ");
		this.age = read.nextInt();
		System.out.println("Enter the BUS NO; ");
		this.busNo  = read.nextInt();
		System.out.println("Enter the Date:[dd-mm-yyy]");
		String inputDate = read.next();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = formatter.parse(inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public boolean isAvailable(List<Bus> bus,List<Booking> booking) {
		
		int capacity = 0;
		
		for(Bus b : bus)
		{
			if(b.getBusNo() == busNo) {
				capacity = b.getCapacity();
			}
		}
		
		int count = 0;
		for(Booking b : booking)
		{
			if(b.date.equals(date) && b.busNo == busNo)
			{
				count++;
			}
		}
		System.out.println("Capacity" + capacity + "count" + count);
		return count < capacity ? true : false;
	}

}
