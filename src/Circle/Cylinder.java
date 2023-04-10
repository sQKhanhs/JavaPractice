package Circle;

public class Cylinder extends Circle{
    private double height = 3.0;
    Cylinder(){
    }
    Cylinder(double height){
        this.height = height;
    }
    Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return height * getArea();
    }

    @Override
    public String toString() {
        return "This is a cylinder with height = " + getHeight() + " and base circle's radius = " + getRadius();
    }
}
