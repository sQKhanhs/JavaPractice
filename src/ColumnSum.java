import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 dimensional array rows: ");
        int x = input.nextInt();
        System.out.println("Enter 2 dimensional array columns: ");
        int y = input.nextInt();
        int[][] array = new int[x][y];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Enter element at row " + row + " column " + column);
                int element = input.nextInt();
                array[row][column] = element;
            }
        }
        System.out.println("Which column do you want to sum: ");
        int column = input.nextInt();
        System.out.println("Sum of column is: " + findSum(array, column));
    }

    public static int findSum(int[][] array, int column){
        int sum = 0;
        for(int[] row: array){
            sum += row[column];
        }
        return sum;
    }

}
