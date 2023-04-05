import java.util.Scanner;

public class FindMax {
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
        System.out.print("Elements in the array: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

        int max = -99999;
        for(int i = 0; i < size; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.printf("%n%-30s","The largest elements in the array is: " + max, "");

    }
}


