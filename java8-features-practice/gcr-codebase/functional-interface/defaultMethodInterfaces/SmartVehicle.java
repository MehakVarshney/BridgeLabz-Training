package defaultMethodInterfaces;
interface Vehicle {
	void displaySpeed();
}

interface ElectricVehicle extends Vehicle {

	default void displayPercentage() {
		int battery = (int) (Math.random() * 100);
		System.out.println("Battery Percentage: " + battery + "%");
	}
}

class Car implements Vehicle {
	String name;

	public Car(String name) {
		this.name = name;
	}

	public void displaySpeed() {
		int speed = (int) (Math.random() * 120);
		System.out.println(name);
		System.out.println("Speed: " + speed + " km/h");
	}
}

class ElectricCar implements ElectricVehicle {
	String name;

	public ElectricCar(String name) {
		this.name = name;
	}

	public void displaySpeed() {
		int speed = (int) (Math.random() * 100);
		System.out.println(name);
		System.out.println("Speed: " + speed + " km/h");
	}
}

public class SmartVehicle {
	public static void main(String[] args) {

		Car honda = new Car("Honda");
		honda.displaySpeed();

		System.out.println();

		ElectricCar ev = new ElectricCar("Nexon EV");
		ev.displaySpeed();
		ev.displayPercentage();
	}
}
