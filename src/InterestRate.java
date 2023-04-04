import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        float money;
        float interest;
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of money:");
        money = sc.nextFloat();
        System.out.println("Enter interest rate % each month:");
        interest = sc.nextFloat() / 100;
        System.out.println("Enter month:");
        month = sc.nextInt();
        for(int i = 0; i < month; i++){
            money += money * interest;
        }
        System.out.println("Total money: " + money);
    }
}
