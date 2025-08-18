package addressbook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    // Use a HashMap to store multiple Address Books by name
    private static HashMap<String, AddressBook> addressBookSystem = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. List Address Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addNewAddressBook();
                    break;
                case 2:
                    selectAddressBook();
                    break;
                case 3:
                    listAddressBooks();
                    break;
                case 4:
                    System.out.println("Exiting System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewAddressBook() {
        System.out.print("Enter the name for the new Address Book: ");
        String name = scanner.nextLine();
        if (addressBookSystem.containsKey(name)) {
            System.out.println("An Address Book with this name already exists.");
        } else {
            addressBookSystem.put(name, new AddressBook());
            System.out.println("Address Book '" + name + "' created successfully.");
        }
    }

    private static void listAddressBooks() {
        if (addressBookSystem.isEmpty()) {
            System.out.println("No Address Books in the system.");
        } else {
            System.out.println("Available Address Books:");
            for (String name : addressBookSystem.keySet()) {
                System.out.println("- " + name);
            }
        }
    }

    private static void selectAddressBook() {
        listAddressBooks();
        if (addressBookSystem.isEmpty()) {
            return;
        }
        System.out.print("Enter the name of the Address Book to select: ");
        String name = scanner.nextLine();

        if (addressBookSystem.containsKey(name)) {
            AddressBook currentAddressBook = addressBookSystem.get(name);
            contactMenu(currentAddressBook);
        } else {
            System.out.println("Address Book not found.");
        }
    }

    private static void contactMenu(AddressBook addressBook) {
        while (true) {
            System.out.println("\n--- Contact Menu for " + addressBook + " ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact(addressBook);
                    break;
                case 2:
                    System.out.print("Enter the first name of the contact to edit: ");
                    String nameToEdit = scanner.nextLine();
                    addressBook.editContact(nameToEdit);
                    break;
                case 3:
                    System.out.print("Enter the first name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    addressBook.deleteContact(nameToDelete);
                    break;
                case 4:
                    addressBook.displayContacts();
                    break;
                case 5:
                    return; // Return to the main menu
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addContact(AddressBook addressBook) {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        // ... (rest of the prompts for contact details are the same)
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        System.out.print("Enter State: ");
        String state = scanner.nextLine();
        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.addContact(newContact);
        System.out.println("Contact added successfully.");
    }
}