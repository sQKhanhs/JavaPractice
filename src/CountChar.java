import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = input.nextLine();
        System.out.println("Which letter you want to count?");
        String letter = input.nextLine();
    }
}
