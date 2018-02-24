package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Flight {

    private int capacity;
    private double duration;

    private ArrayList<Passenger> passengers = new ArrayList<>();

    Flight(int capacity, double duration) {
        this.capacity = capacity;
        this.duration = duration;
    }

    void fillList(Passenger passenger) {
        capacity--;
        passengers.add(passenger);
    }

    void print() {
        for(Passenger passenger: passengers) {
            System.out.printf("%s %d Baggage Charge:%.2f%n", passenger.name, passenger.age,
                    passenger.calcBaggageCharge());
        }
        System.out.print("\n");
        System.out.printf("Number of seats available:%d%nDuration:%.1f%n", capacity, duration);
        Passenger oldest = Collections.max(passengers, Comparator.comparing(Passenger::getAge));
        System.out.printf("Oldest person on the flight is:%s age:%d", oldest.name, oldest.age);
    }

    static class Passenger implements Bag{

        private String name;
        private int age;
        private double[] bagWeight;
        private char[] bagSize;

        Passenger(String name, int age, double[] bagWeight, char[] bagSize) {
            this.name = name;
            this.age = age;
            this.bagWeight = bagWeight;
            this.bagSize = bagSize;
        }

        int getAge() {
            return age;
        }

        private double calcBaggageCharge() {
            double charge = 0.0;
            for (int i = 0; i < bagSize.length; i++) {
                switch (bagSize[i]) {
                    case MEDIUM:
                        if(bagWeight[i] <= MEDIUM_WEIGHT) {
                            charge += MEDIUM_CHARGE;
                        } else {
                            charge += ((bagWeight[i] - MEDIUM_WEIGHT) * OVERWEIGHT_CHARGE) + MEDIUM_CHARGE;
                        }
                        break;
                    case LARGE:
                        if(bagWeight[i] <= LARGE_WEIGHT) {
                            charge += LARGE_CHARGE;
                        } else {
                            charge += ((bagWeight[i] - LARGE_WEIGHT) * OVERWEIGHT_CHARGE) + LARGE_CHARGE;
                        }
                        break;
                }
            }
            return charge;
        }
    }

    private interface Bag {

        char MEDIUM = 'm', LARGE = 'l';
        double MEDIUM_WEIGHT = 15.0, LARGE_WEIGHT = 20.0;
        double MEDIUM_CHARGE = 30.0, LARGE_CHARGE = 40.0;
        double OVERWEIGHT_CHARGE = 10.0;
	
    }
}