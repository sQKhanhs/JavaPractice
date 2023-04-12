package Shape;

public class TestColorable {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for(int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
        }
    }
}
