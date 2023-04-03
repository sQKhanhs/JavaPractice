import java.util.Scanner;

public class MonthDay {
    public static void main(String[] args) {
        int month;
        System.out.println("Which month do you want to count days: ");
        Scanner input = new Scanner(System.in);
        month = input.nextInt();

        switch (month){
            case 2:
                System.out.println("28 or 29 days");
                break;
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("30 days");
        }
    }
}
