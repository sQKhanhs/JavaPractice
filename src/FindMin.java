import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < array.length; index++) {
            System.out.print("Enter element " + index + ": ");
            array[index] = input.nextInt();
        }
        System.out.println("Lowest elements is " + findMin(array));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
