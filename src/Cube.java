/**
 * Blueprint to create Cube object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class Cube extends RectangularPrism {

    /**
     * This instantiates Cube object.
     * @param side is the side length of cube.
     */
    public Cube(double side) {
        super(side, side, side);
    }

    /**
     * Calculates volume of cube.
     * @return double containing volume.
     */
    public double volume() {
        return Math.pow(getHeight(), 3);
    }

    /**
     * Calculates surface area of cube.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        return 6 * Math.pow(getHeight(), 2);
    }
}