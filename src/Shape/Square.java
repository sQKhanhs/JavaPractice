package Shape;

public class Square extends Rectangle implements Resizeable{
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public double getSide(){
        return getWidth();
    }
    @Override
    public String toString(){
        return "A square with side " + getSide() + ", which is " + super.toString();
    }
    @Override
    public void resize(double percent) {
        setSide(getSide() * percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
