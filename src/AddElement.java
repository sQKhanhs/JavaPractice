import java.util.Scanner;

public class AddElement {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Which element do you want to add?");
        int x = sc.nextInt();
        System.out.println("At which index?");
        int index = sc.nextInt();
        if (index < 0 || index > array.length){
            System.out.println("Can't add element");
        }

        int[] array2 = new int[array.length - index];
        System.arraycopy(array, index, array2,0, array2.length);
        array[index] = x;
        for(int i = index + 1, j = 0; i < array.length; i++, j++){
            array[i] = array2[j];
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
