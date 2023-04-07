package Rectangle;

public class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String display() {
        return "Rectangle width is " + this.width + " and height is " + this.height;
    }

    public int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public int getArea() {
        return this.width * this.height;
    }

}





