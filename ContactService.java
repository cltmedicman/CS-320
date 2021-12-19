package Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	private List<Contact> contacts = new ArrayList<>();
	
	public void addContact(String firstName, String lastName, String phone, String address, String id) {
		Contact contact = new Contact(firstName, lastName, phone, address, id);
		contacts.add(contact);
	}
	
	public void delContact(String id) {
		int result = 0;;
		for ( int i = 0; i < contacts.size(); i++) {
			if (id.compareTo(contacts.get(i).getId()) == 0) {
				result = i;
			}
		}
		contacts.remove(result);
	}
	
	public void updateContact(String firstName, String lastName, String phone, String address, String id) {
		for (Contact contact: contacts) {
			if (contact.getId().equals(id)) {
				if (!firstName.equals("")) {
					contact.setFirstName(firstName);
				}
				if (!lastName.equals("")) {
					contact.setLastName(lastName);
				}
				if (!phone.equals("")) {
					contact.setPhone(phone);
				}
				if (!address.equals("")) {
					contact.setAddress(address);
				}
			}
		}
	}
	
	public List<Contact> getContactList() {return contacts;}
	
	public int getContactsize() {
		return contacts.size();
	}
	}