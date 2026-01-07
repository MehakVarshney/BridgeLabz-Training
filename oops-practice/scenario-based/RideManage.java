import java.util.*;

// USER 
class User {
    String name;
    User(String name) { this.name = name; }
}

//  DRIVER 
class Driver {
    String name;
    boolean available = true;
    Driver(String name) { this.name = name; }
}

//  RIDE 
class Ride {
    User user;
    Driver driver;
    double distance, fare;
    Ride(User user, Driver driver, double distance, double fare) {
        this.user = user; this.driver = driver;
        this.distance = distance; this.fare = fare;
    }
}

// INTERFACE 
interface FareCalculator {
    double calculateFare(double distance);
}

// Normal fare
class NormalFareCalculator implements FareCalculator {
    public double calculateFare(double distance) { return distance * 10; }
}

// Peak fare
class PeakFareCalculator implements FareCalculator {
    public double calculateFare(double distance) { return distance * 15; }
}


class NoDriverAvailableException extends Exception {
    NoDriverAvailableException(String msg) { super(msg); }
}


class RideService {
    List<Driver> drivers = new ArrayList<>();
    List<Ride> rideHistory = new ArrayList<>();

    void addDriver(Driver d) { drivers.add(d); }

    Driver assignDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) if (d.available) { d.available = false; return d; }
        throw new NoDriverAvailableException("No Driver Available!");
    }

    void bookRide(User u, double distance, FareCalculator calc) {
        try {
            Driver d = assignDriver();
            double fare = calc.calculateFare(distance);
            rideHistory.add(new Ride(u, d, distance, fare));
            System.out.println("Ride booked! User: " + u.name + ", Driver: " + d.name + ", Fare: ₹" + fare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    void showRideHistory() {
        System.out.println("\n--- Ride History ---");
        for (Ride r : rideHistory)
            System.out.println(r.user.name + " | " + r.driver.name + " | " + r.distance + " km | ₹" + r.fare);
    }
}


public class RideManage {
    public static void main(String[] args) {
        RideService service = new RideService();
        // Added Drivers
        service.addDriver(new Driver("Ramesh"));
        service.addDriver(new Driver("Suresh"));
        // Users ke obkjects
        User u1 = new User("Abhay");
        User u2 = new User("Rahul");
        // Fare
        FareCalculator normal = new NormalFareCalculator();
        FareCalculator peak = new PeakFareCalculator();
        // Book rides
        service.bookRide(u1, 10, normal);
        service.bookRide(u2, 5, peak);
        service.showRideHistory();
    }
}
