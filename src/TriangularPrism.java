public class TriangularPrism extends Rectangular{
    private double a, b, c, height;

    public TriangularPrism(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public double volume() {
        double s = (a + b + c) / 2;
        double baseArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return baseArea * height;
    }

    public double surfaceArea() {
        double s = (a + b + c) / 2;
        double baseArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return baseArea * 2 + (a + b + c) * height;
    }
}
