package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    // Make scanner and addressBook class-level variables
    private static Scanner scanner = new Scanner(System.in);
    private static AddressBook myAddressBook = new AddressBook();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    System.out.print("Enter the first name of the contact to edit: ");
                    String nameToEdit = scanner.nextLine();
                    myAddressBook.editContact(nameToEdit);
                    break;
                case 3:
                    System.out.print("Enter the first name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    myAddressBook.deleteContact(nameToDelete);
                    break;
                case 4:
                    myAddressBook.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // New method to handle adding a contact from console input
    private static void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
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
        myAddressBook.addContact(newContact);
        System.out.println("Contact added successfully.");
    }
}