import java.lang.reflect.Method;

public class AnnotationDemo {

    public static void main(String[] args) {

        Class<Service> serviceClass = Service.class;

        for (Method method : serviceClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod annotation =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + annotation.level()
                );
            }
        }
    }
}
