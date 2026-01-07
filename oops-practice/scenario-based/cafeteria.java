import java.util.Scanner;

class CafeteriaMenu {

    static String[] items = {
            "Burger", "Pizza", "Sandwich", "Pasta", "Noodles",
            "Coffee", "Tea", "Juice", "Cake", "Ice Cream"
    };

    static void displayMenu() {
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " : " + items[i]);
        }
    }

    static String getItemByIndex(int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        return "Invalid Selection";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayMenu();
        System.out.print("Select item index: ");
        int choice = sc.nextInt();

        System.out.println("You selected: " + getItemByIndex(choice));
    }
}
