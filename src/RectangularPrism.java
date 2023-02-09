public class RectangularPrism extends Rectangular{
    private double height, width, length;

    public RectangularPrism(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double volume() {
        return height * width * length;
    }

    public double surfaceArea() {
        return 2 * (height * width + height * length + width * length);
    }
}
