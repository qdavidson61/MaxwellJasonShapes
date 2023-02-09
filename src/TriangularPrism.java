public class TriangularPrism extends Rectangular{
    private double side1, side2, side3, height;

    public TriangularPrism(double a, double b, double c, double height) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        this.height = height;
    }

    public double volume() {
        double s = (side1 + side2 + side3) / 2;
        double baseArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return baseArea * height;
    }

    public double surfaceArea() {
        double s = (side1 + side2 + side3) / 2;
        double baseArea = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return baseArea * 2 + (side1 + side2 + side3) * height;
    }
}
