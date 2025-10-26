package edu.snhu.cs320.contacts;

import java.util.HashMap;

public class ContactService {
	private HashMap<String, Contact> contacts = new HashMap<>();
	
	// Add contact
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactID())) {
			throw new IllegalArgumentException("Contact ID already exists.");
		}
		contacts.put(contact.getContactID(), contact);
	}
	
	// Delete contact by ID
	public void deleteContact(String contactID) {
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contact not found.");
		}
		contacts.remove(contactID);
	}
	
	// Update first name
	public void updateFirstName(String contactID, String newFirstName) {
		Contact contact = contacts.get(contactID);
		if (contact == null) throw new IllegalArgumentException("Contact not found.");
		contact.setFirstName(newFirstName);
	}
	
	// Update last name
	public void updateLastName(String contactID, String newLastName) {
		Contact contact = contacts.get(contactID);
		if (contact == null) throw new IllegalArgumentException("Contact not found.");
		contact.setLastName(newLastName);
	}
	
	// Update phone
	public void updatePhone(String contactID, String newPhone) {
		Contact contact = contacts.get(contactID);
		if (contact == null) throw new IllegalArgumentException("Contact not found.");
		contact.setPhone(newPhone);
	}
	
	// Update address
	public void updateAddress(String contactID, String newAddress) {
		Contact contact = contacts.get(contactID);
		if (contact == null) throw new IllegalArgumentException("Contact not found.");
		contact.setAddress(newAddress);
	}

}
