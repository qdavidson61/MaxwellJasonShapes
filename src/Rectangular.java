/**
 * Creates rectangular object guidelines.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 * @version : 1.0
 */

public abstract class Rectangular implements Shape {
    private double height, length, width;

    /**
     * This instantiates Rectangular object.
     * @param height is basic height of rectangular object.
     * @param length is basic length of rectangular object.
     * @param width is basic width of rectangular object.
     */
    public Rectangular(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    /**
     * Returns height of rectangular object.
     * @return double height of object.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns length of rectangular object.
     * @return double length of object.
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns width of rectangular object.
     * @return double width of object.
     */
    public double getWidth() {
        return width;
    }

}