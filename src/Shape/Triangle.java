package Shape;

public class Triangle extends Shape {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    double height;

    Triangle() {
    }

    Triangle(double side1, double side2, double side3, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        if (side2 > side1 && side2 > side3) {
            return (side2 * height) / 2;
        } else if (side1 > side3 && side1 > side2) {
            return (side1 * height) / 2;
        } else {
            return (side3 * height) / 2;
        }
    }

    @Override
    public String toString() {
        return "This is a triangle with side 1 " + side1 + " side 2 " + side2 + " side3 " + side3 + " which is " + super.toString();
    }
}
