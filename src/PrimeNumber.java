import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        int count = 0;
        System.out.println("Enter the number of prime number you want to find:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i = 2; count < number; i++){
            boolean isPrime = true;
            for(int y = 2; y < i; y++){
                if(i % y == 0 && i != 2){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
                count++;
            }
        }
    }
}
