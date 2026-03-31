import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        System.out.println("Welcome to Coffee Counter Chronicles!");
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Enter the type of coffee (espresso/latte/cappuccino) or 'exit' to quit:");
            String coffeeType = sc.nextLine().toLowerCase().trim();
            if (coffeeType.equals("exit")) { 
                System.out.println("Thank you for visiting Coffee Counter Chronicles! Goodbye!");
                break;
            }
            double price = 0.0;
            switch (coffeeType) { 
                case "espresso":
                    price = 2.50;
                    System.out.println("You ordered an Espresso. A strong choice!");
                    break;
                case "latte":
                    price = 3.50;
                    System.out.println("You ordered a Latte. Smooth and creamy!");
                    break;
                case "cappuccino":
                    price = 3.00;
                    System.out.println("You ordered a Cappuccino. A perfect blend of espresso, steamed milk, and foam!");
                    break;
                default:
                    System.out.println("Sorry, we don't have that type of coffee. Please choose espresso, latte, or cappuccino.");
                    continue;
            }
            System.err.print("Enter the quantity:");
            int quantity = sc.nextInt();
            sc.nextLine(); 
            double totalCost = price * quantity;
            double gst = Math.round(totalCost * 0.18*100)/100.0; // 18% GST
            double finalAmount = totalCost + gst;
            System.out.println("======COFFEE COUNTER CHRONICLES======");
            System.out.println("-------------------------------------");
            System.out.println("Coffee Type              : " + coffeeType);
            System.out.println("Quantity                 : " + quantity);
            System.err.println("Total cost (before GST)  : $" + totalCost);
            System.out.println("GST (18%)                : $" + gst);
            System.out.println("-------------------------------------");
            System.out.println("Final Amount to be paid  : $" + finalAmount);
            System.out.println("-------------------------------------");
        }
    }
}