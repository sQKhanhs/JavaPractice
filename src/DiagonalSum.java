import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Enter 2 dimensional array rows: ");
            x = input.nextInt();
            System.out.println("Enter 2 dimensional array columns: ");
            y = input.nextInt();
            if(x != y){
                System.out.println("Please reenter an array with equal rows and columns!");
            }
        } while(x != y);
        int[][] array = new int[x][y];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Enter element at row " + row + " column " + column);
                int element = input.nextInt();
                array[row][column] = element;
            }
        }
        System.out.println("Sum of diagonal is: " + findSum(array, 0));
    }

    public static int findSum(int[][] array, int column) {
        int sum = 0;
        for (int[] row : array) {
            sum += row[column];
            column++;
        }
        return sum;
    }
}
