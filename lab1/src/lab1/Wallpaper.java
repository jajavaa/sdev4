package lab1;

public class Wallpaper extends Material {
    private double lengthPerRoll, widthPerRoll;

    public Wallpaper(String name, double price, double lengthPerRoll, double widthPerRoll) {
        super(name, price);
        this.lengthPerRoll = lengthPerRoll;
        this.widthPerRoll = widthPerRoll;
    }

    public double getLengthPerRoll() {
        return lengthPerRoll;
    }

    public double getWidthPerRoll() {
        return widthPerRoll;
    }

    @Override
    public double getReqMaterial(Surface surface) {
        return (surface.calcArea() / (lengthPerRoll * widthPerRoll)) * 0.8 * 4;
    }
}
