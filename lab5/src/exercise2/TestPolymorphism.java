package exercise2;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TestPolymorphism {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,###.##");
        ArrayList<Material> materials = new ArrayList<>();
        Surface aSurface = new Surface("testSurface", 5.7, 5.7);
        paints(materials);
        wallpapers(materials);
        flooring(materials);
        for (Material material : materials) {
            String name = material.getName();
            double req = material.getMaterialReq(aSurface);
            double price = material.calcTotalPrice(aSurface);
            System.out.println("Name: " + name + ", Requirement: "
                    + f.format(req) + " units, Price €" + f.format(price));
            System.out.println();
        }
    }

    private static void paints(ArrayList<Material> materials) {
        try {
            Scanner scanner = new Scanner(new File("files", "paint.txt"));
            while (scanner.hasNextLine()) {
                String[] object = scanner.nextLine().split(",");
                assert object.length == 4;
                materials.add(new Paint(object[0], Double.valueOf(object[1]), Integer.valueOf(object[2]),
                        Double.valueOf(object[3])));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void wallpapers(ArrayList<Material> materials) {
        try {
            Scanner scanner = new Scanner(new File("files", "wallpaper.txt"));
            while (scanner.hasNextLine()) {
                String[] object = scanner.nextLine().split(",");
                if( object.length != 4) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                materials.add(new Wallpaper(object[0], Double.valueOf(object[1]), Double.valueOf(object[2]),
                        Double.valueOf(object[3])));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void flooring(ArrayList<Material> materials) {
        try {
            Scanner scanner = new Scanner(new File("files", "flooring.txt"));
            while (scanner.hasNextLine()) {
                String[] object = scanner.nextLine().split(",");
                if( object.length != 3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                materials.add(new Flooring(object[0], Double.valueOf(object[1]), Double.valueOf(object[2])));
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}