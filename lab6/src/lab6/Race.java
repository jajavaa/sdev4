package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Race {

    private int distance;
    private String competition;
    private ArrayList<Athlete> athletes = new ArrayList<>();

    Race(int distance, String competition) {
        this.distance = distance;
        this.competition = competition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        athletes.forEach(sb::append);
        return String.format("Race: %s   Distance: %dm%n%n%s", competition, distance, sb.toString());
    }

    public void addRunners() {
        try {
            Scanner scanner = new Scanner(new File("res", "athletes.txt"));
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                String country = scanner.nextLine();
                double a = Double.valueOf(scanner.nextLine());
                double b = Double.valueOf(scanner.nextLine());
                double c = Double.valueOf(scanner.nextLine());
                athletes.add(new Athlete(name, country, a, b, c));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void favorite() {
        Athlete favorite = null;
        double max = Double.MAX_VALUE;
        double average;
        for (Athlete athlete : athletes) {
            if((average = athlete.average()) < max) {
                max = average;
                favorite = athlete;
            }
        }
        assert favorite != null;
        System.out.printf("The favourite for race is: %s  from %s  Average Time: %.2f", favorite.name, favorite.country,
                favorite.average());
    }

    private class Athlete {

        private String name, country;
        private double[] times;

        private Athlete(String name, String country, double... times) {
            this.name = name;
            this.country = country;
            this.times = times;
        }

        private double average() {
            double total = 0.0;
            for (double time : times) {
                total += time;
            }
            return total / times.length;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("Athlete Name: %s%n" +
                    "Country: %s%n", name, country));
            for (int i = 0; i < times.length; i++) {
                sb.append(String.format("Time %d: %.2f   ", (i+1), times[i]));
            }
            sb.append(String.format(
                    "%nAverage Time: %.2f%n", average()));
            return sb.toString();
        }
    }
}