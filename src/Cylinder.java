public class Cylinder extends Circular{
    private double radius, height;

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }
}
