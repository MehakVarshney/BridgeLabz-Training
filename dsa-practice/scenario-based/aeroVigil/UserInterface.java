package aeroVigil;
import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FlightUtil utill = new FlightUtil();
		try {
			System.out.println("Enter The flight Number: ");
		    String flightNumber = sc.nextLine();
		    System.out.println("Enter the Nmae of the flight: ");
		    String flightName = sc.nextLine();
		    System.out.println("Enter the Number of Passenger: ");
		    int passengerCount = sc.nextInt();
		    System.out.println("Enter the fuel level: ");
		    double currentFuelLevel = sc.nextDouble();
		    
		    utill.validateFlightNumber(flightNumber);
		    utill.validateFlightNumber(flightNumber);
		    utill.validatePassengerCount(passengerCount, flightName);
		    
		    double fuelRequired = utill.calculateFuelToFillTank(flightName, currentFuelLevel);
		    
		    System.out.println("Fuel Required to fill the tank: " + fuelRequired);
		    
		}catch(InvalidFlightException e){
			System.out.println(e.getMessage());
			
		}
		

	}

}
