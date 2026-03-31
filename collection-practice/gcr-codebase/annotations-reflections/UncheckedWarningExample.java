import java.util.ArrayList;

public class UncheckedWarningExample {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // raw type

        list.add("Hello");
        list.add(100);

        String value = (String) list.get(0);
        System.out.println(value);
    }
}
