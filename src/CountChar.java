import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = input.nextLine();
        text = text.toLowerCase();
        System.out.println("Which letter you want to count?");
        char letter = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("Letter counted: " + count);
    }
}
