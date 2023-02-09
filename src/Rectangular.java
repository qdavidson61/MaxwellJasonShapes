/**
 *
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public abstract class Rectangular implements Shape {
    private double height, length, width;

    public Rectangular(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
}