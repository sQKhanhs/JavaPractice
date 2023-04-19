package Exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random number = new Random();
        Integer[] list = new Integer[100];
        for(int index = 0; index < list.length; index++){
            list[index] = number.nextInt(100);
        }
        return list;
    }
    public static void main(String[] args){
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter index to find value: ");
        int index = input.nextInt();
        try {
            System.out.println("Value at index " + index + " is " + arr[index]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index exceed array length!");
        }
    }
}
