package lab2;

public class Test {
    public static void main(String[] args) {
        Flight flight = new Flight(200, 3.5);
        flight.fillList(new Flight.Passenger("John", 53, new double[]{12, 16, 22},
                new char[]{'m', 'm', 'l'}));
        flight.fillList(new Flight.Passenger("Ken", 26, new double[]{12, 13}, new char[]{'m', 'm'}));
        flight.fillList(new Flight.Passenger("Kate", 89, new double[]{22, 23, 24},
                new char[]{'l', 'l', 'l'}));
        flight.fillList(new Flight.Passenger("Peter", 40, new double[]{16, 18, 23},
                new char[]{'m', 'm', 'l'}));
        flight.print();
    }
}
