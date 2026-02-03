import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterJSON {

    public static void main(String[] args) throws Exception {

    	String json = "["
    	        + "{ \"name\": \"Amit\", \"age\": 22 },"
    	        + "{ \"name\": \"Neha\", \"age\": 28 },"
    	        + "{ \"name\": \"Rahul\", \"age\": 30 },"
    	        + "{ \"name\": \"Priya\", \"age\": 24 }"
    	        + "]";


        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, Object>> users =
                mapper.readValue(json, new TypeReference<List<Map<String, Object>>>() {});

        List<Map<String, Object>> filteredUsers = users.stream()
                .filter(user -> (Integer) user.get("age") > 25)
                .collect(Collectors.toList());

        filteredUsers.forEach(System.out::println);
    }
}
