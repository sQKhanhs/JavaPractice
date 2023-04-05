import java.util.Scanner;

public class PrimeNumber100 {
    public static void main(String[] args) {
        for(int i = 2; i < 100; i++){
            boolean isPrime = true;
            for(int y = 2; y < i; y++){
                if(i % y == 0 && i != 2){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
