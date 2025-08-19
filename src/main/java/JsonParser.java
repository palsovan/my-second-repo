import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

public class JsonParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static JsonNode parse(String json) throws IOException {
        return objectMapper.readTree(json);
    }

    public static <T> T parseObject(String json, Class<T> valueType) throws IOException {
        return objectMapper.readValue(json, valueType);
    }

    public static String toJson(Object obj) throws IOException {
        return objectMapper.writeValueAsString(obj);
    }

    public static void main(String[] args) {
        String jsonString = "{\"name\":\"John Doe\",\"age\":30,\"city\":\"New York\"}";
        
        try {
            JsonNode jsonNode = parse(jsonString);
            System.out.println("Parsed JSON: " + jsonNode);

            Person person = parseObject(jsonString, Person.class);
            System.out.println("Parsed Person object: " + person);

            String newJsonString = toJson(person);
            System.out.println("Object to JSON: " + newJsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Person {
        public String name;
        public int age;
        public String city;

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
        }
    }
}