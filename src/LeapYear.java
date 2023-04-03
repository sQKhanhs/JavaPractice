import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;
        System.out.println("Input a year");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
