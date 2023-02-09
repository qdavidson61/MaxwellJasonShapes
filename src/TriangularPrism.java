/**
 *
 * @author :
 * @since :
 */

public class TriangularPrism extends Rectangular {
    private double height, base, width;
    public TriangularPrism(double height, double base, double width) {
        super(height, base, width);
    }

    @Override
    public double volume() {
        return height * (base * width) / 2;
    }

    @Override
    public double surfaceArea() {
        double triangleArea = (base * width) / 2;
        return triangleArea * 2 + height * base + height * width;
    }
}