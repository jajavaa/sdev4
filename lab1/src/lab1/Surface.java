package lab1;

public class Surface {

    private String name;
    private double length, width;

    public Surface(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calcArea() {
        return length * width;
    }
}
