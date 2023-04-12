package Shape;

public class Rectangle extends Shape implements Resizeable, Colorable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }
    public double getArea(){
        return width * length;
    }
    @Override
    public String toString(){
        return "A rectangle with width " + width + " and length " + length + ", which is " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length = this.length * percent;
        this.width = this.width * percent;
    }

    @Override
    public void howToColor() {
        System.out.println("Color rectangle's area");
    }
}
