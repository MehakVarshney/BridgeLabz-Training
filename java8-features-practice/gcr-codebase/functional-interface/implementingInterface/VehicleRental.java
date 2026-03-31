package implementingInterface;

interface Rental{
	int rent(int days);
	void returnVehicle();
}

class Cars implements Rental{
	int rent;
	
	public Cars(int rent) {
		this.rent = rent;
	}
	
	public int rent(int days) {
		return days * rent;
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Returned");
	}
}

class Bikes implements Rental{
	int rent;
	
	public Bikes(int rent) {
		this.rent = rent;
	}
	
	public int rent(int days) {
		return days * rent;
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Returned");
	}
}

class Buses implements Rental{
	int rent;
	
	public Buses(int rent) {
		this.rent = rent;
	}
	
	public int rent(int days) {
		return days * rent;
	}
	
	public void returnVehicle() {
		System.out.println("Vehicle Returned");
	}
}
public class VehicleRental {
	public static void main(String[] args) {
		Rental car = new Cars(1000);
		int totalRent = car.rent(4);
		System.out.println("Total Rent" + totalRent);
		car.returnVehicle();
	}
}
