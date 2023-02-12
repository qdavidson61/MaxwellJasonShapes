/**
 * Blueprint to create Sphere object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 * @version : 1.0
 */

public class Sphere extends Circular {

    /**
     * Instantiates Sphere object.
     * @param radius contains radius of sphere.
     */
    public Sphere(double radius) {
        super(0, radius);
    }

    /**
     * Calculates volume of sphere.
     * @return double containing volume.
     */
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    /**
     * Calculates surface area of sphere.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
}