/**
 * Blueprint to create Cylinder object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class Cylinder extends Circular {

    /**
     * Instantiates Cylinder object.
     * @param height contains height of Cylinder object.
     * @param radius contains radius of Cylinder object.
     */
    public Cylinder(double height, double radius) {
        super(height, radius);
    }

    /**
     * Calculates volume of cylinder.
     * @return double containing volume.
     */
    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

    /**
     * Calculates surface area of cylinder.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
    }
}