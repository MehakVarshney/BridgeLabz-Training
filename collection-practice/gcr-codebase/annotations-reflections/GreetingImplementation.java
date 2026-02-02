public class GreetingImplementation implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
