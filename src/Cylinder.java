/**
 *
 * @author :
 * @since :
 */

public class Cylinder extends Circular {
    private double radius, height;
    public Cylinder(double height, double radius) {
        super(height, radius);
    }


    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}