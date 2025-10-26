package edu.snhu.cs320.contacts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testValidContactCreation() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
		assertEquals("12345", contact.getContactID());
		assertEquals("John", contact.getFirstName());
		assertEquals("Doe", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Main St", contact.getAddress());
	}
	
	@Test
	void testInvalidContactID() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
		});
	
	}
	
	@Test
	void testUpdatePhone() {
		Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
		contact.setPhone("0987654321");
		assertEquals("0987654321", contact.getPhone());
	}

}
