/**
 * Blueprint to create Cone object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class Cone extends Circular {
    private double height, radius;

    /**
     * Instanties Cone object.
     * @param height contains height of Cone object.
     * @param radius contains radius of Cone object.
     */
    public Cone(double height, double radius) {
        super(height, radius);
    }

    /**
     * Calculates volume of cone.
     * @return double containing volume.
     */
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    /**
     * Calculates surface area of cone.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        //double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }
}