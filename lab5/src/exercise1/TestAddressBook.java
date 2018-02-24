package exercise1;


import java.util.Scanner;

public class TestAddressBook {

    public static void main(String args[])  {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the owner of address book: ");
        AddressBook a = new AddressBook(in.nextLine());
        a.fillList();
        System.out.println("Address Book belongs to:" + a.getName());
        a.printList();
        System.out.println("Number of male friends are:" + a.calcNumMales());
        System.out.println("Total Contacts:" + AddressBook.getTotalContacts());
    }
}