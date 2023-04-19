package Exception;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args){
        CalculatorExample calculatorExample = new CalculatorExample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Enter y: ");
        int y = input.nextInt();
        calculatorExample.calculate(x, y);
    }
    public void calculate(int x, int y) {
        try {
            int sum = x + y;
            int subtract = x - y;
            int multi = x * y;
            int div = x / y;
            System.out.println("x + y = " + sum);
            System.out.println("x - y = " + subtract);
            System.out.println("x * y = " + multi);
            System.out.println("x / y = " + div);
        }
        catch (RuntimeException e){
            System.out.println("Error! " + e.getMessage());
        }
        finally {
            System.out.println("End calculation process");
        }
    }
}
