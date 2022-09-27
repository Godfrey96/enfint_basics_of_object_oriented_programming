package phone;

import java.util.*;

public class PhoneBook {

    Scanner input = new Scanner(System.in);
//    Contacts contact = new Contacts();
    ArrayList<Contacts> myContact = new ArrayList<Contacts>();

    public PhoneBook(){}

    public void printAction(){
            System.out.println("\nAvailable actions: ");
            System.out.println(
                    "1 - To print all contacts\n" +
                    "2 - To add a new contact\n" +
                    "3 - To query a contact\n" +
                    "4 - To Exit"
            );
            System.out.print("Choose your Action: ");

            int selection = input.nextInt();

            switch (selection){
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
    public void addNewContact(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter contact name: ");
        String name = input.nextLine();
        System.out.print("Enter contact number: ");
        String phone = input.nextLine();

//        Contacts cont = new Contacts(name, phone);

        Contacts cont = Contacts.createContact(name, phone);
        if (newContact(cont)){
            System.out.println("Contact added successfully: " + phone + "-" + name);
        }else{
            System.out.println("Cannot added contact " + phone + ", already exists");
        }
        printAction();
    }

    // method for checking a contact exist before adding a new contact
    public boolean newContact(Contacts contact){
        //check if contact exists before adding a new contact
        if(findContactByPhone(contact.getPhoneNumber()) >= 0){
            System.out.println("Contact already exists.");
            return true;
        }
        // add new contact if does not exist
        myContact.add(contact);
        return true;
    }

    // method displaying list of all contacts
    public void showAllContacts(){
        if(myContact.size() > 0){
            System.out.println("-------------------------------");
            System.out.println("Available Contacts: ");
            for (int i = 0; i < myContact.size(); i++){
                System.out.println(" " + myContact.get(i).getPhoneNumber() + "-" + myContact.get(i).getName());
            }
            System.out.println("-------------------------------");
        }else {
            System.out.println("-------------------------------");
            System.out.println("No contacts found.");
            System.out.println("-------------------------------");
        }
        printAction();
    }

    // find contact position
//    private int findContact(Contacts contact){
//        return myContact.indexOf(contact);
//    }

    // find contact names
    private int findContact(String contactName){
        for (int i = 0; i < myContact.size(); i++){
            Contacts contacts = myContact.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    // find contact phones
    int findContactByPhone(String contactPhone){
        for (int i = 0; i < myContact.size(); i++){
            Contacts contacts = myContact.get(i);
            if (contacts.getPhoneNumber().equals(contactPhone)){
                return i;
            }
        }
        return -1;
    }

    // query contact
//    public String queryContact(Contacts contact){
//        if (findContact(contact) >= 0){
//            return contact.getName();
//        }
//        return null;
//    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if (position >= 0){
            return myContact.get(position);
        }
        return null;
    }

    // search for an existing contact and return array of phone numbers is exists or null if not
    public void searchContact(){
        String phone = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a contact name to query: ");
//        Contacts phoneContact = new Contacts(null, null);
        Contacts phoneContact = new Contacts();
        String name = input.nextLine().toLowerCase();

        phoneContact.setName(name);

        System.out.println("-------------------------------");
        System.out.println(getContact(name));
        System.out.println("-------------------------------");

//        Contacts existContact = queryContact(name);
//
//        if(existContact == null){
//            System.out.println("Contact not found");
//            return;
//        }
//        System.out.println(existContact.getPhoneNumber());
    }

    // query a contact by name and display an array of phone numers
    public ArrayList<Contacts> getAllContacts(){
        return myContact;
    }

    public ArrayList<Contacts> getContact(String name){
        if (myContact.isEmpty()){
            // initialize contact if empty
            getAllContacts();
        }

        ArrayList<Contacts> phones = new ArrayList<>();
        // return contacts based on the contact name from user input
        if (name == null){
            return phones;
        }

        for (Contacts contact : myContact){
            if (contact.getName().equals(name)){
                phones.add(contact);
            }
        }

        return phones;
    }



}
