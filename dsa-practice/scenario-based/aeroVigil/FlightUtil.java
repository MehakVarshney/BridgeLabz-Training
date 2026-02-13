package aeroVigil;

import aeroVigil.InvalidFlightException;

public class FlightUtil {
	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		if(!flightNumber.matches("FL-\\d{4}")) {
			throw new InvalidFlightException("The Flight Number "+ flightNumber +" is Invalid");
		}
		int num = Integer.parseInt(flightNumber.substring(3));
		if(num < 1000 || num > 9999) {
			throw new InvalidFlightException("The Flight Number "+ flightNumber +" is Invalid");
		}
		return true;
	}
	
	public boolean validateFlightName(String flightName) throws InvalidFlightException{
		if((!flightName.equals("SpiceJet")&&
				!flightName.equals("Vistara")&&
				!flightName.equals("IndiGo")&&
				!flightName.equals("Air Arabia"))) {
			throw new InvalidFlightException("The Flight Name "+ flightName + " is not valid");
		}
		return true;
	}
	
	public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{
		int maxCapacity = 0;
		
		switch(flightName) {
		case "SpiceJet":
			maxCapacity = 396;
			break;
		case "Vistara":
			maxCapacity = 615;
			break;
		case "IndiGo":
			maxCapacity = 230;
			break;
		case "Air Arabia":
			maxCapacity = 130;
			break;
		}
		if(passengerCount <= 0 || passengerCount > maxCapacity) {
			throw new InvalidFlightException("The passenger count " + passengerCount + " is Invalid for " + flightName);
		}
		return true;
	}
	public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		int maxFuel = 0;
		
		switch(flightName) {
		case "SpiceJet":
			maxFuel = 200000;
			break;
		case "Vistara":
			maxFuel = 300000;
			break;
		case "IndiGo":
			maxFuel = 250000;
			break;
		case "Air Arabia":
			maxFuel = 150000;
			break;
		}
		if(currentFuelLevel < 0 || currentFuelLevel > maxFuel) {
			throw new InvalidFlightException("Invalid Fuel level for " + flightName);
		}
		return maxFuel - currentFuelLevel;
	}
}
