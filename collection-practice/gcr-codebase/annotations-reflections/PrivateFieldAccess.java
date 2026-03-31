import java.lang.reflect.Field;

public class PrivateFieldAccess {

    public static void main(String[] args) throws Exception {

        Person person = new Person();

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true); // bypass private access

        ageField.set(person, 25); // modify value

        int age = (int) ageField.get(person); // retrieve value
        System.out.println("Age: " + age);
    }
}
