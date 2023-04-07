import java.util.Scanner;

public class EraseElement {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
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

        int[] array2 = new int[array.length - 1];
        System.arraycopy(array, 0, array2, 0, index);
        System.arraycopy(array, index + 1, array2, index, array2.length - index);
        for(int i: array2){
            System.out.print(i + " ");
        }

        /*for(;index < array.length; index++){
            if(index == array.length - 1){
                array[index] = 0;
            } else{
                array[index] = array[index + 1];
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }*/
    }
}
