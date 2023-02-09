/**
 *
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class Cube extends Rectangular {
    private double height, length, width;
    public Cube(double side) {
        super(side, side, side);
    }


    public double volume() {
        return Math.pow(height, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(height, 2);
    }
}