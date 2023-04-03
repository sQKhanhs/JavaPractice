import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Given an equation of a*x + b = c, please enter constants a,b,c:");

        System.out.println("Input a:");
        a = input.nextDouble();
        System.out.println("Input b:");
        b = input.nextDouble();
        System.out.println("Input c:");
        c = input.nextDouble();

        if(a != 0){
            System.out.println("x =" + ((c - b) / a));
        } else if(b == c){
            System.out.println("Equation has infinite solutions");
        } else{
            System.out.println("No solution");
        }
    }
}