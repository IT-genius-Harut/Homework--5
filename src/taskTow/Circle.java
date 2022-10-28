package taskTow;

public class Circle {
    protected double radius;
    protected String colour;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return  radius;
    }
    public double getArea(double radius){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "The circle radius is: " + radius + " colour is: " + colour;
    }
}
