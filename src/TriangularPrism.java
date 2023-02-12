import java.util.Scanner;

/**
 * Blueprint to create TriangularPrism object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class TriangularPrism  {
    private double base, height, length, hypotenuse;
    /**
     * Instantiates TriangularPrism object.
     * //NOTE: THIS IS FOR A RIGHT TRIANGULAR PRISM ONLY!
     * @param base contains height of triangular prism.
     * @param height contains the base length of triangular prism.
     * @param length contains width of triangular prism.
     */
    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
        hypotenuse = Math.sqrt(Math.pow(height,2) + Math.pow(base,2));
    }

    /**
     * Calculates volume of triangular prism.
     * @return double containing volume.
     */
    public double volume() {
        return 0.5 * base * height * length;
    }

    /**
     * Calculates surface area of triangular prism.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        return (base*height) + ((base + height + hypotenuse) * length);
    }
}