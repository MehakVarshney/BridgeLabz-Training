package com.training.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();
    private Map<String, ArrayList<Contact>> cityMap = new HashMap<>();
    private Map<String, ArrayList<Contact>> stateMap = new HashMap<>();

    // UC-6
    public void addAddressBook(String name, AddressBook addressBook) {
        addressBookMap.put(name, addressBook);
    }

    // UC-8 / UC-9
    public void buildDictionary() {

        for (AddressBook addressBook : addressBookMap.values()) {
            for (Contact contact : addressBook.getContactList()) {

                cityMap.computeIfAbsent(contact.getCity(), k -> new ArrayList<>()).add(contact);
                stateMap.computeIfAbsent(contact.getState(), k -> new ArrayList<>()).add(contact);
            }
        }
    }

    // UC-9
    public void viewByCity(String city) {
        ArrayList<Contact> list = cityMap.get(city);
        if (list != null) {
            for (Contact c : list) System.out.println(c);
        }
    }

    public void viewByState(String state) {
        ArrayList<Contact> list = stateMap.get(state);
        if (list != null) {
            for (Contact c : list) System.out.println(c);
        }
    }

    // UC-10
    public void countByCity(String city) {
        ArrayList<Contact> list = cityMap.get(city);
        System.out.println(list == null ? "0" : list.size());
    }

    public void countByState(String state) {
        ArrayList<Contact> list = stateMap.get(state);
        System.out.println(list == null ? "0" : list.size());
    }
}
