package com.AddressBook;

import java.util.*;
import java.io.*;

import com.opencsv.CSVWriter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


public class AddressBook {
	
    private List<ContactPerson> contacts = new ArrayList<>();

    public void addContact(ContactPerson person) {

        if (contacts.contains(person)) {
            System.out.println("Duplicate contact not allowed");
            return;
        }

        contacts.add(person);
        System.out.println("Contact added successfully");
    }

    public void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }

        for (ContactPerson p : contacts) {
            System.out.println(p);
        }
    }
    public void editContact(String firstName) {

        Scanner sc = new Scanner(System.in);

        for (ContactPerson p : contacts) {

            if (p.getFirstName().equalsIgnoreCase(firstName)) {

                System.out.println("Edit Options:");
                System.out.println("1. Address");
                System.out.println("2. City");
                System.out.println("3. State");
                System.out.println("4. Phone");
                System.out.println("5. Email");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("New Address: ");
                        p.setAddress(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("New City: ");
                        p.setCity(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("New State: ");
                        p.setState(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("New Phone: ");
                        p.setPhone(sc.nextLine());
                        break;
                    case 5:
                        System.out.print("New Email: ");
                        p.setEmail(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }

                System.out.println("Contact updated successfully");
                return;
            }
        }

        System.out.println("Contact not found");
    }

    public void deleteContact(String firstName) {

        boolean removed = contacts.removeIf(
                p -> p.getFirstName().equalsIgnoreCase(firstName)
        );

        System.out.println(removed ? "Contact deleted" : "Contact not found");
    }

    public void searchByCity(String city) {

        boolean found = false;

        for (ContactPerson p : contacts) {
            if (p.toString().toLowerCase().contains(city.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found)
            System.out.println("No contacts found in " + city);
    }

    public void countByCity(String city) {

        int count = 0;

        for (ContactPerson p : contacts) {
            if (p.toString().toLowerCase().contains(city.toLowerCase())) {
                count++;
            }
        }

        System.out.println("Total contacts in " + city + " : " + count);
    }

    public void sortByName() {

        Collections.sort(contacts,
                (p1, p2) -> p1.getFirstName()
                        .compareToIgnoreCase(p2.getFirstName()));

        System.out.println("Sorted by name");
    }

    public void sortByCity() {

        Collections.sort(contacts,
                (p1, p2) -> p1.toString()
                        .compareToIgnoreCase(p2.toString()));

        System.out.println("Sorted by city");
    }

    public void writeToFile(String fileName) {

        try (FileWriter writer = new FileWriter(fileName)) {

            for (ContactPerson p : contacts) {
                writer.write(p.toString() + "\n");
            }

            System.out.println("Written to file successfully");

        } catch (IOException e) {
            System.out.println("File write error");
        }
    }

    public void readFromFile(String fileName) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File read error");
        }
    }

    public void writeToCSV(String fileName) {

        try (CSVWriter writer =
                     new CSVWriter(new FileWriter(fileName))) {

            writer.writeNext(new String[]{
                    "FirstName","LastName","Address",
                    "City","State","Zip","Phone","Email"
            });

            for (ContactPerson p : contacts) {
                writer.writeNext(new String[]{
                        p.getFirstName(),"","","","","","",""
                });
            }

            System.out.println("Written to CSV successfully");

        } catch (Exception e) {
            System.out.println("CSV write error");
        }
    }

    public void writeToJSON(String fileName) {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter(fileName)) {

            gson.toJson(contacts, writer);
            System.out.println("Written to JSON successfully");

        } catch (Exception e) {
            System.out.println("JSON write error");
        }
    }

    public void readFromJSON(String fileName) {

        Gson gson = new Gson();

        try (FileReader reader = new FileReader(fileName)) {

            Type type = new TypeToken<List<ContactPerson>>(){}.getType();
            List<ContactPerson> list = gson.fromJson(reader, type);

            for (ContactPerson p : list) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.out.println("JSON read error");
        }
    }
}
