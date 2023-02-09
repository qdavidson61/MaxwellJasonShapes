public class Cone extends Circular{
    private double radius, slantH;
    public Cone(double radius, double slantH){
        this.radius = radius;
        this.slantH = slantH;
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * (slantH / 3);
    }

    public double surfaceArea(){
        return (Math.PI * radius * (radius + Math.sqrt(Math.pow(slantH, 2) * Math.pow(radius, 2))));
    }
}
