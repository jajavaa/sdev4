package exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AddressBook {

    private String owner;
    private ArrayList<Contact> myList = new ArrayList<>();
    private static int totalContacts = 0;

    AddressBook(String owner) {
        this.owner = owner;
    }

    public void fillList() {
        try {
            File file = new File("files", "contacts.txt");
            System.out.println(file.getAbsolutePath());
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                myList.add(new Contact(in.nextLine(), in.nextLine().toCharArray()[0], in.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }

    public void printList() {
        for (Contact aMyList : myList) {
            aMyList.printContact();
        }

    }

    public int calcNumMales() {
        int numMales = 0;
        for (Contact aMyList : myList) {
            if (aMyList.gender == 'm') {
                numMales++;
            }
        }
        return numMales;
    }

    public String getName() {
        return owner;
    }

    public static int getTotalContacts() {
        return totalContacts;
    }

    class Contact {

        private String name;
        private char gender;
        private String mobile;

        Contact(String name, char gender, String mobile) {
            this.name = name;
            this.mobile = mobile;
            this.gender = gender;
            totalContacts++;
        }

        void printContact() {
            System.out.println(name + "," + gender + "," + mobile);
        }
    }
}