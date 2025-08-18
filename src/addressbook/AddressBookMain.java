package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook myAddressBook = new AddressBook();

        // Add a default contact to start with
        myAddressBook.addContact(new Contact("John", "Doe", "123 Main St", "Anytown", "Anystate", "12345", "555-1234", "john.doe@email.com"));

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Edit Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the first name of the contact to edit: ");
                    String nameToEdit = scanner.nextLine();
                    myAddressBook.editContact(nameToEdit);
                    break;
                case 2:
                    System.out.print("Enter the first name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    myAddressBook.deleteContact(nameToDelete);
                    break;
                case 3:
                    myAddressBook.displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}