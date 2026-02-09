package com.training.AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AddressBookSystem system = new AddressBookSystem();

		AddressBook ab1 = new AddressBook();
		Contact c1 = new Contact();
		c1.setFirstName("John");
		c1.setLastName("Doe");
		c1.setCity("Pune");
		c1.setState("MH");
		ab1.addContact(c1);

		AddressBook ab2 = new AddressBook();
		Contact c2 = new Contact();
		c2.setFirstName("Anya");
		c2.setLastName("Patel");
		c2.setCity("Pune");
		c2.setState("GJ");
		ab2.addContact(c2);

		system.addAddressBook("Book1", ab1);
		system.addAddressBook("Book2", ab2);

		system.buildDictionary();

		System.out.print("Count by (city/state): ");
		String option = sc.nextLine();

		if (option.equals("city")) {
			System.out.print("Enter City: ");
			system.countByCity(sc.nextLine());
		} else {
			System.out.print("Enter State: ");
			system.countByState(sc.nextLine());
		}

		System.out.print("Sort by name? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.sortByName();
		}

		System.out.print("Sort by (city/state/zip): ");
		String sortChoice = sc.nextLine();

		if (sortChoice.equals("city"))
			ab1.sortByCity();
		else if (sortChoice.equals("state"))
			ab1.sortByState();
		else if (sortChoice.equals("zip"))
			ab1.sortByZip();

		System.out.print("Do you want to write contacts to file? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.writeToFile();
		}

		System.out.print("Do you want to read contacts from file? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.readFromFile();
		}

		System.out.print("Write contacts to CSV file? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.writeToCSV();
		}

		System.out.print("Read contacts from CSV file? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.readFromCSV();
		}

		System.out.print("Write contacts to JSON file? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.writeToJson();
		}

		System.out.print("Read contacts from JSON file? (yes/no): ");
		if (sc.nextLine().equalsIgnoreCase("yes")) {
			ab1.readFromJson();
		}

	}
}
