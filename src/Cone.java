/**
 *
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class Cone extends Circular {
    private double height, radius;
    public Cone(double height, double radius) {
        super(height, radius);
    }


    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }

    public double surfaceArea() {
        //double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
    }
}