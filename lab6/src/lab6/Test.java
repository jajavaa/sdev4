package lab5;

public class Test {
    public static void main(String[] args) {
        Race race = new Race(100, "Olympics 2017");
        race.addRunners();
        System.out.println(race);
        race.favorite();
    }
}
