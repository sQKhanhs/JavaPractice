import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args){
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    double f;
                    f = sc.nextFloat();
                    System.out.println("Celsius: " + fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    double c;
                    c = sc.nextFloat();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
                    break;
                case 3:
                    System.exit(0);
            }
        } while(choice != 3);
    }

    public static double fahrenheitToCelsius(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static double celsiusToFahrenheit(double c) {
        double f = (c * 9) / 5.0 + 32;
        return f;
    }

}
