/**
 *
 * @author :
 * @since :
 */

public class RectangularPrism extends Rectangular {
    private double height, length, width;
    public RectangularPrism(double height, double length, double width) {
        super(height, length, width);
    }


    public double volume() {
        return height * length * width;
    }

    public double surfaceArea() {
        return 2 * (length * width + height * length + height * width);
    }
}