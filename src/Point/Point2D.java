package Point;

public class Point2D {
    private float x;
    private float y;
    Point2D(){
    }
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array = new float[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }
    public String toString(){
        return "(" + getX() + ", " + getY() + ")";
    }
}
