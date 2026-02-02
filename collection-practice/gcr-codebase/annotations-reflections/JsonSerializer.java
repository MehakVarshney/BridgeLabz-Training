import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object object) throws IllegalAccessException {

        Class<?> clazz = object.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);

                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();
                Object value = field.get(object);

                if (!firstField) {
                    json.append(", ");
                }

                json.append("\"").append(jsonKey).append("\": ");

                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }

                firstField = false;
            }
        }

        json.append("}");
        return json.toString();
    }
}
