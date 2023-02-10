/**
 * Blueprint to create Cone object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class Cone extends Circular {
    private double slantHeight, radius;

    /**
     * Instanties Cone object.
     * @param slantHeight contains height of Cone object.
     * @param radius contains radius of Cone object.
     */
    public Cone(double slantHeight, double radius) {
        super(slantHeight, radius);
    }

    /**
     * Calculates volume of cone.
     * @return double containing volume.
     */
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * slantHeight / 3;
    }

    /**
     * Calculates surface area of cone.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        //double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(slantHeight, 2)));
    }
}