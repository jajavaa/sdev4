package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RefuseTruck {

    private int maxBins;
    private double ratePerKg;
    private int binsDeclined, binsCollected;
    private double totalWeight;

    private RefuseTruck(int maxBins, double ratePerKg) {
        this.maxBins = maxBins;
        this.ratePerKg = ratePerKg;
    }

    private int getMaxBins() {
        return maxBins;
    }

    private void collectBin(double weight) throws BinOverWeightException {
        if (weight <= 100 && binsCollected <= maxBins) {
            binsCollected++;
            totalWeight += weight;
        } else {
            binsDeclined++;
            throw new BinOverWeightException();
        }
    }

    private void stats() {
        System.out.printf("No of bins collected: %d bins%n", binsCollected);
        System.out.printf("No. of bins not collected: %d bins%n", binsDeclined);
        System.out.printf("Average Weight of bins collected is: %.2f kg%n", (totalWeight / binsCollected));
        System.out.printf("Average cost of bins collected is €%.2f", (binsCollected * totalWeight / ratePerKg));
    }

    class BinOverWeightException extends Exception {

        BinOverWeightException() {
            super("Bin is over the 100Kg weight - Collection declined");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int max = 0;
        boolean set = false;

        while (!set) {
            try {
                System.out.print("Enter number of bins the truck can collect:");
                max = scanner.nextInt();
                set = true;
            } catch (InputMismatchException e) {
                System.out.println("Error in input");
            }
            scanner.nextLine();
        }

        double price = 0;

        while (set) {
            try {
                System.out.print("Enter cost per kilo:");
                price = scanner.nextDouble();
                set = false;
            } catch (InputMismatchException e) {
                System.out.println("Error in input");
            }
            scanner.nextLine();
        }

        RefuseTruck truck = new RefuseTruck(max, price);

        for (int bin = 0; bin < truck.getMaxBins(); bin++) {
            set = false;
            while (!set) {
                try {
                    System.out.printf("Enter the weight for bin %d :%n", (bin + 1));
                    double collection = scanner.nextDouble();
                    truck.collectBin(collection);
                    set = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error in input");
                } catch (BinOverWeightException e) {
                    System.err.println(e.getMessage());
                }
                scanner.nextLine();
            }
        }
        truck.stats();
    }
}