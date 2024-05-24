package busreservation;

public class Bus {
	private int busNo;
	private boolean Ac;
	private String driverName;
	private int capacity;

	public Bus(int busNo, boolean ac, String driverName, int capacity) {
		super();
		this.busNo = busNo;
		this.Ac = ac;
		this.driverName = driverName;
		this.capacity = capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setAc(boolean ac) {
		this.Ac = ac;
	}

	public boolean getAc() {
		return Ac;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getDriverName() {
		return driverName;
	}
	
	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", Ac=" + Ac + ", driverName=" + driverName + ", capacity=" + capacity + "]";
	}
//
//	public void displayBusInfo() {
//		System.out.println(busNo + " "+Ac+" "+driverName+" "+capacity);
//	}

}
