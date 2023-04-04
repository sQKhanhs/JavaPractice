import java.util.Scanner;

public class CommonFactor {

    public static void main(String[] args) {
        int a;
        int b;
        int t;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a > 0) {
           t = b % a;
           b = a;
           a = t;
        }
        System.out.println("Greatest common factor: " + b);
    }
}
