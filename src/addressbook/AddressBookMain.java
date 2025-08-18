package addressbook;



public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        // Create a new AddressBook
        AddressBook myAddressBook = new AddressBook();

        // Create a new Contact
        Contact newContact = new Contact("John", "Doe", "123 Main St", "Anytown", "Anystate", "12345", "555-1234", "john.doe@email.com");

        // Add the contact to the AddressBook
        myAddressBook.addContact(newContact);

        // Display the contacts
        myAddressBook.displayContacts();
    }
}
