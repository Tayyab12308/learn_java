import java.util.*;

public class Contacts {

    List<String> contacts = new ArrayList<>();

    public void addContact(String name) {
        if (getContactPosition(name) < 0) {
            contacts.add(name);
        } else {
            System.out.println("Contact already exists");
        }
    }

    public void editContact(String name, String newName) {
        int position = getContactPosition(name);
        if (position >= 0) {
            contacts.set(position, newName);
        }
    }

    public void deleteContact(String name) {
        int position = getContactPosition(name);
        if (position >= 0) {
            contacts.remove(position);
        }
    }

    private int getContactPosition(String name) {
        return contacts.indexOf(name);
    }

    public void printContacts() {
        System.out.println(contacts);
    }

}
