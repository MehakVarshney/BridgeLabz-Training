package com.AddressBook;

import java.util.Scanner;
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        addressBook.addContact(new ContactPerson(
                "Mehak", "Varshney", "MG Road",
                "Delhi", "Delhi", "110001",
                "9876543210", "mehak@gmail.com"
        ));

        while (true) {

            System.out.println("\n1. Display");
            System.out.println("2. Edit");
            System.out.println("3. Delete");
            System.out.println("4. Search by City");
            System.out.println("5. Count by City");
            System.out.println("6. Sort by Name");
            System.out.println("7. Save to File");
            System.out.println("8. Save to CSV");
            System.out.println("9. Save to JSON");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addressBook.displayContacts();
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    addressBook.editContact(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    addressBook.deleteContact(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter city: ");
                    addressBook.searchByCity(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter city: ");
                    addressBook.countByCity(sc.nextLine());
                    break;
                case 6:
                    addressBook.sortByName();
                    addressBook.displayContacts();
                    break;
                case 7:
                    addressBook.writeToFile("addressbook.txt");
                    break;
                case 8:
                    addressBook.writeToCSV("addressbook.csv");
                    break;
                case 9:
                    addressBook.writeToJSON("addressbook.json");
                    addressBook.readFromJSON("addressbook.json");
                    break;
                case 10:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
