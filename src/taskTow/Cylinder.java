package taskTow;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {}

    public Cylinder(double radius){
        super.radius = radius;
    }
    public Cylinder(double radius, double height) {
        this.height = height;
        super.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getCylinderArea() {
        return 2 * Math.PI * getRadius() * (this.height + getRadius());
    }
}
