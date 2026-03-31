import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

public class FilterUsers {
    public static void main(String[] args) throws Exception {

        String json = "[{\"name\":\"Amit\",\"age\":22},{\"name\":\"Neha\",\"age\":28}]";

        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> users =
                mapper.readValue(json, new TypeReference<List<Map<String,Object>>>(){});

        users.stream()
             .filter(u -> (Integer) u.get("age") > 25)
             .forEach(System.out::println);
    }
}
