package Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
