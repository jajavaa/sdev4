package lab3;

import java.util.Scanner;

public class TestDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter day: ");
            checkDay(scanner.nextLine());
        } catch (InvalidDayException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Goodbye.");
        }

    }

    private static void checkDay(String day) throws InvalidDayException {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        boolean found = false;
        for (String d: days) {
            if (day.equalsIgnoreCase(d)) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Valid!");
        } else {
            throw new InvalidDayException();
        }
    }

    static class InvalidDayException extends Exception {

        private InvalidDayException() {
            
        }

        @Override
        public String getMessage() {
            return "Invalid day.";
        }
    }
}
