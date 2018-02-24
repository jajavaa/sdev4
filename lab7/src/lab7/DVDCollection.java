package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static lab7.DVD.OutOfStockException;

public class DVDCollection {

    private ArrayList<DVD> dvds = new ArrayList<>();

    public void addDvd(String title, String category, String year, int stock, int checkedOut) {
        dvds.add(new DVD(title, category, year, stock, checkedOut));
    }

    public void checkOut(int number) {
        try {
            dvds.get(number).checkOut();
        } catch (OutOfStockException e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean returnDVD(int number) {
        return dvds.get(number).returnDVD();
    }

    public void rateDVD(int number, double rating) {
        dvds.get(number).rateDvd(rating);
    }

    private DVD mostPopular() {
        return Collections.max(dvds, Comparator.comparing(DVD::getAverageRating));
    }

    public void displayDvdList() {
        System.out.println("dvds");
        for (int i = 0; i < dvds.size(); i++) {
            System.out.printf("DVD Number: %d %s%n", (i+1), dvds.get(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (DVD dvd : dvds) {
            sb.append(String.format("%-20s%-15s%-15s%-15d%-15d%-15.2f%-15d%nAverage rating for this dvd is: " +
                            "%.1f%n", dvd.getTitle(), dvd.getCategory(), dvd.getYear(), dvd.getStock(),
                    dvd.getCheckedOut(), dvd.getRatingTotal(), dvd.getRatingCount(), dvd.getAverageRating()));
        }
        sb.append(String.format("Most popular dvd is: %s", mostPopular().getTitle()));
        return sb.toString();
    }
}