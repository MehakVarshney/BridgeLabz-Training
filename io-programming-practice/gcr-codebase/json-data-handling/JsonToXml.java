import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXml {
    public static void main(String[] args) throws Exception {

        String json = "{\"name\":\"Amit\",\"age\":25}";

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        Object obj = jsonMapper.readValue(json, Object.class);
        String xml = xmlMapper.writeValueAsString(obj);

        System.out.println(xml);
    }
}
