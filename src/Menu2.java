import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        int choice = 0;
        String draw;
        Scanner sc = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int h = 3; h > 0; h--) {
                        draw = "";
                        for (int w = 5; w > 0; w--) {
                            draw += " * ";
                        }
                        System.out.println(draw);
                    }
                    break;
                case 2:
                    for (int h = 5; h > 0; h--) {
                        draw = "";
                        for (int w = 0; w < h; w++) {
                            draw += " * ";
                        }
                        System.out.println(draw);
                    }
                    break;
                case 3:
                    int w = 1;
                    for(int h = 3; h > 0; h--){
                        draw = "";
                        for(int w1 = 1; w1 < h; w1++){
                            draw += "   ";
                            }
                        for(int w2 = 2; w2 > w; w2--){
                            draw += " * ";
                        }
                        w -= 2;
                        System.out.println(draw);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
