import java.util.Scanner;

public class EraseElement {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,0,7};
        System.out.println("Which element do you want to remove?");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(x == array[i]){
                index = i;
                break;
            }
        }

        for(;index < array.length; index++){
            if(index == array.length - 1){
                array[index] = 0;
            } else{
                array[index] = array[index + 1];
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
