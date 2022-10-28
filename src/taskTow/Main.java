package taskTow;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 3);
        Circle circle = new Circle(7);
        System.out.println("cylinder area is: " + cylinder.getCylinderArea());
        System.out.println("cylinder radius is: " + cylinder.getRadius());
        System.out.println("cylinder height is: " + cylinder.getHeight());
        System.out.println("circle area is: " + circle.getArea(4));
        System.out.println("circle radius is: " + circle.getRadius());
    }
}
