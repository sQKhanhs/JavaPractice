package Point;

public class MoveablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        this(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array = {xSpeed, ySpeed};
        return array;
    }
    public String toString(){
        return "(" + getX() + ", " + getY() + "), speed = (" + getxSpeed() + ", " + getySpeed() + ")";
    }
    public float[] move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return getXY();
    }
}
