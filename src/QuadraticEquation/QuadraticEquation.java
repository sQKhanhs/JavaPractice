package QuadraticEquation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b, 2) - (4 * a * c);
    }

    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
