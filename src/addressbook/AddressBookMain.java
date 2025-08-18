package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook myAddressBook = new AddressBook();

        // Create a default contact to edit
        Contact defaultContact = new Contact("John", "Doe", "123 Main St", "Anytown", "Anystate", "12345", "555-1234", "john.doe@email.com");
        myAddressBook.addContact(defaultContact);


        System.out.println("Initial contact added:");
        myAddressBook.displayContacts();
        System.out.println("-------------------------");

        System.out.print("Enter the first name of the contact to edit: ");
        String nameToEdit = scanner.nextLine();
        myAddressBook.editContact(nameToEdit);

        System.out.println("-------------------------");
        System.out.println("Contact after editing:");
        myAddressBook.displayContacts();

        scanner.close();
    }
}