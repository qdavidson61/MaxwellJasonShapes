public class Sphere extends Circular {
    private double radius;
    public Sphere(double radius) {
        super(0, radius);
    }


    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}