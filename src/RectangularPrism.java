/**
 * Blueprint to instantiate RectangularPrism object.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 * @version : 1.0
 */

public class RectangularPrism extends Rectangular {
    /**
     * Instantiates RectangularPrism object.
     * @param height contains height of rectangular prism.
     * @param length contains length of rectangular prism.
     * @param width contains width of rectangular prism.
     */
    public RectangularPrism(double height, double length, double width) {
        super(height, length, width);
    }

    /**
     * Calculates volume of rectangular prism.
     * @return double containing volume.
     */
    public double volume() {
        return getHeight() * getLength() * getWidth();
    }

    /**
     * Calculates surface area of rectangular prism.
     * @return double containing surface area.
     */
    public double surfaceArea() {
        return 2 * (getLength() * getWidth() + getHeight() * getLength() + getHeight() * getWidth());
    }
}