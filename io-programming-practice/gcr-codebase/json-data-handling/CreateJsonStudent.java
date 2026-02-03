
import org.json.JSONObject;

public class CreateJsonStudent {
	public static void main(String args[]) {
		JSONObject json = new JSONObject();
		json.put("name" , "Harsh");
		json.put("age", 35);
		String[] subjects = {"maths", "science", "cs"};
		json.put("subjects" , subjects);
		System.out.println(json.toString());
	}
}
