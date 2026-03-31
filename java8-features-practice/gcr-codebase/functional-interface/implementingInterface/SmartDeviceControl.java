package implementingInterface;

interface SmartDevice {
	void turnOn();
	void turnOff();
}

class AirConditioner implements SmartDevice {
	public void turnOn() {
		System.out.println("Air Conditioner turns ON");
	}

	public void turnOff() {
		System.out.println("Air Conditioner turns OFF");
	}
}

class Lights implements SmartDevice {
   public void turnOn() {
       System.out.println("Lights turn ON");
   }

   public void turnOff() {
       System.out.println("Lights turn OFF");
   }
}

class Television implements SmartDevice {
   public void turnOn() {
       System.out.println("Television turns ON");
   }

   @Override
   public void turnOff() {
       System.out.println("Television turns OFF");
   }
}


public class SmartDeviceControl {
	public static void main(String[] args) {
				SmartDevice ac = new AirConditioner();
				SmartDevice lights = new Lights();
				SmartDevice tv = new Television();

				ac.turnOn();
				ac.turnOff();

				lights.turnOn();
				lights.turnOff();

				tv.turnOn();
				tv.turnOff();
			}
}

