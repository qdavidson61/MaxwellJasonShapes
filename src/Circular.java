/**
 *
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public abstract class Circular implements Shape {
    private double height, radius;

    public Circular(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
}