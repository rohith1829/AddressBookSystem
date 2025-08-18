package addressbook;



import java.util.ArrayList;

public class AddressBook {
    // Use ArrayList to store Contact objects
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Method to add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Method to display all contacts
    public void displayContacts() {
        System.out.println("Contacts in this Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
