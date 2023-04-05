import java.util.Scanner;

public class StudentName {
    public static void main(String[] args) {
        String[] array = {"Camila","John","Christian","Michael","Tanya"};
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter student name:");
        name = sc.nextLine();
        boolean found = false;
        int a = 0;
        for(int i = 0; i < array.length; i++){
            if(name.equals(array[i])){
                found = true;
                name = array[i];
                a = i;
                break;
            }
        }
        if (found){
            System.out.print("Position of student " + name + " in the list: " + a);
        } else{
            System.out.print("No student is found");
        }
    }
}
