package lab1;

public class Paint extends Material {

    private int numCoats;
    private double coverage;

    public Paint(String name, double price, int numCoats, double coverage) {
        super(name, price);
        this.numCoats = numCoats;
        this.coverage = coverage;
    }

    public int getNumCoats() {
        return numCoats;
    }

    public double getCoverage() {
        return coverage;
    }

    @Override
    public double getReqMaterial(Surface surface) {
        return (surface.calcArea() / coverage) * numCoats * 0.8 * 4;
    }
}
