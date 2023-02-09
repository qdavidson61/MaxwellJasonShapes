/**
 *
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class TriangularPrism extends Rectangular {
    private double height, base, width;
    public TriangularPrism(double height, double base, double width) {
        super(height, base, width);
    }


    public double volume() {
        return height * (base * width) / 2;
    }

    public double surfaceArea() {
        //double triangleArea = (base * width) / 2;
        return (base * width) / 2 * 2 + height * base + height * width;
    }
}