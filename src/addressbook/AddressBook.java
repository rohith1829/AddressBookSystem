package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // addContact method (already exists)
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // displayContacts method (already exists)
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }
        System.out.println("Contacts in this Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    // editContact method (already exists)
    public void editContact(String firstName) {
        Contact contactToEdit = null;
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contactToEdit = contact;
                break;
            }
        }

        if (contactToEdit == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Editing contact: " + contactToEdit);
        System.out.print("Enter new Last Name: ");
        contactToEdit.setLastName(scanner.nextLine());
        System.out.print("Enter new Address: ");
        contactToEdit.setAddress(scanner.nextLine());
        System.out.print("Enter new City: ");
        contactToEdit.setCity(scanner.nextLine());
        System.out.print("Enter new State: ");
        contactToEdit.setState(scanner.nextLine());
        System.out.print("Enter new Zip: ");
        contactToEdit.setZip(scanner.nextLine());
        System.out.print("Enter new Phone Number: ");
        contactToEdit.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter new Email: ");
        contactToEdit.setEmail(scanner.nextLine());

        System.out.println("Contact updated successfully.");
    }

    // --- New Method to Delete a Contact ---
    public void deleteContact(String firstName) {
        boolean isRemoved = contacts.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(firstName));

        if (isRemoved) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}