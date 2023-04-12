package Shape;

public class TestResizeable {
    static double getRandom(){
        return (double) Math.random() * 1;
    }
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3,4);
        Circle circle = new Circle(5);
        Square square = new Square(3);
        rectangle.resize(getRandom());
        circle.resize(getRandom());
        square.resize(getRandom());
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(square.getPerimeter());
    }

}

