package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Surface testSurface = new Surface("Test", 5.7, 5.7);

        ArrayList<Material> materials = new ArrayList<>();
        materials.add(new Paint("Dulux Soft Sheen", 11.52, 2, 12));
        materials.add(new Paint("Crown White", 10.0, 3,  10));
        materials.add(new Wallpaper("Shand Kydd", 50.0, 10.06, 0.52));
        materials.add(new Flooring("Quick-Step Planked Oak", 65, 1.65));
        materials.add(new Flooring("Elka Classic Walnut", 80, 1.65));

        materials.forEach(material -> System.out.printf("name: %s, requirement: %.2f, price €%.2f%n", material.getName(),
                material.getReqMaterial(testSurface), material.calcTotalPrice(testSurface)));

        Collections.sort(materials, Comparator.comparing(Material::getName));

        System.out.print("\n");
        for (Material material : materials) {
            System.out.printf("Name: %s, Requirement: %.2f, Price €%.2f%n", material.getName(),
                    material.getReqMaterial(testSurface), material.calcTotalPrice(testSurface));
        }
    }
}