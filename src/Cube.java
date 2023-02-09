public class Cube extends Rectangular{
    private double length, width, area;
    public Cube(double length, double width){
        this.length = length;
        this.width = width;
        area = length * width;
    }

    public double volume(){
        return Math.pow(area, 3);
    }
    public double surfaceArea(){
        return 6 * Math.pow(area,2);
    }
}
