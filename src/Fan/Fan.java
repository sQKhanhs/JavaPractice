package Fan;


public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = this.slow;

    private boolean on = true;

    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void isOn() {
        this.on = true;
    }

    public void isOff() {
        this.on = false;
    }

    public String toString(){
        if(this.on == true){
            return "Fan speed: " + getSpeed() + ", color " + getColor() + ", radius " + getRadius() + ". Fan is on";
        } else{
            return "Fan color: " + getColor() + ", radius " + getRadius() + ". Fan is off";
        }
    }
}
