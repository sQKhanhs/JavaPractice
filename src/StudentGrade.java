import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int index = 0; index < array.length; index++){
            System.out.print("Enter grade of student " + (index + 1) + ": ");
            array[index] = input.nextInt();
        }

        System.out.print("List of grade: ");
        for(int grade: array){
            System.out.print(grade + " ");
        }

        int passedCount = 0;
        for(int grade: array){
            if(grade >= 5){
            passedCount++;
            }
        }

        System.out.printf("%n%-20s","Number of student passed: " + passedCount);
    }
}
