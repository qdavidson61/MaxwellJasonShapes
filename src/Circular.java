/**
 * Creates circular object guidelines.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 * @version : 1.0
 */

public abstract class Circular implements Shape {
    private double height, radius;

    /**
     * Instantiates basic Circular object.
     * @param height contains height of basic Circular object.
     * @param radius contains radius of basic Circular object.
     */
    public Circular(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public abstract double volume();
    public abstract double surfaceArea();
    /**
     * Returns height of circular object.
     * @return double height of object.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns radius of circular object.
     * @return double radius of object.
     */
    public double getRadius() {
        return radius;
    }
}