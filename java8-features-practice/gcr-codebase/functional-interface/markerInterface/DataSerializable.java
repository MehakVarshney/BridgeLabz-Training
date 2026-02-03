package markerInterface;

import java.io.Serializable;

class UserData implements Serializable{
	private String userName;
	private int age;
	
	public UserData(String userName , int age) {
		this.userName = userName;
		this.age = age;
	}
}
public class DataSerializable {
	public static void main(String args[]) {
		UserData user = new UserData("harit789", 45);
		if(user instanceof Serializable) {
			System.out.println("Object is eligible for backup ");
		} else {
			System.out.println("Object is not eligible for backup");
		}
	}
}
