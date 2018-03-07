package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        DVDCollection collection = new DVDCollection();

        try {
            Scanner scanner = new Scanner(new File("res", "dvds.txt"));
            StringTokenizer tokenizer;
            while (scanner.hasNextLine()) {
                tokenizer = new StringTokenizer(scanner.nextLine(), ",");
                while (tokenizer.hasMoreTokens()) {
                    String title = tokenizer.nextToken();
                    String genre = tokenizer.nextToken();
                    String year = tokenizer.nextToken();
                    int stock = Integer.valueOf(tokenizer.nextToken());
                    int checkedOut = Integer.valueOf(tokenizer.nextToken());
                    collection.addDvd(title, genre, year, stock, checkedOut);
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner keyboard = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("4")) {
            System.out.println("Please press 1 to rent a dvd");
            System.out.println("Please press 2 if you want to return a dvds");
            System.out.println("Please press 3 to save details to fileS");
            System.out.println("Press 4 to quit");
            choice = keyboard.next();
            switch (choice) {
                case "1":
                    collection.displayDvdList();
                    System.out.print("Input DVD number: ");
                    collection.checkOut(keyboard.nextInt()-1);
                    break;
                case "2":
                    collection.displayDvdList();
                    System.out.print("Input DVD number: ");
                    int dvd = keyboard.nextInt()-1;
                    if (collection.returnDVD(dvd)) {
                        System.out.println("What rating would you give this DVD between 1 and 5");
                        collection.rateDVD(dvd, keyboard.nextDouble());
                    }
                    break;
                case "3":
                    try {
                        PrintWriter printWriter = new PrintWriter(new File("res", "output.txt"));
                        printWriter.printf("%-20s%-15s%-15s%-15s%-15s%-15s%-15s%n", "Title", "Category", "Year", "Quantity",
                                "CheckedOut", "Rating Sum", "Rating Count");
                        printWriter.println(collection);
                        printWriter.close();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
