import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class ObjectToJson {

    public static void main(String[] args) throws Exception {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Amit", 22));
        people.add(new Person("Neha", 28));
        people.add(new Person("Rahul", 30));

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper.writeValueAsString(people);

        System.out.println(jsonArray);
    }
}
