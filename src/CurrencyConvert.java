import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        long rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter exchange rate:");
        rate = input.nextLong();

        long usd;
        System.out.println("Enter USD amount:");
        usd = input.nextLong();

        long vnd = usd * rate;
        System.out.println(vnd + " VND");

    }
}
