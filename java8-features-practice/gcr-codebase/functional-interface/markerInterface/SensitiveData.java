package markerInterface;

interface Sensitive{
	
}
class User implements Sensitive {
	String name;
	String password;
	
	public User(String name , String password) {
		this.name = name;
		this.password = password;
	}
}
public class SensitiveData {
	public static void main(String args[]) {
		User u1 = new User("harit patel", "harit@789");
		if(u1 instanceof Sensitive) {
			System.out.println("Data is sensitive");
		} else {
			System.out.println("data is not");
		}
	}
}
