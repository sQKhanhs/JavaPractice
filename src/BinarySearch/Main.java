package BinarySearch;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for(int index = 0; index < word.length(); index++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(word.charAt(index));
            for(int index2 = 0; index2 < word.length(); index2++){
                if(word.charAt(index2) > list.getLast()){
                    list.add(word.charAt(index2));
                }
            }
            if(max.size() < list.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(char letter: max)
            System.out.print(letter);
    }
}
