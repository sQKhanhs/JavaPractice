import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size below 20: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Reenter size");
            }
        } while(size > 20);
        array = new int[size];
        for(int i = 1; i <= size; i++){
            System.out.print("Enter element " + i + ": ");
            array[i-1] = sc.nextInt();
        }
        System.out.printf("%-20s", "Element in array: ","");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

        for(int i = 0, j = size - 1; i < j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.printf("\n%-20s", "Reverse array: ","");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}


