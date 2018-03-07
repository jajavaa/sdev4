package lab1;

public class Flooring extends Material {

    private double coveragePerPack;

    public Flooring(String name, double price, double coveragePerPack) {
        super(name, price);
        this.coveragePerPack = coveragePerPack;
    }

    public double getCoveragePerPack() {
        return coveragePerPack;
    }

    @Override
    public double getReqMaterial(Surface surface) {
        return surface.calcArea() / coveragePerPack;
    }
}
