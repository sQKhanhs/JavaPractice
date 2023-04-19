package Exception;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    public Triangle(int side1, int side2, int side3) throws IllegalTriangleException{
        if(side1 < 0 || side2 < 0 || side3 < 0 || (side1 + side2) < side3){
            throw new IllegalTriangleException("Not a triangle");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    class IllegalTriangleException extends Exception{
        IllegalTriangleException(String s){
            super(s);
        }
    }
    public static void main(String[] args){
        try {
            Triangle triangle = new Triangle(1, 1, 3);
        }
        catch (IllegalTriangleException e){
            System.out.println("Error! " + e);
        }
    }
}
