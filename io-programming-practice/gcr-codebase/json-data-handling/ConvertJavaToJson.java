
import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
	private String carName;
	private String model;
	private int carNumber;
	
	public Car(String carName, String model, int carNumber) {
		this.carName = carName;
		this.model = model;
		this.carNumber = carNumber;
	}
	
	public String getCarName() {
		return carName;
	}

	public String getModel() {
		return model;
	}

	public int getCarNumber() {
		return carNumber;
	}
}

public class ConvertJavaToJson {
	public static void main(String args[]) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Car car = new Car("alto", "maruti", 1010);
			String jsonString = objectMapper.writeValueAsString(car);
			System.out.println(jsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
