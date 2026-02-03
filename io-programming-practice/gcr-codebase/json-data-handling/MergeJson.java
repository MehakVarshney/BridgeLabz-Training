import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {

    public static void main(String[] args) throws Exception {

        String json1 = "{ \"name\": \"Amit\", \"age\": 25 }";
        String json2 = "{ \"city\": \"Pune\", \"age\": 30 }";

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node1 = mapper.readTree(json1);
        JsonNode node2 = mapper.readTree(json2);

        ObjectNode merged = ((ObjectNode) node1);

        merged.setAll((ObjectNode) node2);

        System.out.println(merged.toPrettyString());
    }
}
