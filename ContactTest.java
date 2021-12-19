package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact1 = new Contact("John", "Smith", "5555555555", "109 John St, Johnstown, JN", "12345");
		assertTrue(contact1.getFirstName().equals("John"));
		assertTrue(contact1.getLastName().equals("Smith"));
		assertTrue(contact1.getPhone().equals("5555555555"));
		assertTrue(contact1.getAddress().equals("109 John St, Johnstown, JN"));
		assertTrue(contact1.getId().equals("12345"));
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("JohnSmith 12345", "Smith", "5555555555", "109 John St, Johnstown, JN", "12345");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith,John 12345", "5555555555", "109 John St, Johnstown, JN", "12345");
		});
	}
	
	@Test
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", "5555555555123", "109 John St, Johnstown, JN", "12345");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", "5555555555", "109 John St, Johnstown, New Hampshire", "12345");
		});
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("John", "Smith", "5555555555", "109 John St, Johnstown, JN", "12345678910");
		});
	}

}
