import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Users {
    private String name;
    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}


public class ListToJson {
    public static void main(String[] args) throws Exception {

        List<Users> users = Arrays.asList(
                new Users("Amit", 22),
                new Users("Neha", 28)
        );

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(users);

        System.out.println(json);
    }
}
