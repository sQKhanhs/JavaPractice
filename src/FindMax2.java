import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 dimensional array rows: ");
        int x = input.nextInt();
        System.out.println("Enter 2 dimensional array columns: ");
        int y = input.nextInt();
        double array[][] = new double[x][y];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Enter element at row " + row + " column " + column);
                double element = input.nextDouble();
                array[row][column] = element;
            }
        }

        double max = array[0][0];
        for (double[] row : array) {
            for (double column : row) {
                if (column > max) {
                    max = column;
                }
            }
        }
        System.out.println("Highest element is: " + max);
    }
}
