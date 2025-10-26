package edu.snhu.cs320.contacts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
	
	}
	
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12345", "Jane", "Doe", "1234567890", "456 Main St");
		service.addContact(contact);;
		service.deleteContact("12345");
		assertThrows(IllegalArgumentException.class, () -> service.deleteContact("12345"));
	}
	
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		Contact contact = new Contact("12345", "Jane", "Doe", "1234567890", "456 Main St");
		service.addContact(contact);;
		service.updateFirstName("12345", "Janet");
		assertEquals("Janet", contact.getFirstName());
	}

}
