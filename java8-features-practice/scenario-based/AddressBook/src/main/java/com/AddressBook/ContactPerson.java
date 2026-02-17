package com.AddressBook;

public class ContactPerson {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	
	public ContactPerson( String firstName, String lastName, 
			String address, String city, String state, 
			String zip, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAddress(String address) {
	    this.address = address;
	}

	public void setState(String state) {
	    this.state = state;
	}

	public void setPhone(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
	    this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof ContactPerson)) {
			return false;
		}
		ContactPerson other = (ContactPerson) obj;
		
		return this.firstName.equalsIgnoreCase(other.firstName);
	}
	@Override
	public String toString() {
		return firstName + " " + lastName +
                " | " + address +
                " | " + city + ", " + state +
                " | " + phoneNumber +
                " | " + email;
    }
	
}
