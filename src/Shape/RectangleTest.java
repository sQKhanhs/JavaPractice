package Shape;

public class RectangleTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        Rectangle rectangle1 = (Rectangle) rectangle;
        System.out.println(rectangle1.getArea());
    }
}
