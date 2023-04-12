package Shape;

public class Circle extends Shape implements Resizeable, Colorable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    @Override
    public String toString(){
        return "A circle with radius " + radius + ", which is " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent;
    }

    @Override
    public void howToColor() {
        System.out.println("Color circle's area");
    }
}
