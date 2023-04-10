package Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    public String toString(){
        return "This is a circle with radius = " + getRadius();
    }
}
