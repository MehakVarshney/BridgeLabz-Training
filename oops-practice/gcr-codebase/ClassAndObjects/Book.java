import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    // Method to assign values
    void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First Book
        Book book1 = new Book();
        System.out.print("Enter title of first book: ");
        String title1 = sc.nextLine();
        System.out.print("Enter author of first book: ");
        String author1 = sc.nextLine();
        System.out.print("Enter price of first book: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); // clear buffer

        book1.setDetails(title1, author1, price1);

        // Second Book
        Book book2 = new Book();
        System.out.print("\nEnter title of second book: ");
        String title2 = sc.nextLine();
        System.out.print("Enter author of second book: ");
        String author2 = sc.nextLine();
        System.out.print("Enter price of second book: ");
        double price2 = sc.nextDouble();

        book2.setDetails(title2, author2, price2);

        // Display Output
        System.out.println();
        book1.displayDetails();
        book2.displayDetails();

        sc.close();
    }
}
