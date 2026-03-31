public class Service {

    @ImportantMethod
    public void processData() {
        System.out.println("Processing data");
    }

    @ImportantMethod(level = "MEDIUM")
    public void validateData() {
        System.out.println("Validating data");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}
