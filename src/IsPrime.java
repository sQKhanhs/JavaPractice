import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int number;
        boolean isPrime = true;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i = 2; i < number; i++ ){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime || number == 2){
            System.out.println(number + " is a prime number");
        } else{
            System.out.println(number + " is not a prime number");
        }
    }
}
