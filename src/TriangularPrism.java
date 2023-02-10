/**
 * Blueprint to create TriangularPrism object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class TriangularPrism extends Rectangular {
    private double height, length, width;

    /**
     * Instantiates TriangularPrism object.
     * @param height contains height of triangular prism.
     * @param length contains the base length of triangular prism.
     * @param width contains width of triangular prism.
     */
    public TriangularPrism(double height, double length, double width) {
        super(height, length, width);
    }

    /**
     * Calculates volume of triangular prism.
     * @return double containing volume.
     */
    public double volume() {
        return height * (length * width) / 2;
    }

    /**
     * Calculates surface area of triangular prism.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        //double triangleArea = (base * width) / 2;
        return (length * width) / 2 * 2 + height * length + height * width;
    }
}