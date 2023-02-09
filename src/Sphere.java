public class Sphere extends Circular{
    private double radius;

    public double volume(){
        return 4.0/3 * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea(){
        return 4.0 * Math.pow(radius, 2);
    }
}
