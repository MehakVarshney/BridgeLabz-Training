package com.training.AddressBook;

public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // UC-7: Duplicate Entry Check using Name
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Contact contact = (Contact) obj;

        return this.firstName != null
                && this.lastName != null
                && this.firstName.equals(contact.firstName)
                && this.lastName.equals(contact.lastName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    // UC-11 & UC-12: Display Contact
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
               ", City: " + city +
               ", State: " + state +
               ", Zip: " + zip +
               ", Phone: " + phoneNumber +
               ", Email: " + email;
    }
}
