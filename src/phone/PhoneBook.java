package phone;

import java.util.*;

public class PhoneBook {

    Scanner input = new Scanner(System.in);
    ArrayList<Contact> myContact = new ArrayList<Contact>();

    public PhoneBook() {
    }

    public void printAction() {
        System.out.println("\nAvailable actions: ");
        System.out.println(
                "1 - To print all contacts\n" +
                        "2 - To add a new contact\n" +
                        "3 - To query a contact\n" +
                        "4 - To Exit");
        System.out.print("Choose your Action: ");

        int selection = input.nextInt();

        switch (selection) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchContact();
                printAction();
                break;
            case 4:
                System.out.println("Good bye!...");
                break;
            default:
                System.out.println("\n" + "Invalid Selection." + "\n");
        }

    }

    // add a new contact
    public void addNewContact() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String name = input.nextLine();
        System.out.print("Enter contact number: ");
        String phone = input.nextLine();

        Contact newCont = new Contact(name, phone);

        newContact(newCont);

        printAction();
    }

    // method for checking a contact exist before adding a new contact
    public boolean newContact(Contact contact) {
        // check if contact exists before adding a new contact
        if (findContactByPhone(contact.getPhoneNumber()) >= 0) {
            System.out.println("Cannot add " + contact.getPhoneNumber() + ", because already exists");
            return true;
        } else {
            System.out.println(contact.displayContact() + ", added successfully");
        }
        // add new contact if does not exist
        myContact.add(contact);
        return true;
    }

    // checking if the input contact number exists in the array
    int findContactByPhone(String contactPhone) {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contacts = myContact.get(i);
            if (contacts.getPhoneNumber().equals(contactPhone)) {
                return i;
            }
        }
        return -1;
    }

    // method displaying list of all contacts
    public void showAllContacts() {
        if (myContact.size() > 0) {
            System.out.println("-------------------------------");
            System.out.println("Available Contacts: ");
            for (int i = 0; i < myContact.size(); i++) {
                System.out.println(" " + myContact.get(i).displayContact());
            }
            System.out.println("-------------------------------");
        } else {
            System.out.println("-------------------------------");
            System.out.println("No contacts found.");
            System.out.println("-------------------------------");
        }
        printAction();
    }

    // find contact names
    private int findContact(String contactName) {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contacts = myContact.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // search for an existing contact and return array of phone numbers is exists or
    // null if not
    public void searchContact() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a contact name to query: ");
        String name = input.nextLine().toLowerCase();
        Contact phoneContact = new Contact(name);

        phoneContact.setName(name);

        Contact existContact = queryContact(name);

        if (existContact == null) {
            System.out.println("-------------------------------");
            System.out.println("No phone numbers found for: " + name);
            System.out.println("-------------------------------");
            return;
        }
        System.out.println("-------------------------------");
        System.out.println("Phone numbers belonging to: " + name);
        getContact(name);
        System.out.println("-------------------------------");
    }

    // query a contact name
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContact.get(position);
        }
        return null;
    }

    // query a contact by name and display an array of phone numers
    public ArrayList<Contact> getAllContacts() {
        return myContact;
    }

    public ArrayList<Contact> getContact(String name) {
        if (myContact.isEmpty()) {
            // initialize contact if empty
            getAllContacts();
        }

        ArrayList<Contact> phones = new ArrayList<>();
        // return contacts based on the contact name from user input
        if (name == null) {
            return phones;
        }

        for (Contact contact : myContact) {
            if (contact.getName().equals(name)) {
                phones.add(contact);
                System.out.println(" " + contact.getPhoneNumber());
            }
        }

        return phones;
    }

}
