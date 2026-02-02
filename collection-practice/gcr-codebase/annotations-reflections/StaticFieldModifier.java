import java.lang.reflect.Field;

public class StaticFieldModifier {

    public static void main(String[] args) throws Exception {

        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_SECRET_KEY"); // null because static

        System.out.println("Updated API Key: " + Configuration.getApiKey());
    }
}
