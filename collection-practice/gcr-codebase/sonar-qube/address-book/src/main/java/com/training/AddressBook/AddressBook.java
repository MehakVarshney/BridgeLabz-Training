package com.training.AddressBook;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class AddressBook {

    private ArrayList<Contact> contactList = new ArrayList<>();

    // =========================
    // UC-5 & UC-7 : Add Contact
    // =========================
    public void addContact(Contact newContact) {

        if (contactList.contains(newContact)) {
            System.out.println("Duplicate Entry Found. Contact not added.");
        } else {
            contactList.add(newContact);
            System.out.println("Contact added");
        }
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    // =========================
    // UC-3 : Edit Contact
    // =========================
    public void findContact(String name) {

        Scanner sc = new Scanner(System.in);

        for (Contact contact : contactList) {
            if (contact.getFirstName().equals(name)) {

                System.out.print("Enter New Last Name: ");
                contact.setLastName(sc.nextLine());

                System.out.print("Enter New Address: ");
                contact.setAddress(sc.nextLine());

                System.out.print("Enter New City: ");
                contact.setCity(sc.nextLine());

                System.out.print("Enter New State: ");
                contact.setState(sc.nextLine());

                System.out.print("Enter New Zip: ");
                contact.setZip(sc.nextLine());

                System.out.print("Enter New Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());

                System.out.print("Enter New Email: ");
                contact.setEmail(sc.nextLine());

                System.out.println("Contact Updated");
                break;
            }
        }
    }

    // =========================
    // UC-4 : Delete Contact
    // =========================
    public void deleteContact(String name) {

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName().equals(name)) {
                contactList.remove(i);
                System.out.println("Contact Deleted");
                break;
            }
        }
    }

    // =========================
    // UC-11 : Sort by Name
    // =========================
    public void sortByName() {

        Collections.sort(contactList, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.getFirstName().compareTo(c2.getFirstName());
            }
        });

        for (Contact c : contactList) {
            System.out.println(c);
        }
    }

    // =========================
    // UC-12 : Sort by City / State / Zip
    // =========================
    public void sortByCity() {
        Collections.sort(contactList, (c1, c2) -> c1.getCity().compareTo(c2.getCity()));
        contactList.forEach(System.out::println);
    }

    public void sortByState() {
        Collections.sort(contactList, (c1, c2) -> c1.getState().compareTo(c2.getState()));
        contactList.forEach(System.out::println);
    }

    public void sortByZip() {
        Collections.sort(contactList, (c1, c2) -> c1.getZip().compareTo(c2.getZip()));
        contactList.forEach(System.out::println);
    }

    // =========================
    // UC-13 : File IO (TXT)
    // =========================
    public void writeToFile() {

        try (FileWriter writer = new FileWriter("AddressBook.txt")) {

            for (Contact contact : contactList) {
                writer.write(contact.toString() + "\n");
            }

            System.out.println("Contacts written to file");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    public void readFromFile() {

        try (FileReader reader = new FileReader("AddressBook.txt")) {

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }

    // =========================
    // UC-14 : CSV using OpenCSV
    // =========================
    public void writeToCSV() {

        try (CSVWriter writer = new CSVWriter(new FileWriter("AddressBook.csv"))) {

            String[] header = {
                "FirstName", "LastName", "Address",
                "City", "State", "Zip", "Phone", "Email"
            };
            writer.writeNext(header);

            for (Contact c : contactList) {
                String[] data = {
                    c.getFirstName(),
                    c.getLastName(),
                    c.getAddress(),
                    c.getCity(),
                    c.getState(),
                    c.getZip(),
                    c.getPhoneNumber(),
                    c.getEmail()
                };
                writer.writeNext(data);
            }

            System.out.println("Contacts written to CSV file");

        } catch (IOException e) {
            System.out.println("Error writing CSV file");
        }
    }

    public void readFromCSV() {

        try (CSVReader reader = new CSVReader(new FileReader("AddressBook.csv"))) {

            reader.readNext(); // skip header
            String[] line;

            while ((line = reader.readNext()) != null) {
                System.out.println(line[0] + " " + line[1] + " - " + line[3]);
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV file");
        }
    }

    // =========================
    // UC-15 : JSON File (Gson)
    // =========================
    public void writeToJson() {

        try (FileWriter writer = new FileWriter("AddressBook.json")) {

            Gson gson = new Gson();
            gson.toJson(contactList, writer);
            System.out.println("Contacts written to JSON file");

        } catch (IOException e) {
            System.out.println("Error writing JSON file");
        }
    }

    public void readFromJson() {

        try (FileReader reader = new FileReader("AddressBook.json")) {

            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Contact>>() {}.getType();
            ArrayList<Contact> list = gson.fromJson(reader, type);

            for (Contact c : list) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.out.println("Error reading JSON file");
        }
    }
}
