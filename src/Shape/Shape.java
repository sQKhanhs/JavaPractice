package Shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    Shape(){
    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        if(filled == true){
            return "a shape with color " + color + " and filled";
        } else{
            return "a shape with color " + color + " and not filled";
        }
    }
}

