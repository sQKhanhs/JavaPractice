import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        String name;
        Scanner username = new Scanner(System.in);
        System.out.println("Enter username:");
        name = username.nextLine();
        System.out.printf("Hello %s", name);
    }
}
