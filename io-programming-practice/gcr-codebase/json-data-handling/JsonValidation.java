import com.fasterxml.jackson.databind.ObjectMapper;

class Persons {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class JsonValidation {

	public static void main(String[] args) {

		String json = "{ \"name\": \"Amit\", \"age\": 25 }";

		ObjectMapper mapper = new ObjectMapper();

		try {
			Persons person = mapper.readValue(json, Persons.class);
			System.out.println(" JSON matches expected structure");
		} catch (Exception e) {
			System.out.println("JSON does NOT match expected structure");
		}
	}
}
