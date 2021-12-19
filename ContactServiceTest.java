package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Contact.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Doe", "9999999999", "21 Jane St, Janestown, NJ", "54321");
		assertAll(
				"service",
				() -> assertEquals("Jane", service.getContactList().get(0).getFirstName()),
				() -> assertEquals("Doe", service.getContactList().get(0).getLastName()),
				() -> assertEquals("9999999999", service.getContactList().get(0).getPhone()),
				() -> assertEquals("21 Jane St, Janestown, NJ", service.getContactList().get(0).getAddress()),
				() -> assertEquals("54321", service.getContactList().get(0).getId()));
	}

	@Test
	void testUpdateContact() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Doe", "9999999999", "21 Jane St, Janestown, NJ", "54321");
		service.updateContact("Kelly", "Mars", "7478559865", "1066 Adams Rd, Cary, NC", "54321");
		assertAll(
				"service",
				() -> assertEquals("Kelly", service.getContactList().get(0).getFirstName()),
				() -> assertEquals("Mars", service.getContactList().get(0).getLastName()),
				() -> assertEquals("7478559865", service.getContactList().get(0).getPhone()),
				() -> assertEquals("1066 Adams Rd, Cary, NC", service.getContactList().get(0).getAddress()),
				() -> assertEquals("54321", service.getContactList().get(0).getId()));
		//fail("Not yet implemented");
	}
	
	@Test
	void testDelContact() {
		ContactService service = new ContactService();
		service.addContact("Jane", "Doe", "9999999999", "21 Jane St, Janestown, NJ", "54321");
		service.delContact("54321");
		double size = service.getContactsize();
		double val = 0;
		assertEquals(size, val);
	//	fail("Not yet implemented");
	}

	

}
