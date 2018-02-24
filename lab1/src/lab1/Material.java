package lab1;

public abstract class Material {

    private String name;
    private double price;

    public Material(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double getReqMaterial(Surface surface);

    public double calcTotalPrice(Surface surface) {
        return getReqMaterial(surface) * price;
    }
}
