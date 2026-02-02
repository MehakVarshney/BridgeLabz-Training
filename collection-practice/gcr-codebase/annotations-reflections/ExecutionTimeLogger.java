import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void main(String[] args) throws Exception {

        PerformanceService service = new PerformanceService();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long startTime = System.nanoTime();

                method.invoke(service);   // execute method

                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;

                System.out.println(
                    method.getName() + " executed in " +
                    executionTime + " ns"
                );
            }
        }
    }
}
