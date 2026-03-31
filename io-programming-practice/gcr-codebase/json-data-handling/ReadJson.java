
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

class User{
	String name;
	String email;
	
	public User() {}
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
}

public class ReadJson {
	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			User user = objectMapper.readValue(new FileReader("user.json"), User.class);
			
			System.out.println(user.name);
			System.out.println(user.email);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
