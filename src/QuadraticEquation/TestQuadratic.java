package QuadraticEquation;

import java.util.Scanner;

public class TestQuadratic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if(equation.getDiscriminant() > 0){
            System.out.println("Equation has two roots");
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        } else if(equation.getDiscriminant() == 0){
            System.out.println("Equation has one root");
            System.out.println("Root: " + equation.getRoot1());
        } else{
            System.out.println("Equation has no roots");
        }
    }
}
